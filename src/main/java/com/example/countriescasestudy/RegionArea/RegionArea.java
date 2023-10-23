package com.example.countriescasestudy.RegionArea;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "region_areas", schema = "nation")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegionArea {
    @Id
    @Column(name = "region_name", nullable = false, length = 100)
    private String regionName;

    @Column(name = "region_area", nullable = false, precision = 15, scale = 2)
    private BigDecimal regionArea;

}