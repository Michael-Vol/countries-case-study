package com.example.countriescasestudy.CountryStats;


import com.example.countriescasestudy.CountryStats.dto.CountryStatsDto;
import com.example.countriescasestudy.CountryStats.dto.GetAllCountryStatsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/country-stats")
public class CountryStatsController {
    private final CountryStatsService countryStatsService;

    @GetMapping
    public ResponseEntity<GetAllCountryStatsResponse> getAllCountriesStats() {
        List<CountryStatsDto> countryStats = countryStatsService.getAllCountryStatsWithRatio();
        return ResponseEntity.ok(GetAllCountryStatsResponse.builder()
                .countryStats(countryStats)
                .build());
    }
}
