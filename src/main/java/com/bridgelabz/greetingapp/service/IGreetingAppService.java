package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.GreetingAppDTO;
import com.bridgelabz.greetingapp.dto.GreetingUserDTO;


public interface IGreetingAppService {

    GreetingAppDTO getMessage();

    GreetingAppDTO greetingMessage(GreetingUserDTO greetingUserDTO);
}
