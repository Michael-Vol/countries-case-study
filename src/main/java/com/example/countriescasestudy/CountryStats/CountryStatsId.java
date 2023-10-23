package com.example.countriescasestudy.CountryStats;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CountryStatsId implements Serializable {
    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Column(name = "year", nullable = false)
    private Integer year;
}