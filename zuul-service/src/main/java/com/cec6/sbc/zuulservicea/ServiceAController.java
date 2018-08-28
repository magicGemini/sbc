package com.cec6.sbc.zuulservicea;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @RequestMapping("/compute")
    public String compute() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        return a + " + " + b + " = " + (a + b);
    }
}
