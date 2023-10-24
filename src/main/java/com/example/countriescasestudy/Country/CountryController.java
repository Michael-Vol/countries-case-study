package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.Country.dao.CountryCompleteInfo;
import com.example.countriescasestudy.Country.dao.DateInfo;
import com.example.countriescasestudy.Country.dto.CountryDto;
import com.example.countriescasestudy.Country.dto.CountryMapper;
import com.example.countriescasestudy.Country.dto.GetCountriesResponse;
import com.example.countriescasestudy.Region.Region;
import com.example.countriescasestudy.Region.RegionService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
@Builder
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;
    private final CountryMapper countryMapper;
    private final RegionService regionService;

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
        List<CountryCompleteInfo> results = countryService.getCountryCompleteInfo();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @GetMapping("/complete-info/search")
    public ResponseEntity<List<CountryCompleteInfo>> searchCountriesCompleteInfo(@RequestParam(required = false) String regionName,
                                                                                 @RequestParam(required = false) Integer dateFrom,
                                                                                 @RequestParam(required = false) Integer dateTo) {
        if (regionName == null && dateFrom == null && dateTo == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        DateInfo dateInfo = DateInfo.builder().dateFrom(dateFrom).dateTo(dateTo).build();
        Region region = regionService.findRegionByName(regionName);
        List<CountryCompleteInfo> results = countryService.searchCountryStats(region, dateInfo);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
