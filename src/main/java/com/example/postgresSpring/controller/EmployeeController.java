package com.example.postgresSpring.controller;

import com.example.postgresSpring.model.EmployeeDTO;
import com.example.postgresSpring.services.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/employee")
    public EmployeeDTO getEmployee(@RequestParam Integer id){
        //TODO
      return service.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employee){
        //TODO
        return service.createEmployee(employee);
    }

    @PutMapping("/employee")
    public EmployeeDTO putEmployee(@RequestBody EmployeeDTO employee){
        //TODO
        return null;
    }

    @DeleteMapping("/employee")
    public EmployeeDTO deleteEmployee(@RequestParam Integer id){
        //TODO
        return null;
    }
}
