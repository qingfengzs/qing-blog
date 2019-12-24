package com.qingfeng.qingblog.model;

import java.util.Date;

public class Comments {
    private Integer id;

    private Integer aid;

    private Date publishdate;

    private Integer parentid;

    private Integer uid;

    private String content;

    public Comments(Integer id, Integer aid, Date publishdate, Integer parentid, Integer uid, String content) {
        this.id = id;
        this.aid = aid;
        this.publishdate = publishdate;
        this.parentid = parentid;
        this.uid = uid;
        this.content = content;
    }

    public Comments() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}