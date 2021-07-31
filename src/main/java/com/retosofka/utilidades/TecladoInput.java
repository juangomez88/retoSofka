package com.retosofka.utilidades;

import java.util.Scanner;

public class TecladoInput {
    TecladoInput unicaInstancia;
    Scanner teclado;

    public TecladoInput obtenerUnicaInstancia(){
        if(unicaInstancia==null)
            unicaInstancia = new TecladoInput();
        return unicaInstancia;
    }

    private TecladoInput(){
        this.unicaInstancia=new TecladoInput();
        this.teclado=new Scanner(System.in);
    }

    public Scanner getTeclado() {
        return teclado;
    }

}
