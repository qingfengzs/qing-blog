package com.qingfeng.qingblog.model;

import java.util.Date;

public class Category {
    private Long categoryId;

    private Date createTime;

    private Date updateTime;

    private Boolean isEffective;

    public Category(Long categoryId, Date createTime, Date updateTime, Boolean isEffective) {
        this.categoryId = categoryId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isEffective = isEffective;
    }

    public Category() {
        super();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

    public Boolean getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
    }
}