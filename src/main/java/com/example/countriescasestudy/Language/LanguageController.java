package com.example.countriescasestudy.Language;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguageController {
    private LanguageService languageService;
}
