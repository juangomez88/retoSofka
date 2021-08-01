package com.retosofka.utilidades;

import java.util.Scanner;

public class TecladoInput {
    private static TecladoInput unicaInstancia;
    private Scanner teclado;

    public static TecladoInput obtenerUnicaInstancia(){
        if(unicaInstancia==null)
            unicaInstancia = new TecladoInput();
        return unicaInstancia;
    }

    private TecladoInput(){
        teclado=new Scanner(System.in);
    }

    public Scanner getTeclado() {
        return teclado;
    }

}
