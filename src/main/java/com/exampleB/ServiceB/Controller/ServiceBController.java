package com.exampleB.ServiceB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/serviceb")
public class ServiceBController {

    @Autowired
    private RestTemplate resetTemplate;

    @GetMapping("callservicea")
    public ResponseEntity<String>callServiceA(){
        return resetTemplate.getForEntity("http://servicea/api/servicea/data", String.class);
    }

    @GetMapping("/")
    public String Index(){
        return "Root Service B";
    }
}
