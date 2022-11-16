package com.model;


public class Product {
    private int id;
    private String active;
    private String code;
    private String description;
    private String name;
    private String price;
    private String product_category;
    private String src;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public Product(int id, String active, String code, String description,
                   String name, String price, String product_category) {
        super();
        this.id = id;
        this.active = active;
        this.code = code;
        this.description = description;
        this.name = name;
        this.price = price;
        this.product_category = product_category;
    }

    public Product(int id, String active, String code, String description,
                   String name, String price, String product_category, String src) {
        super();
        this.id = id;
        this.active = active;
        this.code = code;
        this.description = description;
        this.name = name;
        this.price = price;
        this.product_category = product_category;
        this.src = src;
    }

    public Product() {

    }

}
