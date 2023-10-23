package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.Region.Region;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "countries", schema = "nation")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", updatable = false, nullable = false)
    private Integer country_id;

    @Column(name = "name")
    private String name;

    @Column(name = "area", length = 10, precision = 2, nullable = false)
    private Double area;

    @Column(name = "national_day", columnDefinition = "DATE")
    private Date national_day;

    @Column(name = "country_code2", length = 2)
    private String country_code2;

    @Column(name = "country_code3", length = 3)
    private String country_code3;

    @Column(name = "region_id")
    private Integer region_id;

    @ManyToOne
    @JoinColumn(name = "region_region_id")
    private Region region;

}
