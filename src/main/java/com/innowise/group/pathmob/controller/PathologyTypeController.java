package com.innowise.group.pathmob.controller;

import com.innowise.group.pathmob.service.PathologyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PathologyTypeController {

    @Autowired
    private PathologyTypeService service;

    @GetMapping("/")
    public String home(Model m) {
        m.addAttribute("types", service.getAll());
        return "home";
    }

}
