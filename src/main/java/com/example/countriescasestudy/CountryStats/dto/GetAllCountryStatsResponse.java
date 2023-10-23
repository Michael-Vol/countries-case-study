package com.example.countriescasestudy.CountryStats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetAllCountryStatsResponse {
    private List<CountryStatsDto> countryStats;
}
