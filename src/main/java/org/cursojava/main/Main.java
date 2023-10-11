package org.cursojava.main;

import org.cursojava.caracterEspecial.CaracterEspecial;
import org.cursojava.concatena.Concatena;
import org.cursojava.helloworld.HelloWorld;
import org.cursojava.scanner.Usuario;
import org.cursojava.variables.Variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 7 */
        String nombreUsuario;
        String nombre, empleo;
        Usuario usuario = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        nombre = scan.nextLine();
        usuario.setNombre(nombre);
        System.out.println("A que te dedicas:");
        empleo = scan.nextLine();
        usuario.setEmpleo(empleo);
        nombreUsuario = usuario.retornaUsuario();
        System.out.println(nombreUsuario);

        /* 6 */
        /*String cadena, nombre;
        nombre = "Karla";
        CaracterEspecial caracter = new CaracterEspecial();
        caracter.setCadena("Nueva linea: \n" + nombre );
        cadena = caracter.getCadena();
        System.out.println(cadena);
        caracter.setCadena("Tabulador: \t" + nombre);
        cadena = caracter.getCadena();
        System.out.println(cadena);
        caracter.setCadena("Retroceso: \b\b" + nombre);
        cadena= caracter.getCadena();
        System.out.println(cadena);
        caracter.setCadena("Comilla Simple: '" + nombre + "'");
        cadena = caracter.getCadena();
        System.out.println(cadena);
        caracter.setCadena("Comilla doble: \"" + nombre + "\"" );
        cadena = caracter.getCadena();
        System.out.println(cadena);*/

        /* 5 */
        /*Concatena concatena = new Concatena();
        String resultadoCadena;
        resultadoCadena = concatena.concatenar("Hola", "Mundo");
        System.out.println("resultadoCadena = " + resultadoCadena);
        int resultadoNumero;
        resultadoNumero = concatena.sumar(15,35);
        System.out.println("resultadoNumero = " + resultadoNumero);*/

        /* 4 */
        /*Variables variable = new Variables();
        variable.setMiVariableCadena("Hola");
        var variable2 = variable.getMiVariableCadena();
        System.out.println(variable2);
        variable.setMiVariableEntera(35);
        var variable3 = variable.getMiVariableEntera();
        System.out.println("variable3 = " + variable3);*/

        /* 3 */
         /*String saludo;
        Variables variableStr = new Variables();
        variableStr.setMiVariableCadena("Saludos");
        saludo = variableStr.getMiVariableCadena();
        System.out.println("saludo = " + saludo);
        variableStr.setMiVariableCadena("Adios");
        saludo = variableStr.getMiVariableCadena();
        System.out.println("saludo = " + saludo);*/

        /* 2 */
        // Dato Primitivo numero:
        /*int numeroEntero;
        Variables variable1 = new Variables();
        variable1.setMiVariableEntera(10);
        numeroEntero = variable1.getMiVariableEntera();
        System.out.println("numeroEntero = " + numeroEntero);
        //se cambia el valor de la variable
        variable1.setMiVariableEntera(5);
        numeroEntero= variable1.getMiVariableEntera();
        System.out.println("numeroEntero = " + numeroEntero);*/

        /* 1 */
        /*String saludo;
        HelloWorld hello = new HelloWorld();
        hello.setNombre("Chrys Redín");
        saludo = hello.saludar();
        System.out.println(saludo);*/

    }
}
