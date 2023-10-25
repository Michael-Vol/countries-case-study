package com.example.countriescasestudy.CountryLanguage;

import com.example.countriescasestudy.Country.Country;
import com.example.countriescasestudy.Country.CountryService;
import com.example.countriescasestudy.CountryLanguage.dto.GetLanguagesOfCountryResponse;
import com.example.countriescasestudy.Language.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/country-languages")
public class CountryLanguageController {
    private final CountryLanguageService countryLanguageService;
    private final CountryService countryService;

    @GetMapping
    public ResponseEntity<GetLanguagesOfCountryResponse> getLanguagesOfCountry(@RequestParam Integer countryId) {
        Country country = countryService.getCountryById(countryId);
        List<String> languages = countryLanguageService.getLanguagesOfCountry(country)
                .stream()
                .map(Language::getLanguage)
                .collect(Collectors.toList());
        return new ResponseEntity<>(GetLanguagesOfCountryResponse.builder()
                .languages(languages)
                .countryId(countryId)
                .countryName(country.getName())
                .build(), HttpStatus.OK);
    }
}
