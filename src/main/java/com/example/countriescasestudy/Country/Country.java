package com.example.countriescasestudy.Country;

import com.example.countriescasestudy.CountryLanguage.CountryLanguage;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "countries", schema = "nation")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", updatable = false, nullable = false)
    private Integer countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "area", precision = 2, nullable = false)
    private Double area;

    @Column(name = "national_day", columnDefinition = "DATE")
    private Date nationalDay;

    @Column(name = "country_code2", length = 2)
    private String countryCode2;

    @Column(name = "country_code3", length = 3)
    private String countryCode3;

    //    @ManyToOne
    //    @JoinColumn(name = "region_id")
    //    private Region region;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CountryLanguage> countryLanguages = new LinkedList<>();
    //
    //    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    //    private List<CountryStats> countryStats = new LinkedList<>();

}
