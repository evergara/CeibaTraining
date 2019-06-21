package com.ceiba.training.CeibaTraining.dominio.puerto;

import com.ceiba.training.CeibaTraining.dominio.model.Person;

import java.util.Collection;

public interface IRepositorioPerson {

    /**
     * Permite listar las personas
     * @return
     */
    Collection<Person> listar();

    /**
     * Permite crear las personas
     * @param person
     */
    void crear(Person person);

    /**
     * Permite determinar si previamente se registro la personas
     * @param person
     * @return si existe o no
     */
    boolean existe(Person person);
}
