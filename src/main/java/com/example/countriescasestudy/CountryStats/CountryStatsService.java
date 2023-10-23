package com.example.countriescasestudy.CountryStats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryStatsService {
    CountryStatsRepository countryStatsRepository;

    public CountryStats save(CountryStats countryStats) {
        return countryStatsRepository.save(countryStats);
    }
}
