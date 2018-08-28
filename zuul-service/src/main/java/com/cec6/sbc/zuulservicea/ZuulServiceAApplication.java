package com.cec6.sbc.zuulservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServiceAApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Port: ");
        String port = in.nextLine();
        System.out.print("Enter spring.application.name: ");
        String name = in.nextLine();

        SpringApplicationBuilder builder = new SpringApplicationBuilder(ZuulServiceAApplication.class);
        String[] props = new String[2];
        props[0] = "server.port="+port;
        props[1] = "spring.application.name="+name;
        builder.properties(props).run();
    }

//    public static void main(String[] args) {
//        SpringApplication.run(ZuulServiceAApplication.class, args);
//    }
}
