package com.qingfeng.qingblog.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class User {
    private Integer id;
    @NotNull(message = "用户名不能为空")
    private String username;
    @NotNull(message = "昵称不能为空")
    private String nickname;
    @NotNull(message = "密码不能为空")
    @Length(min = 8,max = 20,message = "密码必须为8-20位")
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