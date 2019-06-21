package com.ceiba.training.CeibaTraining.infraestructura.adaptador.repositorio;

import com.ceiba.training.CeibaTraining.dominio.model.Person;
import com.ceiba.training.CeibaTraining.dominio.puerto.IRepositorioPerson;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class RepositorioPerson implements IRepositorioPerson {
    private static ConcurrentHashMap<String, Person> persons;

    static {
        persons = new ConcurrentHashMap<>();
        persons.put(UUID.randomUUID().toString(),new Person( 1,"emerson", "vergara"));
    }

    @Override
    public Collection<Person> listar() {
        return getPerson();
    }

    @Override
    public void crear(Person person) {
        persons.put(UUID.randomUUID().toString(),person);
    }
    @Override
    public boolean existe(Person persons) {
        return getPerson().stream().anyMatch(fila -> fila.getNombre().equals(persons.getNombre()));
    }

    private static Collection<Person> getPerson() {
        return persons.values();
    }
}
