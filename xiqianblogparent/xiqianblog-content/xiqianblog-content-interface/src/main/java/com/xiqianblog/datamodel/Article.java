package com.xiqianblog.datamodel;

import java.util.Date;

public class Article {

    /**
     * 文章编号
     */
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章副标题
     */
    private String subTitle;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 作者编号
     */
    private Long authorId;

    /**
     * 发布ip
     */
    private String releaseIp;

    /**
     * 发布时间
     */
    private Date releaseTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 封面图url
     */
    private String coverImage;

    /**
     * 浏览量
     */
    private Long views;

    /**
     * 评论数
     */
    private Long comments;

    /**
     * 点赞数
     */
    private Long likes;

    /**
     * 分类
     */
    private String category;

    /**
     * 标签
     */
    private String label;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getReleaseIp() {
        return releaseIp;
    }

    public void setReleaseIp(String releaseIp) {
        this.releaseIp = releaseIp;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", content='" + content + '\'' +
                ", authorId=" + authorId +
                ", releaseIp='" + releaseIp + '\'' +
                ", releaseTime=" + releaseTime +
                ", updateTime=" + updateTime +
                ", coverImage='" + coverImage + '\'' +
                ", views=" + views +
                ", comments=" + comments +
                ", likes=" + likes +
                ", category='" + category + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
