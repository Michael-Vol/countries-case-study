package com.example.countriescasestudy.CountryLanguage;

import com.example.countriescasestudy.Country.Country;
import com.example.countriescasestudy.Language.Language;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country_languages", schema = "nation")
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;

    //    @Column(name = "country_id", nullable = false)
    //    private Integer countryId;
    //
    //    @Column(name = "language_id", nullable = false)
    //    private Integer languageId;
    //
    @MapsId("countryId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @MapsId("languageId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @Column(name = "official", nullable = false)
    private Boolean official = false;

}