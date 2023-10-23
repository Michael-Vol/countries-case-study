package com.example.countriescasestudy.Region;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countries")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", updatable = false, nullable = false)
    private Integer region_id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "continent_id", length = 11)
    private Integer continent_id;
}
