package com.springboot.azure.sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products_inventory")
@Data
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "product_name", nullable = false)
    private String productName;


    @Column(name = "color")
    private String color;


    @Column(name = "price")
    private int price;
}
