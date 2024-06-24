package com.vanna.visip.mongo.hrapi.employees.controllers;

import com.vanna.visip.mongo.hrapi.base.GenericController;
import com.vanna.visip.mongo.hrapi.employees.models.Employee;
import com.vanna.visip.mongo.hrapi.employees.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/employees")
public class EmployeeController extends GenericController<Employee, EmployeeRepository> {

    public EmployeeController(EmployeeRepository repository) {
        super(repository);
    }
}
