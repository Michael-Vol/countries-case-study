package com.example.countriescasestudy.CountryLanguage;

import com.example.countriescasestudy.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, Country> {
}
