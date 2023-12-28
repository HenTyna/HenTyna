package com.hrdcenter.demospring.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productTb")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private Float price;

    @Column(name = "product_descrit")
    private String description;
}
