package com.example.countriescasestudy.Continent;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "continents")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id", updatable = false, nullable = false, columnDefinition = "INT(11)")
    private Integer continent_id;

    @Column(name = "name")
    private String name;
}
