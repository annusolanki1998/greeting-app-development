package com.bridgelabz.greetingapp.model;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "greeting")
public class GreetingAppModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String message;

    public GreetingAppModel(String message) {
        this.message = message;
    }

    public GreetingAppModel() {

    }
}
