package com.qingfeng.qingblog.model;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String nickname;

    private String password;

    private Boolean enabled;

    private String email;

    private String userface;

    private Date regTime;

    public User(Integer id, String username, String nickname, String password, Boolean enabled, String email, String userface, Date regTime) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
        this.userface = userface;
        this.regTime = regTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface == null ? null : userface.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}