package com.ceiba.training.CeibaTraining.dominio.model;

public class Person {
    //validaciones de datos
    private static final int TAMANO_MINIMO_NOMBRE = 4;
    private static final String EL_NOMBRE_DEBE_TENER_MINIMO_LETRAS = "El nombre debe tener mínimo %s letras.";
    private static final String EL_NOMBRE_ES_UN_DATO_OBLIGATORIO = "El nombre es un dato obligatorio.";

    private static final int TAMANO_MINIMO_APPELLIDO = 6;
    private static final String EL_APPELLIDO_DEBE_TENER_MINIMO_LETRAS = "El apellido debe tener mínimo %s letras.";
    private static final String EL_APPELLIDO_ES_UN_DATO_OBLIGATORIO = "El apellido es un dato obligatorio.";

    private Integer id;
    private String nombre;
    private String apellido;

    public Person(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Person(String nombre, String apellido) {
        ValidadorArgumento.validarObligatorio(nombre, EL_NOMBRE_ES_UN_DATO_OBLIGATORIO);
        ValidadorArgumento.validarLongitud(nombre, TAMANO_MINIMO_NOMBRE, String.format(EL_NOMBRE_DEBE_TENER_MINIMO_LETRAS,TAMANO_MINIMO_NOMBRE));

        ValidadorArgumento.validarObligatorio(nombre, EL_APPELLIDO_ES_UN_DATO_OBLIGATORIO);
        ValidadorArgumento.validarLongitud(nombre, TAMANO_MINIMO_APPELLIDO, String.format(EL_APPELLIDO_DEBE_TENER_MINIMO_LETRAS,TAMANO_MINIMO_NOMBRE));

        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}