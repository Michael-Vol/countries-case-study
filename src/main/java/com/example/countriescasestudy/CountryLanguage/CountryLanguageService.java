package com.example.countriescasestudy.CountryLanguage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryLanguageService {
    private CountryLanguageRepository countryLanguageRepository;
}
