package com.example.countriescasestudy.Language;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

@RequestMapping("/languages")
public class LanguageController {
    private LanguageService languageService;
}
