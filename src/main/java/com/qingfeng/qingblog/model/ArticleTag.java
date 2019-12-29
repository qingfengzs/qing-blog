package com.qingfeng.qingblog.model;

public class ArticleTag {
    private Integer id;

    private Integer aid;

    private Integer tid;

    public ArticleTag(Integer id, Integer aid, Integer tid) {
        this.id = id;
        this.aid = aid;
        this.tid = tid;
    }

    public ArticleTag() {
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

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}