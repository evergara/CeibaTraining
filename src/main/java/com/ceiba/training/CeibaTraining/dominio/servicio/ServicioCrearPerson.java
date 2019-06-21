package com.ceiba.training.CeibaTraining.dominio.servicio;

import com.ceiba.training.CeibaTraining.dominio.excepcion.ExcepcionPerson;
import com.ceiba.training.CeibaTraining.dominio.model.Person;
import com.ceiba.training.CeibaTraining.dominio.puerto.IRepositorioPerson;

public class ServicioCrearPerson {

    private static final String LA_PERSONA_YA_EXISTE_EN_EL_SISTEMA = "La persona ya existe en el sistema";

    private IRepositorioPerson repositorioPersona;

    public ServicioCrearPerson(IRepositorioPerson repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public void ejecutar(Person person) {
        validarExistenciaPrevia(person);
        this.repositorioPersona.crear(person);
    }

    private void validarExistenciaPrevia(Person person) {
        boolean existe = this.repositorioPersona.existe(person);
        if(existe) {
            throw new ExcepcionPerson(LA_PERSONA_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
