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
    private Integer country_id;

    @Column(name = "year", length = 11, nullable = false)
    private Integer year;
}