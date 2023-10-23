package com.example.countriescasestudy.Continent;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContinentService {

    ContinentRepository continentRepository;

    public Continent save(Continent continent) {
        return continentRepository.save(continent);
    }
}
