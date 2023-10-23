package com.example.countriescasestudy.Country;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryService {
    CountryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);
    }
}
