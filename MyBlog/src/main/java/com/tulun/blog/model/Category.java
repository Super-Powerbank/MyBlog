package com.tulun.blog.model;


/**
 * 博客分类
 */
public class Category {
    private Long id;
    private String categoryName;
    private String iconClass;
    private String aliasName;
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"categoryName\":\"")
                .append(categoryName).append('\"');
        sb.append(",\"iconClass\":\"")
                .append(iconClass).append('\"');
        sb.append(",\"aliasName\":\"")
                .append(aliasName).append('\"');
        sb.append(",\"sort\":")
                .append(sort);
        sb.append('}');
        return sb.toString();
    }
}
