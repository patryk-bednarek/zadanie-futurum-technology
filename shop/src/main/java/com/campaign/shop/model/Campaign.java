package com.campaign.shop.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "campaigns")
public class Campaign implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "productname")
    private String productName;
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "price")
    private Double price;
    @Column(name = "funds")
    private Double funds;
    @Column(name = "status")
    private String status;
    @Column(name = "town")
    private String town;
    @Column(name = "radius")
    private Integer radius;

    public Campaign() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFunds() {
        return funds;
    }

    public void setFunds(Double funds) {
        this.funds = funds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", keyword='" + keyword + '\'' +
                ", price=" + price +
                ", funds=" + funds +
                ", status='" + status + '\'' +
                ", town='" + town + '\'' +
                ", radius=" + radius +
                '}';
    }
}
