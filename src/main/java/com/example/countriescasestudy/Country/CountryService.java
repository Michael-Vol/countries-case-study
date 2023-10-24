package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.Country.dao.CountryCompleteInfo;
import com.example.countriescasestudy.Country.dao.CountryStats;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public CountryCompleteInfo getCountryCompleteInfo(Country country) {
        String countryName = country.getName();
        String continentName = country.getRegion().getContinent().getName();
        String regionName = country.getRegion().getName();
        List<CountryStats> stats = country.getCountryStats().stream().map(countryStats -> CountryStats.builder()
                .population(countryStats.getPopulation())
                .gdp(countryStats.getGdp())
                .year(countryStats.getId().getYear())
                .build()).collect(Collectors.toList());
        return CountryCompleteInfo.builder()
                .continentName(continentName)
                .regionName(regionName)
                .countryName(countryName)
                .stats(stats)
                .build();
    }

}
