package com.example.countriescasestudy.Country;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
@Builder
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;


    //    @GetMapping
    //    public Iterable<Country> getCountries() {
    //        return countryService.getCountries();
    //    }
}
