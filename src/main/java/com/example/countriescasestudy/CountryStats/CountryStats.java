package com.example.countriescasestudy.CountryStats;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country_stats", schema = "nation")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryStats {
    @EmbeddedId
    private CountryStatsId id;
    //
    //    @Column(name = "country_id", nullable = false)
    //    private Integer country_id;
    //
    //
    //    @Column(name = "year", nullable = false)
    //    private Integer year;

    @Column(name = "population")
    private Integer population;

    @Column(name = "gdp")
    private Double nationalDay;
    //
    //    @MapsId
    //    @ManyToOne(fetch = FetchType.EAGER)
    //    @JoinColumn(name = "country_id", nullable = false)
    //    private Country country;
}
