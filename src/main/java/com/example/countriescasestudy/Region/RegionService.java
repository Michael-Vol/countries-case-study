package com.example.countriescasestudy.Region;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class RegionService {
    private final RegionRepository regionRepository;

}
