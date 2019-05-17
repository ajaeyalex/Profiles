package com.example.Profiles.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class GreetingsServiceGerman implements GreetingsService {
    @Override
    public String sayHello(String name) {
        return "Halo "+name;
    }
}
