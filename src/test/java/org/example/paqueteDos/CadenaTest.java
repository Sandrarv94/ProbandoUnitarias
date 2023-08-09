package org.example.paqueteDos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadenaTest {
    private Cadena cadena;

    @BeforeEach
    public void setUp(){
        this.cadena = new Cadena();
        this.cadena.setNumeroPuntos(200);
        System.out.println("ya ganamos este modulo");
    }

    @Test
    public void registrarClienteCorrecto(){
        String nombreCliente = "Sandra Rios";
        String contrasenaCliente = "1234";
        String contrasenaDosCliente = "1234";

        Boolean resultado = cadena.registrarCliente(nombreCliente, contrasenaCliente, contrasenaDosCliente);
        Assertions.assertTrue(resultado);
        Assertions.assertDoesNotThrow(()-> cadena.registrarCliente(nombreCliente, contrasenaCliente, contrasenaDosCliente));
        //Assertions.assertThrows(Exception.class, ()->cadena.registrarCliente(nombreCliente, contrasenaCliente, contrasenaDosCliente));
        Assertions.assertEquals(true,resultado);
    }
}