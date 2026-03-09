package com.sena.app.Service.Implement.Base;

import com.sena.app.Entity.Base.ABaseEntity;
import com.sena.app.Repository.Interface.Base.IBaseRepository;
import com.sena.app.Service.Interface.Base.IBaseService;

import java.util.List;
import java.util.Optional;

public class BaseService<T extends ABaseEntity> implements IBaseService<T> {
    private IBaseRepository<T> baseRepository;

    public BaseService(IBaseRepository<T> baseRepository){
        this.baseRepository = baseRepository;
    }

    public List<T> getsAll(){
        return baseRepository.findAll();
    }

    public T create(T entity) {
        return baseRepository.save(entity);
    }

    public void deleteById(Long id){
        baseRepository.deleteById(id);
    }

    public Optional<T> getsById(Long id){
        return baseRepository.findById(id);
    }


}
