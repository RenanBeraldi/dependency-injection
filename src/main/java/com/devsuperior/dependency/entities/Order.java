package com.devsuperior.dependency.entities;

public class Order {
    private Integer id;
    private Double totalValue;
    private Double discountPercentage;
    private Double freightValue;

    public Order() {}

    public Order(Integer id, Double totalValue, Double discountPercentage) {
        this.id = id;
        this.totalValue = totalValue;
        this.discountPercentage = discountPercentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(Double freightValue) {
        this.freightValue = freightValue;
    }
}
