package com.qingfeng.qingblog.model;

import java.util.Date;

public class ArticleView {
    private Long id;

    private Long aid;

    private String userName;

    private String ip;

    private Date createBy;

    public ArticleView(Long id, Long aid, String userName, String ip, Date createBy) {
        this.id = id;
        this.aid = aid;
        this.userName = userName;
        this.ip = ip;
        this.createBy = createBy;
    }

    public ArticleView() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }
}