package com.example.countriescasestudy.Country.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CountryCompleteInfo {
    String continentName;
    String regionName;
    String countryName;
    Integer year;
    Integer population;
    Double gdp;
}
