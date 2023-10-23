package com.example.countriescasestudy.Language;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class LanguageService {
    private final LanguageRepository languageRepository;
}
