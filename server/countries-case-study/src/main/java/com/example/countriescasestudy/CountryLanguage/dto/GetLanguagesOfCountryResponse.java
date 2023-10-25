package com.example.countriescasestudy.CountryLanguage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class GetLanguagesOfCountryResponse {
    List<String> languages;
    Integer countryId;
    String countryName;
}
