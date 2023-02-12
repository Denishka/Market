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
public class Characteristic implements Serializable { // Attribute, В данном случае , товары могут иметь атрибуты как цена , артикул,вес и прочие
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;



    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<AttributeValue> values;


}
