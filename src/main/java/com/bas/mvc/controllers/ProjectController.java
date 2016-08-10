package com.bas.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bas on 10-8-16.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {


    @RequestMapping("/add")
    public String add(){
        return "add project";
    }
}
