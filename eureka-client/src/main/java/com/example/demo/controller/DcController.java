package com.example.demo.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JasonZh on 2017/8/26.
 */
@RestController
public class DcController {

    /*@Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getApplications();
        System.out.println(services);
        return services;
    }*/

    @GetMapping("/helloeureka")
    public String hello() {
        return "Hello Eureka!";
    }

}
