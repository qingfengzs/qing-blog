package com.qingfeng.qingblog.model;

import java.util.Date;

public class Category {
    private Integer id;

    private String catename;

    private Date date;

    public Category(Integer id, String catename, Date date) {
        this.id = id;
        this.catename = catename;
        this.date = date;
    }

    public Category() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename == null ? null : catename.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}