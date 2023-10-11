package org.cursojava.helloworld;

public class HelloWorld {
    private String nombre;

    public String saludar() {
        return "Buen dia, ¿Como estás? "+this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
