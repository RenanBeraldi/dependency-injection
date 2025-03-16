package com.devsuperior.dependency.services;

import com.devsuperior.dependency.entities.Order;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
    @Autowired
    private FreightService freightService;

    public Double calculateOrderValue(Order order) {
        Double orderDiscount = this.calculateOrderDiscount(order.getTotalValue(), order.getDiscountPercentage());

        Double totalOrderValue = order.getTotalValue() - orderDiscount + this.freightService.calculateFreightValue(order.getTotalValue());

        return totalOrderValue;
    }

    private Double calculateOrderDiscount(Double orderValue, Double discountPercentage) {
        Double discountValue = orderValue * (discountPercentage / 100);

        return discountValue;
    }
}
