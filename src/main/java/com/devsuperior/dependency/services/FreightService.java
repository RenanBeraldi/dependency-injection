package com.devsuperior.dependency.services;

import org.springframework.stereotype.Service;

@Service
public class FreightService {

    public Double calculateFreightValue(Double orderValue) {
        if (orderValue > 0 && orderValue < 100.0) {
            return 20.0;
        } else if (orderValue >= 100.0 && orderValue <= 200.0) {
            return 12.0;
        }

        return 0.0;
    }
}
