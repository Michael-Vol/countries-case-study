package com.example.countriescasestudy.CountryStats;

import com.example.countriescasestudy.CountryStats.dao.CountryStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, Integer> {

    @Query(value = "SELECT c.country_id AS countryId, c.name, c.country_code3 AS countryCode3, s.year, s.population, " +
            "s.gdp, " +
            "MAX" +
            "(s.gdp/s.population) AS" +
            " ratio " +
            "FROM " +
            "country_stats s JOIN countries c" +
            " ON c.country_id = s.country_id GROUP " +
            "BY c.country_id", nativeQuery = true)
    List<CountryStatsDto> getAllByMaxGdpPopulationRatio();

    @Query(nativeQuery = true, value = "SELECT s.* FROM country_stats s JOIN countries c ON c.country_id = s" +
            ".country_id" +
            " " +
            " WHERE (?1 IS NULL OR c.region_id = ?1)" +
            " AND s.year BETWEEN ?2 AND ?3")
    List<CountryStats> searchCountryStats(Integer regionId, Integer dateFrom, Integer dateTo);
}