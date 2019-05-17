package com.example.postgresSpring.services;

import com.example.postgresSpring.model.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO getEmployeeById(Integer id);

    EmployeeDTO createEmployee(EmployeeDTO employee);

    EmployeeDTO putEmployee(EmployeeDTO employee);

    EmployeeDTO deleteEmployeeById(Integer id);
}
