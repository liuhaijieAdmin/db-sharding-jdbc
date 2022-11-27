package com.zhuzi.dbshardingjdbc.model;
import org.springframework.stereotype.Component;

@Component
public class Shoping {
    private Long shopingId;

    private String shopingName;

    private Integer shopingPrice;

    public Shoping(Long shopingId, String shopingName, Integer shopingPrice) {
        this.shopingId = shopingId;
        this.shopingName = shopingName;
        this.shopingPrice = shopingPrice;
    }

    public Shoping() {
        super();
    }

    public Long getShopingId() {
        return shopingId;
    }

    public void setShopingId(Long shopingId) {
        this.shopingId = shopingId;
    }

    public String getShopingName() {
        return shopingName;
    }

    public void setShopingName(String shopingName) {
        this.shopingName = shopingName;
    }

    public Integer getShopingPrice() {
        return shopingPrice;
    }

    public void setShopingPrice(Integer shopingPrice) {
        this.shopingPrice = shopingPrice;
    }

    @Override
    public String toString() {
        return "Shoping{" +
                "shopingId=" + shopingId +
                ", shopingName='" + shopingName + '\'' +
                ", shopingPrice=" + shopingPrice +
                '}';
    }
}