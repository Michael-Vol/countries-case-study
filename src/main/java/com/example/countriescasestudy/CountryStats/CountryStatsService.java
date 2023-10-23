package com.example.countriescasestudy.CountryStats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class CountryStatsService {
    private final CountryStatsRepository countryStatsRepository;

    public CountryStats save(CountryStats countryStats) {
        return countryStatsRepository.save(countryStats);
    }
}
