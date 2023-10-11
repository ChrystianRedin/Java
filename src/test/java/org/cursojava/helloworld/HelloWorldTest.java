package org.cursojava.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void saludarConNombre(){
        HelloWorld hello = new HelloWorld();
        hello.setNombre("Chrys Redín");
        String esperado = "Buen dia, ¿Como estás? Chrys Redín";
        String real = hello.saludar();
        Assertions.assertEquals(esperado, real);
    }

    @Test
    void settingNombre(){
        HelloWorld hello = new HelloWorld();

    }


}