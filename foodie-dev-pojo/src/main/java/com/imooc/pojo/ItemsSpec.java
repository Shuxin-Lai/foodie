package com.imooc.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "items_spec")
public class ItemsSpec {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * id
     */
    @Column(name = "item_id")
    private String itemId;

    private String name;

    private Integer stock;

    private BigDecimal discounts;

    @Column(name = "price_discount")
    private Integer priceDiscount;

    @Column(name = "price_normal")
    private Integer priceNormal;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * @return discounts
     */
    public BigDecimal getDiscounts() {
        return discounts;
    }

    /**
     * @param discounts
     */
    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    /**
     * @return price_discount
     */
    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    /**
     * @param priceDiscount
     */
    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    /**
     * @return price_normal
     */
    public Integer getPriceNormal() {
        return priceNormal;
    }

    /**
     * @param priceNormal
     */
    public void setPriceNormal(Integer priceNormal) {
        this.priceNormal = priceNormal;
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