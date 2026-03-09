package com.sena.app.Entity;

import com.sena.app.Entity.Base.ABaseEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "person")
public class Person extends ABaseEntity {
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "fecha_nacimiento", nullable = true)
    private LocalDate fechaNacimiento;


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
}
