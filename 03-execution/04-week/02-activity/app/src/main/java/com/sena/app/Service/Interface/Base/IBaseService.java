package com.sena.app.Service.Interface.Base;

import com.sena.app.Entity.Base.ABaseEntity;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T extends ABaseEntity>{
    Optional<T> getsById(Long id);
    List<T> getsAll();
    void deleteById(Long entity);
    T create(T entity);
}
