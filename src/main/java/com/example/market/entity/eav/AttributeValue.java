package com.example.market.entity.eav;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;
//Value(Значение) Допустим , атрибут Диагональ для товара Ноутбук может иметь значение 15 дюймов.
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table
public class AttributeValue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
