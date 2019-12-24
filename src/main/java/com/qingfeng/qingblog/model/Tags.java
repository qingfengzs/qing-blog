package com.qingfeng.qingblog.model;

public class Tags {
    private Integer id;

    private String tagname;

    public Tags(Integer id, String tagname) {
        this.id = id;
        this.tagname = tagname;
    }

    public Tags() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }
}