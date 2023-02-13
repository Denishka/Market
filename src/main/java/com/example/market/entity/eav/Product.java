package com.example.market.entity.eav;

import com.example.market.entity.Order;
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
public class Product implements Serializable { //Entity
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    private Category category;


    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<AttributeValue> values;

    @ManyToOne
    private Order order;


}
