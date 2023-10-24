package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.Country.dao.CountryCompleteInfo;
import com.example.countriescasestudy.Country.dto.CountryDto;
import com.example.countriescasestudy.Country.dto.CountryMapper;
import com.example.countriescasestudy.Country.dto.GetCountriesResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/countries")
@Builder
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @GetMapping
    public ResponseEntity<GetCountriesResponse> getCountries() {
        List<Country> countries = countryService.getAllCountries();
        return new ResponseEntity<>(GetCountriesResponse.builder()
                .countries(countryMapper.countriesToCountryDTOs(countries))
                .build(), HttpStatus.OK);
    }

    @GetMapping("/{countryId}")
    public ResponseEntity<CountryDto> getCountryById(@PathVariable(required = true) Integer countryId) {
        Country country = countryService.getCountryById(countryId);
        return new ResponseEntity<>(countryMapper.countryToCountryDTO(country, CountryDto.builder()
                .build()), HttpStatus.OK);
    }

    @GetMapping("/complete-info")
    public ResponseEntity<List<CountryCompleteInfo>> getAllCountriesCompleteInfo() {
        List<Country> countries = countryService.getAllCountries();
        List<CountryCompleteInfo> countryCompleteInfoList = countries.stream()
                .map(country -> countryService.getCountryCompleteInfo(country))
                .collect(Collectors.toList());
        return new ResponseEntity<>(countryCompleteInfoList, HttpStatus.OK);
    }
}
