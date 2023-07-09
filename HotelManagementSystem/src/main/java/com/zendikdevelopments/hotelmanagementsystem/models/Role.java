package com.zendikdevelopments.hotelmanagementsystem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    private String name;

    public Role() {
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
