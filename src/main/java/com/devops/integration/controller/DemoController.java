package com.devops.integration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String checkDemo(){
        return "Hallo.... Ich bin Amruta. Ich habe am 20 Dec Geburstag";
    }
}
