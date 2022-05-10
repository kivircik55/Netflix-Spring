package com.bluelagoon.webservice.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello user welcome !";
    }
    
}
