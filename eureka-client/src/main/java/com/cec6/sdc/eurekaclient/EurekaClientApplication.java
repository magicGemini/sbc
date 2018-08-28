package com.cec6.sdc.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        System.out.println("Enter Port: ");
        String port = new Scanner(System.in).nextLine();
        new SpringApplicationBuilder(EurekaClientApplication.class).properties("server.port=" + port).run();
    }

//	public static void main(String[] args) {
//		SpringApplication.run(EurekaClientApplication.class, args);
//	}
}
