package org.bookme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/login")
    @ResponseBody
    public ResponseEntity login(@RequestParam(name="name", required=true, defaultValue="Stranger") String name,
                                @RequestParam(name="password", required=true, defaultValue="no password") String pwd) {
        String userVal = "";
        if(name.equals("Stranger"))
            userVal += "Hello " + name;
        if(pwd.equals("no password"))
            userVal += " " + pwd;
        if(userVal.equals(""))
            userVal = "hello : "+ name;


        return new ResponseEntity("login service ready, " + userVal, HttpStatus.OK);
    }
}
