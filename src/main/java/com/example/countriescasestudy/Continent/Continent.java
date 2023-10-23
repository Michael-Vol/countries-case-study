package com.example.countriescasestudy.Continent;

import com.example.countriescasestudy.Region.Region;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "continents", schema = "nation")
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

    @OneToMany(mappedBy = "continent")
    private Set<Region> regions = new LinkedHashSet<>();

}
