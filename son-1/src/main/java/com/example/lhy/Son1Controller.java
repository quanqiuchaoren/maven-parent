package com.example.lhy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Son1Controller {
    @RequestMapping("/getName")
    public String getName() {
        return "son1";
    }
}
