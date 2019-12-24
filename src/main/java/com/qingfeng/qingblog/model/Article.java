package com.qingfeng.qingblog.model;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Integer cid;

    private Integer uid;

    private Date publishdate;

    private Date edittime;

    private Integer state;

    private Integer pageview;

    private String mdcontent;

    private String htmlcontent;

    private String summary;

    public Article(Integer id, String title, Integer cid, Integer uid, Date publishdate, Date edittime, Integer state, Integer pageview, String mdcontent, String htmlcontent, String summary) {
        this.id = id;
        this.title = title;
        this.cid = cid;
        this.uid = uid;
        this.publishdate = publishdate;
        this.edittime = edittime;
        this.state = state;
        this.pageview = pageview;
        this.mdcontent = mdcontent;
        this.htmlcontent = htmlcontent;
        this.summary = summary;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPageview() {
        return pageview;
    }

    public void setPageview(Integer pageview) {
        this.pageview = pageview;
    }

    public String getMdcontent() {
        return mdcontent;
    }

    public void setMdcontent(String mdcontent) {
        this.mdcontent = mdcontent == null ? null : mdcontent.trim();
    }

    public String getHtmlcontent() {
        return htmlcontent;
    }

    public void setHtmlcontent(String htmlcontent) {
        this.htmlcontent = htmlcontent == null ? null : htmlcontent.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}