package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "items_img")
public class ItemsImg {
    @Id
    private String id;

    /**
     * id;id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * ;
     */
    private String url;

    /**
     * ;
     */
    private Integer sort;

    /**
     * ;10
     */
    @Column(name = "is_main")
    private Integer isMain;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取id;id
     *
     * @return item_id - id;id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置id;id
     *
     * @param itemId id;id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取;
     *
     * @return url - ;
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置;
     *
     * @param url ;
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取;
     *
     * @return sort - ;
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置;
     *
     * @param sort ;
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取;10
     *
     * @return is_main - ;10
     */
    public Integer getIsMain() {
        return isMain;
    }

    /**
     * 设置;10
     *
     * @param isMain ;10
     */
    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
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