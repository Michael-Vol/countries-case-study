package com.example.countriescasestudy.CountryStats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, Integer> {
}