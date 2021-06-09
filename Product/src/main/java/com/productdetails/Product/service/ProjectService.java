package com.productdetails.Product.service;

import com.productdetails.Product.Model.Project;
import com.productdetails.Product.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo repo;

    public Project saveProducts(Project project) {
        return repo.save(project);
    }

public List<Project> getAllProjects(){
        return repo.findAll();
}
public  Project getProjectById(int id){
        return repo.findById(id).get();
}
public String DeleteById(int id){
        repo.deleteById(id);
        return("Applicaton Deleted");
}
}
