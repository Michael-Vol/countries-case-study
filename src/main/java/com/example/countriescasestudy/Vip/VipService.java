package com.example.countriescasestudy.Vip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
public class VipService {
    private final VipRepository vipRepository;
}
