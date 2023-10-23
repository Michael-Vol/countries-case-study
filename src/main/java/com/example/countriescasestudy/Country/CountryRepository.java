package com.example.countriescasestudy.Country;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    Optional<Integer> findCountryByName(String name);
}
