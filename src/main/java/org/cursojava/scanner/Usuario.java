package org.cursojava.scanner;

public class Usuario {
    private String nombre;
    private String empleo;

    public String retornaUsuario(){
        return "Nombre: "+ nombre + "\n" + "Empleo: " + empleo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }
}
