package com.mercado.todo_application.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    public String displayHome(){
        return "home-page/home";
    }
}
