package com.example.postgresSpring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.postgresSpring.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    //Employee findByName(Integer id);
    Employee findById(Integer id);

    /* custom query method
    // Employee findByNameAndAge(String name, Integer age);

    // @Query("SELECT * FROM Employee")
    // int findByNameAndGetMaxValue(String name);


    //It is used when you want spring to pass the query as it is to the db
    // @Query("SELECT * FROM Employee", nativeQuery = true)
    // int findByNameAndGetMaxValue(String name);
*/
}
