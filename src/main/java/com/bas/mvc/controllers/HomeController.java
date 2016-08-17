package com.bas.mvc.controllers;

import com.bas.mvc.data.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by bas on 9-8-16.
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String goHome(Model model) {
        Project project = new Project();
        project.setName("First project");
        project.setSponsor("Nasa");
        project.setDescription("description nasa");

        model.addAttribute("currentProject",project);
        return "home";
    }

}
