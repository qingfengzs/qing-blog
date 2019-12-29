package com.qingfeng.qingblog.model;

import java.util.Date;

public class ArticleWithBLOBs extends Article {
    private String mdcontent;

    private String htmlcontent;

    private String summary;

    public ArticleWithBLOBs(Integer id, String title, Integer cid, Integer uid, Date publishdate, Date edittime, Integer state, Integer pageview, String mdcontent, String htmlcontent, String summary) {
        super(id, title, cid, uid, publishdate, edittime, state, pageview);
        this.mdcontent = mdcontent;
        this.htmlcontent = htmlcontent;
        this.summary = summary;
    }

    public ArticleWithBLOBs() {
        super();
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