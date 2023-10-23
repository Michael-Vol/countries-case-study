package com.example.countriescasestudy.Region;

import com.example.countriescasestudy.Continent.Continent;
import com.example.countriescasestudy.Country.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "region", schema = "nation")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continent;

    @OneToMany(mappedBy = "region")
    private Set<Country> countries = new LinkedHashSet<>();
}