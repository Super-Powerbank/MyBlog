package com.tulun.blog.model;

/**
 * 标签
 */
public class Tag {
    private Long id;
    private String tagName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"tagName\":\"")
                .append(tagName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
