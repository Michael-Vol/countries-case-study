package com.example.countriescasestudy.Continent;


import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class ContinentService {

    private final ContinentRepository continentRepository;

    public Continent save(Continent continent) {
        return continentRepository.save(continent);
    }
}
