package com.vanna.visip.mongo.hrapi.employees.models;

import com.vanna.visip.mongo.hrapi.base.BaseModel;
import com.vanna.visip.mongo.hrapi.department.models.Department;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Document(collection = "employees")
@EqualsAndHashCode(callSuper = true)
public class Employee extends BaseModel {

    @Field("name")
    private String name;

    @Field("dateOfJoining")
    private LocalDateTime dateOfJoining;

    @Field("departmentId")
    @DocumentReference(collection = "departments")
    private Department department;
}
