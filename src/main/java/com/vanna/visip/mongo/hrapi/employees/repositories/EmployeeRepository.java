package com.vanna.visip.mongo.hrapi.employees.repositories;

import com.vanna.visip.mongo.hrapi.employees.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
