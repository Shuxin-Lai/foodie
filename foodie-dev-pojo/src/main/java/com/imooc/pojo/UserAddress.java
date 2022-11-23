package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_address")
public class UserAddress {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * id
     */
    @Column(name = "user_id")
    private String userId;

    private String receiver;

    private String mobile;

    private String province;

    private String city;

    private String district;

    private String detail;

    private String extand;

    /**
     * ;1:  0:
     */
    @Column(name = "is_default")
    private Integer isDefault;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取id
     *
     * @return user_id - id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置id
     *
     * @param userId id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return extand
     */
    public String getExtand() {
        return extand;
    }

    /**
     * @param extand
     */
    public void setExtand(String extand) {
        this.extand = extand;
    }

    /**
     * 获取;1:  0:
     *
     * @return is_default - ;1:  0:
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置;1:  0:
     *
     * @param isDefault ;1:  0:
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}