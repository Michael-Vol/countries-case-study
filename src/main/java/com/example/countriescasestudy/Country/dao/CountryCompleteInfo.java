package com.example.countriescasestudy.Country.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CountryCompleteInfo {
    String continentName;
    String regionName;
    String countryName;
    List<CountryStats> stats;
}
