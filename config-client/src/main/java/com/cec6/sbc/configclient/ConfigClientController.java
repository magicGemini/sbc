package com.cec6.sbc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${from}")
    private String from;


    @RequestMapping("/getFrom")
    public String getFrom(){
        return "from: " + from;
    }

}
