package com.tulun.blog.controller;

import com.tulun.blog.model.*;
import com.tulun.blog.service.ArticleService;
import com.tulun.blog.service.CategoryService;
import com.tulun.blog.service.TagService;
import com.tulun.blog.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;
import com.tulun.blog.utils.Pager;

@Controller
public class ArticleController {
    @Autowired
    TagService tagService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    ArticleService articleService;

    @RequestMapping("/add")
    public String add(HttpSession session, Model model){
        ModelAndView modelAndView = new ModelAndView();

        //先验证用户是否登录，如果没有登录，则跳转到登录页面
        Manager manager = (Manager) session.getAttribute("userInfo");
        if (manager == null) {
            //用户没有登录
            return "redirect:/manager/login";
        }

        //博客类别即标签
        List <Tag> allTags = tagService.getAllTags();
        List <Category> allCategorys = categoryService.getAllCategorys();
        model.addAttribute("tagList", allTags);
        model.addAttribute("categoryList",allCategorys);


        return "/article/addarticle";
    }

    @RequestMapping("/addarticle")
    public @ResponseBody Result addArticle(String param, String content, String description, HttpSession session) throws UnsupportedEncodingException {
        param = URLDecoder.decode(param,"utf-8");
        content = URLDecoder.decode(content,"utf-8");
        description = URLDecoder.decode(description,"utf-8");
        System.out.println("增加博客："+description+"\n"+content+"\n"+param);
        //manager存在
        Manager manager = (Manager) session.getAttribute("userInfo");

        Article article = JsonUtil.fromJson(param, Article.class);
        //类别id,标题
        article.setContent(content);
        article.setDescription(description);
        article.setCreateTime(new Date());
        //作者
        article.setAuthor(manager.getUserName());
        articleService.addArticle(article);

        //存入到数据库

        return new Result("success", "保存成功");
    }

    @RequestMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable("id") long id) {
        //可自行考虑传输id无效时如何处理
        //假设id有效
        Article article = articleService.getArticleById(id);

        //每一次的请求该方法，相当于浏览量+1
        articleService.increShowCount(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/article/articledetail");
        modelAndView.addObject("article", article);
        return modelAndView;
    }


//    后台列表页面
    @RequestMapping("/articlelist")
    public String articleList(Model model) {

        model.addAttribute("categoryList",categoryService.getAllCategorys());
        model.addAttribute("tagList",tagService.getAllTags());

        return "/article/articlelist";
    }

    //后端列表数据的加载
    @RequestMapping("/article/load")
    public String  backLoad(Model model,String param,Pager<Article> page) throws UnsupportedEncodingException {
        Article article = JsonUtil.fromJson(param, Article.class);
        if (article.getTitle() != null) {
            article.setTitle(URLDecoder.decode(article.getTitle(),"utf-8"));
        }

        List <Article> articles = articleService.articlePape(article, page);
        model.addAttribute("articleList",articles);


        return "/article/articlepagerlist";
    }

    //更新文章可见的状态
    @RequestMapping("updatestatus")
    public @ResponseBody Result updataStatus(Integer id,int statue){

        //更新数据状态
        boolean statu = articleService.updataStatu(id, statue);
        if (statu) {
            return new Result("success","状态更新成功");
        } else {
            return new Result("fail","状态更新失败");
        }

    }




}
