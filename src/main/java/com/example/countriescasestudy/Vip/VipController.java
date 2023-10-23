package com.example.countriescasestudy.Vip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vips")
public class VipController {
    private VipService vipService;
}
