package com.tulun.blog.service;

import com.tulun.blog.mapper.ArticleMapper;
import com.tulun.blog.mapper.ArticleTagMapper;
import com.tulun.blog.mapper.CategoryMapper;
import com.tulun.blog.model.Article;
import com.tulun.blog.model.ArticleTag;
import com.tulun.blog.model.Category;
import com.tulun.blog.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.tulun.blog.utils.Pager;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    ArticleTagMapper articleTagMapper;

    public int addArticle(Article article){
        //数据记录到article表中
        System.out.println("插入数据前："+article);
        int i = articleMapper.addArticle(article);
        //article和标签的对应表 新增数据是自定id在插入成功后会自动填充到插入对象上
        System.out.println("插入数据后："+article);

        //当前插入标签可以为多个，采用循环插入形式
        for (Tag tag :article.getTagList()) {
            article.setTagId(tag.getId());
            articleMapper.addArticleTag(article);
        }

        return i;
    }

    public Article getArticleById(long id){
        Article article = articleMapper.selectArticleById(id);
        //获取类别名称
        Category category = categoryMapper.selectCategoryById(article.getCategoryId());
        article.setCategoryName(category.getCategoryName());

        //将Date类型的数据转化为String类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月DD日HH时mm分ss秒");
        String time = simpleDateFormat.format(article.getCreateTime());
        article.setTime(time);

        return article;
    }

    //更新浏览量
    public void increShowCount(long articleId){
        articleMapper.updateShowCount(articleId);
    }

    //按类别加载
    public List<Article> ArticleByCategory(Long categoryId){
        Article article = new Article();
        article.setCategoryId(categoryId);
        //对每一个文章信息需要处理时间、处理便签、处理类别名

        ArrayList <Article> result = new ArrayList <>();
        List <Article> articles = articleMapper.categoryArticle(article);
        //将Date类型的数据转化为String类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月DD日HH时mm分ss秒");
        for (Article article1:articles) {
            //处理时间格式
            article1.setTime(simpleDateFormat.format(article1.getCreateTime()));
            //处理文章所属类别
            article1.setCategoryName(categoryMapper.selectCategoryById(article1.getCategoryId()).getCategoryName());
            //获取文章标签
            List <ArticleTag> tags = articleTagMapper.selectArticleTagByArticleId(article1.getId());
//            System.out.println("标签："+tags);
            article1.setaTagList(tags);

            result.add(article1);
        }

        return result;
    }

    //通过分页来查询符合要求的数据
    public List<Article> articlePape(Article article ,Pager pager) {
        List <Article> articles = new ArrayList <>();

        HashMap <String, Object> hashMap = new HashMap <>();
        hashMap.put("article", article);
        Integer papeCount = articleMapper.selectArticlePapeCount(hashMap);

        //设置页面的总量
        pager.setTotalCount(papeCount);

        if (papeCount > 0) {
            //获取的数据包含标题，类别id，tagId

            //处理分页问题
            hashMap.put("start", pager.getStart());
            hashMap.put("limit",pager.getLimit());

            articles = articleMapper.selectArticlePape(hashMap);
        }

        /**
         * 返回的文章需要特别处理获取指定格式时间和当前文章的类别
         * 第一种方案：获取article表中数据，再次分别查t_category表来处理
         * 第二种方案：在数据库多表联合查询处理
         */

        return articles;
    }

    public boolean updataStatu(Integer id, int statue){
        Article article = new Article();
        article.setId(id);
        article.setStatue(statue);

        int status = articleMapper.updateStatus(article);
        if (status > 0) {
            return  true;
        } else {
            return false;
        }
    }
}
