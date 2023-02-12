package com.example.market.entity.eav;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table
public class Сategory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
