package com.bridgelabz.greetingapp.service;


import com.bridgelabz.greetingapp.dto.GreetingAppDTO;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;


@Service
public class GreetingAppService implements IGreetingAppService {
    private AtomicLong count = new AtomicLong();
    private static final String template = "Hello, %s!";
    @Override
    public GreetingAppDTO getMessage() {
        return new GreetingAppDTO(count.incrementAndGet(),
                String.format(template, "World"));
    }
}
