package com.example.market.entity.eav;

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
public class Category implements Serializable { //Entity
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Category parent;

    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private List<Product> products;

    @OneToMany
    private List<AttributeGroup> groups;


}
