package com.example.countriescasestudy.Country.dto;

import com.example.countriescasestudy.Country.Country;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CountryDto countryToCountryDTO(Country country, @MappingTarget CountryDto countryDTO);

    List<CountryDto> countriesToCountryDTOs(List<Country> countries);
}