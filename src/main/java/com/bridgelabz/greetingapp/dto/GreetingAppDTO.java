package com.bridgelabz.greetingapp.dto;

import lombok.Data;

@Data
public class GreetingAppDTO {
    private long id;
    private String message;

    public GreetingAppDTO(long id, String message) {
        this.id = id;
        this.message = message;
    }

}
