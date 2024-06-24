package com.vanna.visip.mongo.hrapi.department.models;

import com.vanna.visip.mongo.hrapi.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "departments")
@EqualsAndHashCode(callSuper = true)
public class Department extends BaseModel {

    @Field("departmentName")
    private String departmentName;

    @Field("category")
    private String category;

}
