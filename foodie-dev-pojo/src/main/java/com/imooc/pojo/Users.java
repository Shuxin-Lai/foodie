package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

public class Users {
    /**
     * id;id
     */
    @Id
    private String id;

    /**
     * ;
     */
    private String username;

    /**
     * ;
     */
    private String password;

    /**
     * ;
     */
    private String nickname;

    /**
     * ;
     */
    private String realname;

    /**
     * ;
     */
    private String face;

    /**
     * ;
     */
    private String mobile;

    /**
     * ;
     */
    private String email;

    /**
     * ; 1:  0:  2:
     */
    private Integer sex;

    /**
     * ;
     */
    private Date birthday;

    /**
     * ;
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * ;
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取id;id
     *
     * @return id - id;id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id;id
     *
     * @param id id;id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取;
     *
     * @return username - ;
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置;
     *
     * @param username ;
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取;
     *
     * @return password - ;
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置;
     *
     * @param password ;
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取;
     *
     * @return nickname - ;
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置;
     *
     * @param nickname ;
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取;
     *
     * @return realname - ;
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置;
     *
     * @param realname ;
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取;
     *
     * @return face - ;
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置;
     *
     * @param face ;
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 获取;
     *
     * @return mobile - ;
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置;
     *
     * @param mobile ;
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取;
     *
     * @return email - ;
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置;
     *
     * @param email ;
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取; 1:  0:  2:
     *
     * @return sex - ; 1:  0:  2:
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置; 1:  0:  2:
     *
     * @param sex ; 1:  0:  2:
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取;
     *
     * @return birthday - ;
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置;
     *
     * @param birthday ;
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取;
     *
     * @return created_time - ;
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置;
     *
     * @param createdTime ;
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取;
     *
     * @return updated_time - ;
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置;
     *
     * @param updatedTime ;
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}