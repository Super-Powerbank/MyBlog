package com.tulun.blog.controller;

import com.tulun.blog.model.Article;
import com.tulun.blog.service.ArticleService;
import com.tulun.blog.service.CategoryService;
import com.tulun.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    TagService tagService;

    @Autowired
    ArticleService articleService;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("tagList",tagService.getAllTags());
        model.addAttribute("categoryList",categoryService.getAllCategorys());
        return "/home/home";
    }

    @RequestMapping("/loadPage/{id}")
    public String loadPage(@PathVariable("id") Long categoryId,Model model) {

        //通过categoryId类分类获取，注意：当categoryId=-1特殊值，需要获取所有的数据
        List <Article> articles = articleService.ArticleByCategory(categoryId);

        model.addAttribute("articleList",articles);
        return "/home/articlepager";
    }

    @RequestMapping("/loadPage1/{id}")
    public String loadPage1(@PathVariable("id") Long categoryId,Model model) {

        List <Article> articles = articleService.ArticleByCategory(categoryId);

        model.addAttribute("tagList",tagService.getAllTags());
        model.addAttribute("ca",categoryService.getCategoryById(categoryId));
        model.addAttribute("articleList",articles);
        model.addAttribute("categoryList",categoryService.getAllCategorys());
        return "/home/articlepager1";
    }
}
