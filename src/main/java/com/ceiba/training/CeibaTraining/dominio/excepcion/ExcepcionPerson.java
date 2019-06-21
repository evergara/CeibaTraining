package com.ceiba.training.CeibaTraining.dominio.excepcion;

public class ExcepcionPerson extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionPerson(String mensaje) {
        super(mensaje);
    }
}