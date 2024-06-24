package com.vanna.visip.mongo.hrapi.department.controllers;

import com.vanna.visip.mongo.hrapi.base.GenericController;
import com.vanna.visip.mongo.hrapi.department.models.Department;
import com.vanna.visip.mongo.hrapi.department.repositories.DepartmentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/departments")
public class DepartmentController extends GenericController<Department, DepartmentRepository> {

    public DepartmentController(DepartmentRepository repository) {
        super(repository);
    }
}
