package com.qingfeng.qingblog.model;

public class ArticleCategory {
    private Long id;

    private Long aid;

    private Long cid;

    public ArticleCategory(Long id, Long aid, Long cid) {
        this.id = id;
        this.aid = aid;
        this.cid = cid;
    }

    public ArticleCategory() {
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

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}