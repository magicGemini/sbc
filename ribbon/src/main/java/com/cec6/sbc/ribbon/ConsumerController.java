package com.cec6.sbc.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/useCompute")
    public String useCompute(){
        Integer a = (int)(Math.random() * 100);
        Integer b = (int)(Math.random() * 100);
        return a+" + "+b+" = " + restTemplate.getForEntity("http://SERVICE-COMPUTE/add?a="+a+"&b="+b,String.class).getBody();
    }

}
