package com.example.countriescasestudy.CountryStats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CountryStatsDto {
    private Integer country_id;
    private String name;
    private String country_code3;
    private Integer year;
    private Integer population;
    private Double gdp;
    private Double ratio;
}