package com.cec6.sbc.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping("/compute")
    public String compute() {
        Integer a = (int) (Math.random() * 100);
        Integer b = (int) (Math.random() * 100);
        return a + " + " + b + " =" + computeClient.add(a, b);
    }

}
