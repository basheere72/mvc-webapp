package com.bas.mvc.controllers;

import com.bas.mvc.data.entities.Project;
import com.bas.mvc.data.services.ProjectService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by bas on 10-8-16.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model,@PathVariable("projectId") Long projectId){
        model.addAttribute("project",projectService.find(projectId));
        return "project";
    }

    @RequestMapping(value = "/find")
    public String find(Model model) {
        model.addAttribute("projects",projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject() {
        System.out.println("invoking add project");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute Project project) {
        System.out.println(project);
        return "project_add";
    }
}
