package org.bookme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookMeController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome to book me API!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
