package com.imooc.pojo;

import javax.persistence.*;

@Table(name = "order_items")
public class OrderItems {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * id
     */
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_img")
    private String itemImg;

    @Column(name = "item_name")
    private String itemName;

    /**
     * id
     */
    @Column(name = "item_spec_id")
    private String itemSpecId;

    @Column(name = "item_spec_name")
    private String itemSpecName;

    private Integer price;

    @Column(name = "buy_counts")
    private Integer buyCounts;

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
     * @return order_id - id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置id
     *
     * @param orderId id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * @return item_img
     */
    public String getItemImg() {
        return itemImg;
    }

    /**
     * @param itemImg
     */
    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
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
     * 获取id
     *
     * @return item_spec_id - id
     */
    public String getItemSpecId() {
        return itemSpecId;
    }

    /**
     * 设置id
     *
     * @param itemSpecId id
     */
    public void setItemSpecId(String itemSpecId) {
        this.itemSpecId = itemSpecId;
    }

    /**
     * @return item_spec_name
     */
    public String getItemSpecName() {
        return itemSpecName;
    }

    /**
     * @param itemSpecName
     */
    public void setItemSpecName(String itemSpecName) {
        this.itemSpecName = itemSpecName;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return buy_counts
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * @param buyCounts
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }
}