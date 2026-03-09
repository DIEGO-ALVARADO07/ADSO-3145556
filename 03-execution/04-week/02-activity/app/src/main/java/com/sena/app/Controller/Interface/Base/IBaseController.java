package com.sena.app.Controller.Interface.Base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IBaseController<T> {

    @GetMapping
    ResponseEntity<List<T>> getsAll();

    @GetMapping("/{id}")
    ResponseEntity<T> getsById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<T> create(@RequestBody T entity);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteById(@PathVariable Long id);

}