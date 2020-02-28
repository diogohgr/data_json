package com.diogo.testefullstack.model;

import javax.persistence.*;

@Entity
@Table(name="ITEM")
public class Item {

    @Id
    @Column(name="NUM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ITEM")
    @SequenceGenerator(name = "SEQ_ITEM", sequenceName = "SEQ_ITEM_ID", allocationSize = 1, initialValue = 1)
    private  Long num;

    @Column(name = "PRODUCT")
    private  String product;

    @Column(name = "QUANTITY")
    private  Long quantity;

    @Column(name = "PRICE")
    private  String price;

    @Column(name = "TYPE")
    private  String type;

    @Column(name = "INDUSTRY")
    private  String industry;

    @Column(name = "ORIGIN")
    private  String origin;

    public Item() {
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
