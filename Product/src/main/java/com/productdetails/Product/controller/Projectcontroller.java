package com.productdetails.Product.controller;

import com.productdetails.Product.Model.Project;
import com.productdetails.Product.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Projectcontroller {

    @Autowired
    private ProjectService service;

@PostMapping("/project")
    public Project addProject(@RequestBody Project project){
        return service.saveProducts(project);
    }
    @GetMapping("/project")
public List<Project> getAllProjects(){
    return service.getAllProjects();

}  @GetMapping("/project/{id}")
    public Project getProjectsById(@PathVariable ("id") int id){
        return service.getProjectById(id);

    }@DeleteMapping("/project/{id}")
    public String  deleteById(@PathVariable("id") int id){
    service.DeleteById(id);
    return "Application Deleted";
    }
    }



