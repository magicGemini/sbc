package com.cec6.sbc.ribbonhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addFallback")
    public Integer add(Integer a, Integer b){
        return restTemplate.getForEntity("http://SERVICE-COMPUTE/add?a=" + a + "&b=" + b, Integer.class).getBody();
    }

    public Integer addFallback(Integer a, Integer b){
        return -1;
    }

}