package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.Country.dao.CountryCompleteInfo;
import com.example.countriescasestudy.Country.dao.DateInfo;
import com.example.countriescasestudy.CountryStats.CountryStats;
import com.example.countriescasestudy.CountryStats.CountryStatsService;
import com.example.countriescasestudy.Region.Region;
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
    private final CountryStatsService countryStatsService;

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

    public List<CountryCompleteInfo> getCountryCompleteInfo() {
        List<CountryStats> countryStats = countryStatsService.getAllCountryStats();
        return countryStats
                .stream()
                .map(this::countryStatsToCountryCompleteInfoMapper)
                .collect(Collectors.toList());
    }

    public List<CountryCompleteInfo> searchCountryStats(Region region, DateInfo dateInfo) {
        List<CountryStats> countryStats =
                countryStatsService.searchCountryStats(region, dateInfo);
        List<CountryCompleteInfo> searchResults = countryStats.stream()
                .map(this::countryStatsToCountryCompleteInfoMapper)
                .collect(Collectors.toList());
        return searchResults;
    }

    private CountryCompleteInfo countryStatsToCountryCompleteInfoMapper(CountryStats stats) {
        return CountryCompleteInfo.builder()
                .population(stats.getPopulation())
                .gdp(stats.getGdp())
                .year(stats.getId().getYear())
                .countryName(stats.getCountry().getName())
                .regionName(stats.getCountry().getRegion().getName())
                .continentName(stats.getCountry().getRegion().getContinent().getName())
                .build();
    }

}
