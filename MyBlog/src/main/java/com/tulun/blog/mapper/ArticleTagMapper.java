package com.tulun.blog.mapper;

import com.tulun.blog.model.ArticleTag;

import java.util.List;

public interface ArticleTagMapper {
    public List<ArticleTag> selectArticleTagByArticleId(Integer articleId);
}
