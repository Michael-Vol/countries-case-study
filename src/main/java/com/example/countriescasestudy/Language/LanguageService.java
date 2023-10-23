package com.example.countriescasestudy.Language;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LanguageService {
    private LanguageRepository languageRepository;
}
