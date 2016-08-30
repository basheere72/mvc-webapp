package com.bas.mvc.controllers;

import com.bas.mvc.data.entities.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/resource")
public class ResourceController {

	@RequestMapping("/add")
	public String add(Model model) {
		List<String> options = new LinkedList<>(Arrays.asList("Material", "Other", "Staff", "Technical Equipment"));
		
		List<String> radios = new LinkedList<>(Arrays.asList("Hours", "Piece", "Tons"));
		model.addAttribute("radioOptions", radios);
		
		List<String> checks = new LinkedList<>(Arrays.asList("Lead Time", "Special Rate", "Requires Approval"));
		model.addAttribute("checkOptions", checks);
		
		model.addAttribute("typeOptions", options);
		model.addAttribute("resource", new Resource());
		return "resource_add";
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute Resource resource) {
		System.out.println(resource);
		return "redirect:/resource/add";
	}
}
