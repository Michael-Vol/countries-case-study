package com.example.countriescasestudy.RegionArea;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class RegionAreaService {
    private final RegionAreaRepository regionAreaRepository;
}
