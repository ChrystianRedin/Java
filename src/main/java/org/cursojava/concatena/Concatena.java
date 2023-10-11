package org.cursojava.concatena;

public class Concatena {
    private String cadena1;
    private String cadena2;

    private int numero1;
    private int numero2;

    public String concatenar(String cadena1, String cadena2){
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
        return this.cadena1 + " " + this.cadena2;
    }

    public int sumar(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        return numero1 + numero2;
    }

}
