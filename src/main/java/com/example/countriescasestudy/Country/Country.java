package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.CountryLanguage.CountryLanguage;
import com.example.countriescasestudy.CountryStats.CountryStats;
import com.example.countriescasestudy.Region.Region;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "countries", schema = "nation")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "area", nullable = false)
    private Float area;

    @Column(name = "national_day")
    private LocalDate nationalDay;

    @Column(name = "country_code2", length = 2)
    private String countryCode2;

    @Column(name = "country_code3", length = 3)
    private String countryCode3;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    @OneToMany(mappedBy = "country")
    private List<CountryLanguage> countryLanguages = new ArrayList<>();

    @OneToMany(mappedBy = "country")
    private List<CountryStats> countryStats = new ArrayList<>();

}