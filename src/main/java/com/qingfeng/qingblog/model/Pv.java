package com.qingfeng.qingblog.model;

import java.util.Date;

public class Pv {
    private Integer id;

    private Date countdate;

    private Integer pv;

    private Integer uid;

    public Pv(Integer id, Date countdate, Integer pv, Integer uid) {
        this.id = id;
        this.countdate = countdate;
        this.pv = pv;
        this.uid = uid;
    }

    public Pv() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}