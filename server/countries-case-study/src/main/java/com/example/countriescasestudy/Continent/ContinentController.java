package com.example.countriescasestudy.Continent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/continents")
@CrossOrigin("*")
@Builder
@AllArgsConstructor
public class ContinentController {
    private final ContinentService continentService;
}
