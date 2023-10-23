package com.example.countriescasestudy.CountryStats;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country-stats")
public class CountryStatsController {
    private CountryStatsService countryStatsService;
}
