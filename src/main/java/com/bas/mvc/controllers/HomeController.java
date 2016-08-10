package com.bas.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by bas on 9-8-16.
 */
@Controller
public class HomeController {


    @RequestMapping("/home")
    public String goHome() {
        return "home";
    }
}
