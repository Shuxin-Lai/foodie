package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

public class Orders {
    /**
     * ;
     */
    @Id
    private String id;

    /**
     * id
     */
    @Column(name = "user_id")
    private String userId;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_mobile")
    private String receiverMobile;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "real_pay_amount")
    private Integer realPayAmount;

    /**
     * ;
     */
    @Column(name = "post_amount")
    private Integer postAmount;

    /**
     * ;1: 2:
     */
    @Column(name = "pay_method")
    private Integer payMethod;

    @Column(name = "left_msg")
    private String leftMsg;

    private String extand;

    /**
     * ;10
     */
    @Column(name = "is_comment")
    private Integer isComment;

    /**
     * ;1:  0:
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取;
     *
     * @return id - ;
     */
    public String getId() {
        return id;
    }

    /**
     * 设置;
     *
     * @param id ;
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
     * @return receiver_name
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return receiver_mobile
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * @param receiverMobile
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * @return receiver_address
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * @param receiverAddress
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * @return total_amount
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return real_pay_amount
     */
    public Integer getRealPayAmount() {
        return realPayAmount;
    }

    /**
     * @param realPayAmount
     */
    public void setRealPayAmount(Integer realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    /**
     * 获取;
     *
     * @return post_amount - ;
     */
    public Integer getPostAmount() {
        return postAmount;
    }

    /**
     * 设置;
     *
     * @param postAmount ;
     */
    public void setPostAmount(Integer postAmount) {
        this.postAmount = postAmount;
    }

    /**
     * 获取;1: 2:
     *
     * @return pay_method - ;1: 2:
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * 设置;1: 2:
     *
     * @param payMethod ;1: 2:
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * @return left_msg
     */
    public String getLeftMsg() {
        return leftMsg;
    }

    /**
     * @param leftMsg
     */
    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg;
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
     * 获取;10
     *
     * @return is_comment - ;10
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * 设置;10
     *
     * @param isComment ;10
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    /**
     * 获取;1:  0:
     *
     * @return is_delete - ;1:  0:
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置;1:  0:
     *
     * @param isDelete ;1:  0:
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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