package com.tulun.blog.model;

import java.util.Date;
import java.util.List;

public class Article {
	private int id;

    /**
     * 类别id
     */
	private Long categoryId;

	private Long tagId;

	private String categoryName;

    /**
     * 标题
     */
	private String title;

    /**
     * 内容
     */
	private String content;

    /**
     * 作者
     */
	private String author;

    /**
     * 创建时间
     */
	private Date createTime;

    public void setTime(String time) {
        this.time = time;
    }

    //service层完成将date类型数据转化为String
	private String time;

    /**
     * 浏览量
     */
	private int showCount;

    /**
     * 状态
     */
	private int statue;

	//从前台页面传递到服务端需要的参数
	private List<Tag> tagList;

	//从数据库获取的文章标签信息
    private List<ArticleTag> aTagList;

	private String imageUrl;

    public List <ArticleTag> getaTagList() {
        return aTagList;
    }

    public void setaTagList(List <ArticleTag> aTagList) {
        this.aTagList = aTagList;
    }

    /**
     * 描述信息
     */
	private String description;

	private String aliasName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public int getStatue() {
		return statue;
	}

	public void setStatue(int statue) {
		this.statue = statue;
	}

	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"categoryId\":")
                .append(categoryId);
        sb.append(",\"tagId\":")
                .append(tagId);
        sb.append(",\"categoryName\":\"")
                .append(categoryName).append('\"');
        sb.append(",\"title\":\"")
                .append(title).append('\"');
        sb.append(",\"content\":\"")
                .append(content).append('\"');
        sb.append(",\"author\":\"")
                .append(author).append('\"');
        sb.append(",\"createTime\":\"")
                .append(createTime).append('\"');
        sb.append(",\"time\":\"")
                .append(time).append('\"');
        sb.append(",\"showCount\":")
                .append(showCount);
        sb.append(",\"statue\":")
                .append(statue);
        sb.append(",\"tagList\":")
                .append(tagList);
        sb.append(",\"aTagList\":")
                .append(aTagList);
        sb.append(",\"imageUrl\":\"")
                .append(imageUrl).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"aliasName\":\"")
                .append(aliasName).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public String getTime() {
        return time;
    }
}
