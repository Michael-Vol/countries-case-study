package com.example.countriescasestudy.CountryStats;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country_stats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", updatable = false, nullable = false)
    private Integer country_id;

    @Column(name = "year", length = 11, nullable = false)
    private Integer year;

    @Column(name = "population", length = 11)
    private Integer population;

    @Column(name = "gdp", length = 15)
    private Double national_day;
}
