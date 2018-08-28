package com.cec6.sdc.eurekaclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputeServiceController {

    private final Logger logger = LoggerFactory.getLogger(ComputeServiceController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

//    @RequestMapping("/getRegisteredCompute")
//    public String getRegistered(){
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("{\"registered services\":[");
//
//        List<ServiceInstance> list = discoveryClient.getInstances("SERVICE-COMPUTE");
//        for (int i = 0; i < list.size();i++){
//            ServiceInstance instance = list.get(i);
//            String host = instance.getHost();
//            String service_id = instance.getServiceId();
//            if (i == 0)
//                sb.append("{\"host\":\""+host+"\",\"service_id\":\""+service_id+"\"}");
//            else
//                sb.append(",{\"host\":\""+host+"\",\"service_id\":\""+service_id+"\"}");
//        }
//        sb.append("]}");
//        return sb.toString();
//    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        Integer r = a + b;
        logger.info("/add?a="+a+"&b="+b+"");
        return r;
    }

}
