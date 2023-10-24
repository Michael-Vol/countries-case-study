package com.example.countriescasestudy.Region;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class RegionService {
    private final RegionRepository regionRepository;

    public Region findRegionById(Integer regionId) {
        return regionRepository.findById(regionId)
                .orElseThrow(() -> new IllegalStateException("Region with id " + regionId + " does not exist"));
    }

    public Region findRegionByName(String regionName) {
        return regionRepository.findByName(regionName);
    }

}
