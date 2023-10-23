package com.example.countriescasestudy.CountryStats;

import com.example.countriescasestudy.Country.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country_stats", schema = "nation")
@Data
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
    //    @Column(name = "year", length = 11, nullable = false)
    //    private Integer year;

    @Column(name = "population", length = 11)
    private Integer population;

    @Column(name = "gdp", length = 15)
    private Double national_day;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

}
