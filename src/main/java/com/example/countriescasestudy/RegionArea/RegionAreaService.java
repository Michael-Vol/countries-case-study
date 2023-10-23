package com.example.countriescasestudy.RegionArea;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegionAreaService {
    RegionAreaRepository regionAreaRepository;
}
