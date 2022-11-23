package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

public class Carousel {
    @Id
    private String id;

    /**
     * ;
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * ;
     */
    @Column(name = "background_color")
    private String backgroundColor;

    /**
     * id;id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * id;id
     */
    @Column(name = "cat_id")
    private String catId;

    /**
     * ;id1 2
     */
    private Integer type;

    /**
     * ;
     */
    private Integer sort;

    /**
     * ;1    0
     */
    @Column(name = "is_show")
    private Integer isShow;

    /**
     * ;
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ;
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取;
     *
     * @return image_url - ;
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置;
     *
     * @param imageUrl ;
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取;
     *
     * @return background_color - ;
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置;
     *
     * @param backgroundColor ;
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
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
     * 获取id;id
     *
     * @return cat_id - id;id
     */
    public String getCatId() {
        return catId;
    }

    /**
     * 设置id;id
     *
     * @param catId id;id
     */
    public void setCatId(String catId) {
        this.catId = catId;
    }

    /**
     * 获取;id1 2
     *
     * @return type - ;id1 2
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置;id1 2
     *
     * @param type ;id1 2
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 获取;1    0
     *
     * @return is_show - ;1    0
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置;1    0
     *
     * @param isShow ;1    0
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取;
     *
     * @return create_time - ;
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置;
     *
     * @param createTime ;
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取;
     *
     * @return update_time - ;
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置;
     *
     * @param updateTime ;
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}