package com.example.countriescasestudy.Continent;

import com.example.countriescasestudy.Region.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Integer> {
    Continent getContinentByRegionsContaining(Region region);
}
