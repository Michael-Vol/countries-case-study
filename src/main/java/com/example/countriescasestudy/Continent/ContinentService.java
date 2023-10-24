package com.example.countriescasestudy.Continent;


import com.example.countriescasestudy.Region.Region;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Builder
public class ContinentService {

    private final ContinentRepository continentRepository;

    public List<Continent> getAllContinents() {
        return continentRepository.findAll();
    }

    public Continent getContinentOfRegion(Region region) {
        return continentRepository.getContinentByRegionsContaining(region);
    }

}
