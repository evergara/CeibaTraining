package com.ceiba.training.CeibaTraining.infraestructura.controlador;

import com.ceiba.training.CeibaTraining.aplicacion.comando.ComandoPerson;
import com.ceiba.training.CeibaTraining.aplicacion.comando.manejador.ManejadorCrearPerson;
import com.ceiba.training.CeibaTraining.aplicacion.consulta.manejador.ManejadorListarPerson;
import com.ceiba.training.CeibaTraining.dominio.model.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/privada/person")
@Api(tags = { "Controlador Person"})
public class ControllerPerson {

    private final ManejadorListarPerson manejadorListarPerson;
    private final ManejadorCrearPerson manejadoerearPerson;

    public ControllerPerson(ManejadorListarPerson manejadorListarPerson,ManejadorCrearPerson manejadoerearPerson) {
        this.manejadorListarPerson = manejadorListarPerson;
        this.manejadoerearPerson = manejadoerearPerson;
    }

    @RequestMapping(method= RequestMethod.GET)
    @ApiOperation("listar")
    public Collection<Person> listar() {
        return this.manejadorListarPerson.ejecutar();
    }

    @PostMapping
    @ApiOperation("crear")
    public void crear(@RequestBody ComandoPerson comandoPerson) {
        this.manejadoerearPerson.ejecutar(comandoPerson);
    }
}


