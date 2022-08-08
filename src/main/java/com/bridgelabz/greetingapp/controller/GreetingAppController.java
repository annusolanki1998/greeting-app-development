package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.GreetingAppDTO;
import com.bridgelabz.greetingapp.service.IGreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private IGreetingAppService greetingAppService;
    @GetMapping("/")
    public GreetingAppDTO greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingAppDTO(counter.incrementAndGet(),
                String.format(template, name));
    }
    @GetMapping("")
    public GreetingAppDTO sayHello(){
    return greetingAppService.getMessage();
    }


}
