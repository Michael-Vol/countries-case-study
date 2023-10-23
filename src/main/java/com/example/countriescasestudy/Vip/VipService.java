package com.example.countriescasestudy.Vip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VipService {
    private VipRepository vipRepository;
}
