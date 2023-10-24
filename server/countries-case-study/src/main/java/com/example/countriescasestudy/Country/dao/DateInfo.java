package com.example.countriescasestudy.Country.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class DateInfo {
    Integer dateFrom;
    Integer dateTo;
}
