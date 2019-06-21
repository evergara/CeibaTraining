package com.ceiba.training.CeibaTraining.aplicacion.comando.manejador;

import com.ceiba.training.CeibaTraining.aplicacion.comando.ComandoPerson;
import com.ceiba.training.CeibaTraining.dominio.model.Person;
import com.ceiba.training.CeibaTraining.dominio.servicio.ServicioCrearPerson;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPerson {
    private final ServicioCrearPerson servicioCrearPerson;

    public ManejadorCrearPerson(ServicioCrearPerson servicioCrearPerson){
        this.servicioCrearPerson = servicioCrearPerson;
    }

    public void  ejecutar(ComandoPerson comandoPerson){
        this.servicioCrearPerson.ejecutar(new Person(comandoPerson.getId(), comandoPerson.getNombre(), comandoPerson.getApellido()));
    }
}
