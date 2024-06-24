package com.vanna.visip.mongo.hrapi.base;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
public abstract class GenericController<T, R extends MongoRepository<T, String>> {

    private final R repository;

    @GetMapping
    public ResponseEntity<List<T>> getAllData() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<T> getDataForId(@PathVariable("id") String id) {
        return ResponseEntity.ok(repository.findById(id).orElse(null));
    }

    @PostMapping
    public ResponseEntity<T> saveData(@RequestBody T data) {
        return ResponseEntity.ok(repository.save(data));
    }
}
