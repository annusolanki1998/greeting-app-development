package com.bridgelabz.greetingapp.service;


import com.bridgelabz.greetingapp.dto.GreetingAppDTO;
import com.bridgelabz.greetingapp.dto.GreetingUserDTO;
import com.bridgelabz.greetingapp.model.GreetingAppModel;
import com.bridgelabz.greetingapp.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;


@Service
public class GreetingAppService implements IGreetingAppService {
    private AtomicLong count = new AtomicLong();
    private static final String template = "Hello, %s!";

    @Autowired
    private GreetingAppRepository greetingAppRepository;
    @Override
    public GreetingAppModel getMessage() {
        return greetingAppRepository.save(new GreetingAppModel(String.format(template, "Annu !")));
    }

    @Override
    public GreetingAppModel greetingMessage(GreetingUserDTO greetingUserDTO) {
        return greetingAppRepository.save(new GreetingAppModel(String.format(template, greetingUserDTO.getFirstName()) + greetingUserDTO.getLastName()));
    }
}
