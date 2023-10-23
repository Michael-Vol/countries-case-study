package com.example.countriescasestudy.CountryLanguage;

import com.example.countriescasestudy.Country.Country;
import com.example.countriescasestudy.Country.CountryService;
import com.example.countriescasestudy.Language.Language;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/country-languages")
public class CountryLanguageController {
    private CountryLanguageService countryLanguageService;
    private CountryService countryService;

    @GetMapping
    public List<String> getLanguagesOfCountry(@RequestParam Integer countryId) {
        Country country = countryService.getCountryById(countryId);
        return countryLanguageService.getLanguagesOfCountry(country)
                .stream()
                .map(Language::getLanguage)
                .collect(Collectors.toList());
    }
}
