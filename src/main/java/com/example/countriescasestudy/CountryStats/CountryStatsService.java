package com.example.countriescasestudy.CountryStats;

import com.example.countriescasestudy.CountryStats.dto.CountryStatsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Builder
public class CountryStatsService {
    private final CountryStatsRepository countryStatsRepository;

    public CountryStats save(CountryStats countryStats) {
        return countryStatsRepository.save(countryStats);
    }

    public List<CountryStats> getAllCountryStats() {
        return countryStatsRepository.findAll();
    }

    public List<CountryStatsDto> getAllCountryStatsWithRatio() {
        List<CountryStatsDto> countryStats = countryStatsRepository.getAllByMaxGdpPopulationRatio()
                .stream()
                .map(stats -> CountryStatsDto.builder()
                        .country_id(stats.getCountryId())
                        .name(stats.getName())
                        .country_code3(stats.getCountryCode3())
                        .year(stats.getYear())
                        .population(stats.getPopulation())
                        .gdp(stats.getGdp())
                        .ratio(stats.getRatio())
                        .build())
                .collect(Collectors.toList());
        return countryStats;
    }
}
