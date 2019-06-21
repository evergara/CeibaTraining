package com.ceiba.training.CeibaTraining.aplicacion.consulta.manejador;

import com.ceiba.training.CeibaTraining.dominio.model.Person;
import com.ceiba.training.CeibaTraining.dominio.puerto.IRepositorioPerson;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ManejadorListarPerson {

    private final IRepositorioPerson repositorioPerson;

    public ManejadorListarPerson(IRepositorioPerson daoPerson) {
        this.repositorioPerson = daoPerson;
    }

    public Collection<Person> ejecutar() {
        return this.repositorioPerson.listar();
    }
}
