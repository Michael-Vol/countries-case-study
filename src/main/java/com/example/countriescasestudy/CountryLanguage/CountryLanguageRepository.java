package com.example.countriescasestudy.CountryLanguage;

import com.example.countriescasestudy.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {
    List<CountryLanguage> findAllByCountry(Country country);
}
