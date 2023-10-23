package com.example.countriescasestudy.CountryStats.dao;

public interface CountryStatsDto {
    Integer getCountryId();

    String getName();

    String getCountryCode3();

    Integer getYear();

    Integer getPopulation();

    Double getGdp();

    Double getRatio();
}
