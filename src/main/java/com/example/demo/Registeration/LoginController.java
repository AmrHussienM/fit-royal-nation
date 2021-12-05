package com.example.demo.Registeration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping(path = "/login")
    public String login(){
        return "login success";
    }
}
