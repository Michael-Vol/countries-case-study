package com.example.countriescasestudy.Country;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Builder
public class CountryService {
    private final CountryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public Country getCountryById(Integer countryId) {
        return countryRepository.findById(countryId)
                .orElseThrow(() -> new IllegalStateException("Country with id " + countryId + " does not exist"));
    }

    public Country getCountryByName(String countryName) {
        return countryRepository.findCountryByName(countryName)
                .orElseThrow(() -> new IllegalStateException("Country with name " + countryName + " does not exist"));
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

}
