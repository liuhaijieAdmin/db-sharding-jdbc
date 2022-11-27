package com.zhuzi.dbshardingjdbc.model;
import org.springframework.stereotype.Component;

@Component
public class OrderInfo {
    private Long orderInfoId;

    private Long orderId;

    private String shopingName;

    private Integer shopingPrice;

    public OrderInfo(Long orderInfoId, Long orderId, String shopingName, Integer shopingPrice) {
        this.orderInfoId = orderInfoId;
        this.orderId = orderId;
        this.shopingName = shopingName;
        this.shopingPrice = shopingPrice;
    }

    public OrderInfo() {
        super();
    }

    public Long getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Long orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
        return "OrderInfo{" +
                "orderInfoId=" + orderInfoId +
                ", orderId=" + orderId +
                ", shopingName='" + shopingName + '\'' +
                ", shopingPrice=" + shopingPrice +
                '}';
    }
}