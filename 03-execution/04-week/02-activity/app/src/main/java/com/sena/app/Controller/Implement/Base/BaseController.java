package com.sena.app.Controller.Implement.Base;

import com.sena.app.Controller.Interface.Base.IBaseController;
import com.sena.app.Entity.Base.ABaseEntity;
import com.sena.app.Service.Interface.Base.IBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T extends ABaseEntity> implements IBaseController<T> {

    protected final IBaseService<T> service;

    protected BaseController(IBaseService<T> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> getsAll() {
        return ResponseEntity.ok(service.getsAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getsById(@PathVariable Long id) {
        // Quitamos el ResponseEntity.ok() exterior
        return service.getsById(id)
                .map(ResponseEntity::ok) // Si existe, retorna ResponseEntity<T> con estatus 200
                .orElse(ResponseEntity.notFound().build()); // Si no, retorna ResponseEntity<T> con estatus 404
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @DeleteMapping("/{id}") // Se recomienda usar DeleteMapping para borrar
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id); // Llamas al método (void) en su propia línea
        return ResponseEntity.noContent().build(); // Esto devuelve un 204 exitoso sin cuerpo
    }


}