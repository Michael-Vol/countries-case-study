package com.example.countriescasestudy.CountryLanguage;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CountryLanguageId implements Serializable {
    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Column(name = "language_id", nullable = false)
    private Integer languageId;
}