package com.tulun.blog.mapper;


import com.tulun.blog.model.Article;
import com.tulun.blog.model.Tag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ArticleMapper {

	public int addArticle(Article article);

	public Article selectArticleById(Long id);

	public int addArticleTag(Article article);

	public int updateShowCount(Long id);

	public List<Article> categoryArticle(Article article);

    public Integer selectArticlePapeCount(HashMap<String, Object> param);

	public List<Article> selectArticlePape(HashMap<String, Object> param);

	public int updateStatus(Article article);

}
