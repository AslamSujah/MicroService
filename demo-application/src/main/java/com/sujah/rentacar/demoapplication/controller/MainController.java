package com.sujah.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Spring";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Spring from post method";
    }

}
