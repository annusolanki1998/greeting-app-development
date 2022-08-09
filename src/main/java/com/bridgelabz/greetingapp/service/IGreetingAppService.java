package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.GreetingAppDTO;
import com.bridgelabz.greetingapp.dto.GreetingUserDTO;
import com.bridgelabz.greetingapp.model.GreetingAppModel;


public interface IGreetingAppService {

    GreetingAppModel getMessage();

    GreetingAppModel greetingMessage(GreetingUserDTO greetingUserDTO);
}
