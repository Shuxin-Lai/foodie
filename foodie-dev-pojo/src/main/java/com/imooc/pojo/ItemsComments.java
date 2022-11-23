package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "items_comments")
public class ItemsComments {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * id;
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * id
     */
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_name")
    private String itemName;

    /**
     * id;
     */
    @Column(name = "item_spec_id")
    private String itemSpecId;

    /**
     * ;
     */
    @Column(name = "sepc_name")
    private String sepcName;

    /**
     * ;1 2 3
     */
    @Column(name = "comment_level")
    private Integer commentLevel;

    private String content;

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
     * 获取id;
     *
     * @return user_id - id;
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置id;
     *
     * @param userId id;
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取id
     *
     * @return item_id - id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置id
     *
     * @param itemId id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取id;
     *
     * @return item_spec_id - id;
     */
    public String getItemSpecId() {
        return itemSpecId;
    }

    /**
     * 设置id;
     *
     * @param itemSpecId id;
     */
    public void setItemSpecId(String itemSpecId) {
        this.itemSpecId = itemSpecId;
    }

    /**
     * 获取;
     *
     * @return sepc_name - ;
     */
    public String getSepcName() {
        return sepcName;
    }

    /**
     * 设置;
     *
     * @param sepcName ;
     */
    public void setSepcName(String sepcName) {
        this.sepcName = sepcName;
    }

    /**
     * 获取;1 2 3
     *
     * @return comment_level - ;1 2 3
     */
    public Integer getCommentLevel() {
        return commentLevel;
    }

    /**
     * 设置;1 2 3
     *
     * @param commentLevel ;1 2 3
     */
    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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