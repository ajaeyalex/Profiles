package com.example.Profiles.Controller;

import com.example.Profiles.Services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ProfileController {
    @Autowired
private GreetingsService greetingsService;

    @RequestMapping(path ="hello/{name}", method = RequestMethod.GET)
    public String printHello(@PathVariable(value = "name") String name)
    {
        return greetingsService.sayHello(name);

    }
}
