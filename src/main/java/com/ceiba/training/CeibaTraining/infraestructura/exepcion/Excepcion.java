package com.ceiba.training.CeibaTraining.infraestructura.exepcion;

public class Excepcion {
    private String nombreExcepcion;
    private String mensaje;

    public Excepcion(String nombreExcepcion, String mensaje) {
        this.nombreExcepcion = nombreExcepcion;
        this.mensaje = mensaje;
    }

    public String getNombreExcepcion() {
        return nombreExcepcion;
    }

    public String getMensaje() {
        return mensaje;
    }
}
