package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "order_status")
public class OrderStatus {
    /**
     * ID;id
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * ;[10:]
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * ;[20:]
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * ;[30]
     */
    @Column(name = "deliver_time")
    private Date deliverTime;

    /**
     * ;[40]
     */
    @Column(name = "success_time")
    private Date successTime;

    /**
     * ;[50]
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * ;
     */
    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * 获取ID;id
     *
     * @return order_id - ID;id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置ID;id
     *
     * @param orderId ID;id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取;[10:]
     *
     * @return created_time - ;[10:]
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置;[10:]
     *
     * @param createdTime ;[10:]
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取;[20:]
     *
     * @return pay_time - ;[20:]
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置;[20:]
     *
     * @param payTime ;[20:]
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取;[30]
     *
     * @return deliver_time - ;[30]
     */
    public Date getDeliverTime() {
        return deliverTime;
    }

    /**
     * 设置;[30]
     *
     * @param deliverTime ;[30]
     */
    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    /**
     * 获取;[40]
     *
     * @return success_time - ;[40]
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置;[40]
     *
     * @param successTime ;[40]
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取;[50]
     *
     * @return close_time - ;[50]
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置;[50]
     *
     * @param closeTime ;[50]
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取;
     *
     * @return comment_time - ;
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置;
     *
     * @param commentTime ;
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}