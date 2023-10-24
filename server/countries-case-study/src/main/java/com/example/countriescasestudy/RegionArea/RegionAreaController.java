package com.example.countriescasestudy.RegionArea;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regions")
public class RegionAreaController {
    private RegionAreaService regionAreaService;
}
