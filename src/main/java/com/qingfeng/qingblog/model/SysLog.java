package com.qingfeng.qingblog.model;

import java.util.Date;

public class SysLog {
    private Long id;

    private String ip;

    private String operateUser;

    private Date createTime;

    private String remark;

    private String operateUrl;

    private String operateBy;

    public SysLog(Long id, String ip, String operateUser, Date createTime, String remark, String operateUrl, String operateBy) {
        this.id = id;
        this.ip = ip;
        this.operateUser = operateUser;
        this.createTime = createTime;
        this.remark = remark;
        this.operateUrl = operateUrl;
        this.operateBy = operateBy;
    }

    public SysLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperateUrl() {
        return operateUrl;
    }

    public void setOperateUrl(String operateUrl) {
        this.operateUrl = operateUrl == null ? null : operateUrl.trim();
    }

    public String getOperateBy() {
        return operateBy;
    }

    public void setOperateBy(String operateBy) {
        this.operateBy = operateBy == null ? null : operateBy.trim();
    }
}