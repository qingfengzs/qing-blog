package com.qingfeng.qingblog.model;

import java.util.Date;

public class ArticlePicture {
    private Long id;

    private Long articleId;

    private String pictureUrl;

    private Date createTime;

    private Date updateTime;

    private Byte isActive;

    public ArticlePicture(Long id, Long articleId, String pictureUrl, Date createTime, Date updateTime, Byte isActive) {
        this.id = id;
        this.articleId = articleId;
        this.pictureUrl = pictureUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isActive = isActive;
    }

    public ArticlePicture() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }
}