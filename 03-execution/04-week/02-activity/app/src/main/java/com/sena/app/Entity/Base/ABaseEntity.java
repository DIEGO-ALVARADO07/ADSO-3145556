package com.sena.app.Entity.Base;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
}
