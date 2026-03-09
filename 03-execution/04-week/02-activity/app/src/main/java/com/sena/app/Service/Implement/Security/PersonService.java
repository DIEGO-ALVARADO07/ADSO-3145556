package com.sena.app.Service.Implement.Security;

import com.sena.app.Entity.Person;
import com.sena.app.Repository.Interface.Base.IBaseRepository;
import com.sena.app.Service.Implement.Base.BaseService;
import com.sena.app.Service.Interface.Base.IBaseService;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<Person>{
    public PersonService(IBaseRepository<Person> baseRepository) {
        super(baseRepository);
    }
}
