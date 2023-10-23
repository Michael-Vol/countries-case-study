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
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @Column(name = "official", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean official = false;
}