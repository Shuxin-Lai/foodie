package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "items_param")
public class ItemsParam {
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

    /**
     * ;
     */
    @Column(name = "produc_place")
    private String producPlace;

    /**
     * ;180
     */
    @Column(name = "foot_period")
    private String footPeriod;

    /**
     * ;
     */
    private String brand;

    /**
     * ;
     */
    @Column(name = "factory_name")
    private String factoryName;

    /**
     * ;
     */
    @Column(name = "factory_address")
    private String factoryAddress;

    /**
     * ;
     */
    @Column(name = "packaging_method")
    private String packagingMethod;

    /**
     * ;35g
     */
    private String weight;

    /**
     * ;5~25
     */
    @Column(name = "storage_method")
    private String storageMethod;

    /**
     * ;
     */
    @Column(name = "eat_method")
    private String eatMethod;

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
     * 获取;
     *
     * @return produc_place - ;
     */
    public String getProducPlace() {
        return producPlace;
    }

    /**
     * 设置;
     *
     * @param producPlace ;
     */
    public void setProducPlace(String producPlace) {
        this.producPlace = producPlace;
    }

    /**
     * 获取;180
     *
     * @return foot_period - ;180
     */
    public String getFootPeriod() {
        return footPeriod;
    }

    /**
     * 设置;180
     *
     * @param footPeriod ;180
     */
    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod;
    }

    /**
     * 获取;
     *
     * @return brand - ;
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置;
     *
     * @param brand ;
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取;
     *
     * @return factory_name - ;
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * 设置;
     *
     * @param factoryName ;
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    /**
     * 获取;
     *
     * @return factory_address - ;
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * 设置;
     *
     * @param factoryAddress ;
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    /**
     * 获取;
     *
     * @return packaging_method - ;
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * 设置;
     *
     * @param packagingMethod ;
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    /**
     * 获取;35g
     *
     * @return weight - ;35g
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置;35g
     *
     * @param weight ;35g
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取;5~25
     *
     * @return storage_method - ;5~25
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * 设置;5~25
     *
     * @param storageMethod ;5~25
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    /**
     * 获取;
     *
     * @return eat_method - ;
     */
    public String getEatMethod() {
        return eatMethod;
    }

    /**
     * 设置;
     *
     * @param eatMethod ;
     */
    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod;
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