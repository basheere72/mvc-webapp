package com.bas.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bas on 10-8-16.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {


    @RequestMapping(value = "/add", method=RequestMethod.GET)
    public String addProject(){
        System.out.println("invoking add project");
        return "project_add";
    }

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    public String saveProject() {
        System.out.println("invoking save project");
        return "project_add";
    }
}
