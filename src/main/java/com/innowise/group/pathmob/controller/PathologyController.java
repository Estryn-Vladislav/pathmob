package com.innowise.group.pathmob.controller;

import com.innowise.group.pathmob.service.PathologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pathologies")
public class PathologyController {

    @Autowired
    private PathologyService service;

    @GetMapping("/{typeId}")
    public String getAllByType(@PathVariable String typeId, Model m) {
        m.addAttribute("pathologies", service.getAllByType(typeId));
        return "pathologies";
    }

//    @PostMapping()
//    public String add(@RequestParam(defaultValue = "") String pathology,
//                      @RequestParam(defaultValue = "") String type,
//                      @RequestParam(defaultValue = "") String model,
//                      @RequestParam(defaultValue = "") String cut,
//                      @RequestParam(defaultValue = "") String hemodynamic,
//                      Model m) {
//        service.add(pathology, type, model, cut, hemodynamic, m.getAttribute("pathologies"));
//        return "pathologies";
//    }

}