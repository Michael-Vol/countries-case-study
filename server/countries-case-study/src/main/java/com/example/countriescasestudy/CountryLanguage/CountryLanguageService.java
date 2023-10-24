package com.example.countriescasestudy.CountryLanguage;

import com.example.countriescasestudy.Country.Country;
import com.example.countriescasestudy.Language.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Builder
public class CountryLanguageService {
    private final CountryLanguageRepository countryLanguageRepository;

    public List<Language> getLanguagesOfCountry(Country country) {
        List<CountryLanguage> countryLanguages = countryLanguageRepository.findAllByCountry(country);
        return countryLanguages.stream()
                .map(countryLanguage -> countryLanguage.getLanguage())
                .collect(Collectors.toList());
    }
}
