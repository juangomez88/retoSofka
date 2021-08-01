package com.retosofka.runner;

import com.retosofka.casosdeuso.ConfigurarJuego;
import com.retosofka.casosdeuso.IniciarJuego;


public class Runner {

    public static void main(String[] args) {
       ConfigurarJuego configurarJuego=new ConfigurarJuego();
        IniciarJuego iniciarJuego=new IniciarJuego(configurarJuego.iniciarConfiguracionJuego());

        iniciarJuego.iniciaJuego();



    }
}
