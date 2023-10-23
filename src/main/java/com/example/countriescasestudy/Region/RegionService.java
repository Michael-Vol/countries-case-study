package com.example.countriescasestudy.Region;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegionService {
    RegionRepository regionRepository;

}
