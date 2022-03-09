package com.bluelagoon.frontwebservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class FrontWebServiceApplication {

    Logger logger = (Logger) LoggerFactory.getLogger(FrontWebServiceApplication.class);

    @Autowired
    public final DiscoveryClient discoveryClient;

    public FrontWebServiceApplication(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/")
    public String hello() {
        List<ServiceInstance> instances = discoveryClient.getInstances("Netflix_micro_Service 1");
        System.out.println("Host : "+ instances.get(0).getHost());
        System.out.println("Port : " + instances.get(0).getPort());
        logger.info("Host : "+ instances.get(0).getHost());
        logger.info("Port : " + instances.get(0).getPort());
        ServiceInstance test = instances.get(0);
        String hostname = test.getHost();
        int port = test.getPort();
        RestTemplate restTemplate = new RestTemplate();
        String microservice1Address = "http://" + hostname + ":" + port;
        ResponseEntity<String> response =
                restTemplate.getForEntity(microservice1Address, String.class);
        return response.getBody();
    }
}
