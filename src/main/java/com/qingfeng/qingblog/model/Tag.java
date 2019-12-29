package com.qingfeng.qingblog.model;

public class Tag {
    private Integer id;

    private String tagname;

    public Tag(Integer id, String tagname) {
        this.id = id;
        this.tagname = tagname;
    }

    public Tag() {
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