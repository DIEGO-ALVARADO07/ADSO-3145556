package com.sena.app.Controller.Implement.Security;

import com.sena.app.Controller.Implement.Base.BaseController;
import com.sena.app.Entity.Person;
import com.sena.app.Service.Implement.Security.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController extends BaseController<Person> {

    public PersonController(PersonService service) {
        super(service);
    }


    public ResponseEntity<Person> updates(Person entity) {
        return null;
    }


    public ResponseEntity<Void> deletes(Long id) {
        return null;
    }
}