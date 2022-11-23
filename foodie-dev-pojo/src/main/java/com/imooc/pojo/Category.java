package com.imooc.pojo;

import javax.persistence.*;

public class Category {
    /**
     * ;id
     */
    @Id
    private Integer id;

    /**
     * ;
     */
    private String name;

    /**
     * ;
1:
2:
3:
     */
    private Integer type;

    /**
     * id;id id10
     */
    @Column(name = "father_id")
    private Integer fatherId;

    /**
     * ;logo
     */
    private String logo;

    private String slogan;

    @Column(name = "cat_image")
    private String catImage;

    @Column(name = "bg_color")
    private String bgColor;

    /**
     * 获取;id
     *
     * @return id - ;id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置;id
     *
     * @param id ;id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取;
     *
     * @return name - ;
     */
    public String getName() {
        return name;
    }

    /**
     * 设置;
     *
     * @param name ;
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取;
1:
2:
3:
     *
     * @return type - ;
1:
2:
3:
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置;
1:
2:
3:
     *
     * @param type ;
1:
2:
3:
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取id;id id10
     *
     * @return father_id - id;id id10
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * 设置id;id id10
     *
     * @param fatherId id;id id10
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 获取;logo
     *
     * @return logo - ;logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置;logo
     *
     * @param logo ;logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return slogan
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * @param slogan
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * @return cat_image
     */
    public String getCatImage() {
        return catImage;
    }

    /**
     * @param catImage
     */
    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    /**
     * @return bg_color
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * @param bgColor
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}