package com.example.countriescasestudy.Continent;

import com.example.countriescasestudy.Region.Region;
import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "continents", schema = "nation")
@Builder
@Getter
@Setter
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
    private List<Region> regions = new LinkedList<>();

}
