package com.example.postgresSpring.services.impl;

import com.example.postgresSpring.model.EmployeeDTO;
import com.example.postgresSpring.model.Employee;
import com.example.postgresSpring.repository.EmployeeRepository;
import com.example.postgresSpring.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeRepository repository;

    @Override
    public EmployeeDTO getEmployeeById(Integer id){
        Employee result = repository.findOne(id);
        EmployeeDTO resultDTO = new EmployeeDTO();
        BeanUtils.copyProperties(result, resultDTO);
        return resultDTO;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);

        //I want to save password to the database
        Integer org_id = 5;
        employee.setOrganisation_id(org_id);
        employee.setDesignation("Intern");
        Employee result = repository.save(employee);
        EmployeeDTO resultDTO = new EmployeeDTO();
        BeanUtils.copyProperties(result, resultDTO);
        return resultDTO;
    }

    @Override
    public EmployeeDTO putEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();


        //I want to save password to the database
        Integer org_id = 19;
        employee.setOrganisation_id(org_id);
        employee.setDesignation("Employee");
        Employee result = repository.save(employee);
        EmployeeDTO resultDTO = new EmployeeDTO();
        BeanUtils.copyProperties(result, resultDTO);
        return resultDTO;
    }

    @Override
    public EmployeeDTO deleteEmployeeById(Integer id) {

        EmployeeDTO employeeDTO = getEmployeeById(id);
        if (employeeDTO != null){
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDTO, employee);
            repository.delete(employee);
        }

        return employeeDTO;
    }
}
