package com.NEUPursueDream.CodeCountService.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/vue", method = RequestMethod.GET)
    public String sayHelloVue() {
        return "Hello Vue, this message is from Springboot:)";
    }

}
