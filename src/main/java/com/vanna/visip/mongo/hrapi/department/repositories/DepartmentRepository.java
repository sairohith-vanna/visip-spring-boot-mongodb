package com.vanna.visip.mongo.hrapi.department.repositories;

import com.vanna.visip.mongo.hrapi.department.models.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
}
