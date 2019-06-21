package com.ceiba.training.CeibaTraining.dominio.model;

import com.ceiba.training.CeibaTraining.dominio.excepcion.ExcepcionPerson;

public class ValidadorArgumento {

    private ValidadorArgumento() {}

    public static void validarObligatorio(Object valor, String mensaje) {
        if (valor == null) {
            throw new ExcepcionPerson(mensaje);
        }
    }

    public static void validarLongitud(String valor,int longitud,String mensaje){
        if(valor.length() < longitud){
            throw new ExcepcionPerson(mensaje);
        }
    }
}
