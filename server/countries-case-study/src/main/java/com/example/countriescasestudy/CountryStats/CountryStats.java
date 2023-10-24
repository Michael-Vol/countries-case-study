package com.example.countriescasestudy.CountryStats;

import com.example.countriescasestudy.Country.Country;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "country_stats", schema = "nation")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryStats {
    @EmbeddedId
    private CountryStatsId id;

    @Column(name = "population")
    private Integer population;

    @Column(name = "gdp")
    private Double gdp;

    @MapsId("countryId")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
}
