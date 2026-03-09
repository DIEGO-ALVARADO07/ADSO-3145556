package com.sena.app.Repository.Interface.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Base.ABaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

public interface IBaseRepository<T extends ABaseEntity> extends JpaRepository<T, Long>{
    Optional<T> findById(Long id);
    List<T> findAll();
    void deleteById(Long id);
}
