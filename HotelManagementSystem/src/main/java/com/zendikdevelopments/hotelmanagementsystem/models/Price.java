package com.zendikdevelopments.hotelmanagementsystem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "price")
public class Price extends BaseEntity {
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
