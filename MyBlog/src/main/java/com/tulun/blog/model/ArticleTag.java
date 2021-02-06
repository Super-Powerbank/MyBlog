package com.tulun.blog.model;

public class ArticleTag {
    private Integer articleId;
    private Integer tagId;
    private String tagName;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"articleId\":")
                .append(articleId);
        sb.append(",\"tagId\":")
                .append(tagId);
        sb.append(",\"tagName\":\"")
                .append(tagName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
