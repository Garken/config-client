package com.garken.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/greeting")
public class GreetController {

    @Value("${message.greeting}")
    private String greetingMessage;

    @RequestMapping("/sayHi")
    public String sayHi() {
        return greetingMessage;
    }

}