package com.cruddemo.example.Controller;

import com.cruddemo.example.Entity.Department;
import com.cruddemo.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/service")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/service")
    public List<Department>fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/service/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/service/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department has been deleted";
    }
    @PutMapping("/service/{id}")
    public Department updateDepartment(@PathVariable("id")Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);

    }
}
