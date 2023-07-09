package com.zendikdevelopments.hotelmanagementsystem.models;

import jakarta.persistence.Column;

public class Price {
    private Double amount;

    public Price() {
    }

    @Column(name = "amount", nullable = false, precision = 6, scale = 2)
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
