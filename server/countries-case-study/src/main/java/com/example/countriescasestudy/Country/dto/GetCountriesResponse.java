package com.example.countriescasestudy.Country.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class GetCountriesResponse {
    private List<CountryDto> countries;
}
