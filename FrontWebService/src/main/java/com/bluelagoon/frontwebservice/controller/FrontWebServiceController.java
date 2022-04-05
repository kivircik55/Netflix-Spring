package com.bluelagoon.frontwebservice.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Locale;


@RestController
    public class FrontWebServiceController {
        @Autowired
        DiscoveryClient discoveryClient;
        @HystrixCommand(fallbackMethod = "defaultMessage")
        @GetMapping("/")
        public String hello() {
            List<ServiceInstance> instances = discoveryClient.getInstances("NETFLIX_MICRO_SERVICE");
            ServiceInstance test = instances.get(0);
            String hostname = test.getHost();
            int port = test.getPort();
            RestTemplate restTemplate = new RestTemplate();
            String microservice1Address = "http://" + hostname + ":" + port;
            ResponseEntity<String> response =
                    restTemplate.getForEntity(microservice1Address, String.class);
            String s = response.getBody().toUpperCase(Locale.ROOT);
            return s;
        }
    public String defaultMessage() {
        return "Le service est down !";
    }
    }
