package com.example.countriescasestudy.Language;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "languages", schema = "nation")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id", nullable = false)
    private Integer id;

    @Column(name = "language", nullable = false, length = 50)
    private String language;
    //
    //    @OneToMany(mappedBy = "language")
    //    private List<CountryLanguage> countryLanguages = new LinkedList<>();

}