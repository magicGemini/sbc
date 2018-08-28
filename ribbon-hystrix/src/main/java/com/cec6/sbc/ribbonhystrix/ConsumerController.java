package com.cec6.sbc.ribbonhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    ComputeService computeService;

    @RequestMapping("/compute")
    public String compute() {
        Integer a = (int) (Math.random() * 100);
        Integer b = (int) (Math.random() * 100);
        Integer r = computeService.add(a,b);
        if(r == -1)
            return "error";
        return a + " + " + b + " = " + r;
    }

}
