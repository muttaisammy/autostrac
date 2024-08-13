package com.autostrac.autostrac.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String category;
    private String price;

    @Column(columnDefinition ="TEXT")
    private String description;
    private Date createdAt;
    private String imageFileName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
