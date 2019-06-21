package com.ceiba.training.CeibaTraining.infraestructura.adaptador.servicio;


import com.ceiba.training.CeibaTraining.dominio.servicio.ServicioCrearPerson;
import com.ceiba.training.CeibaTraining.infraestructura.adaptador.repositorio.RepositorioPerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearPerson servicioCrearPerson() {
        return new ServicioCrearPerson(new RepositorioPerson());
    }
}

