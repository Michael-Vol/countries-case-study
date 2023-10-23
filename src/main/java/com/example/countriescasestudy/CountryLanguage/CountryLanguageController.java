package com.example.countriescasestudy.CountryLanguage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country-languages")
public class CountryLanguageController {
    private CountryLanguageService countryLanguageService;
}
