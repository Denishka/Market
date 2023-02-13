package com.example.market.entity;

import com.example.market.entity.eav.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private  User user;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Product> products;



}
