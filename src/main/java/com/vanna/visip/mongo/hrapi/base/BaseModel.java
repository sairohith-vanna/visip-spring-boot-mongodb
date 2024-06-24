package com.vanna.visip.mongo.hrapi.base;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public abstract class BaseModel {

    @Id
    private String id;
}
