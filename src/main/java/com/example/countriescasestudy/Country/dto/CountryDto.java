package com.example.countriescasestudy.Country.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class CountryDto {
    private Integer countryId;
    private String name;
    private String countryCode2;
    private String countryCode3;
    private Date nationalDay;
    private Double area;
}
