package com.retosofka;

import com.retosofka.casosdeuso.ConfigurarJuego;
import com.retosofka.casosdeuso.IniciarJuego;
import com.retosofka.utilidades.ObtenerDatosRandomicos;

public class Runner {

    public static void main(String[] args) {
       ConfigurarJuego configurarJuego=new ConfigurarJuego();
        IniciarJuego iniciarJuego=new IniciarJuego(configurarJuego.iniciarConfiguracionJuego());

        iniciarJuego.iniciaJuego();



    }
}
