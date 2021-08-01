package com.retosofka.runner;

import com.retosofka.casosdeuso.ConfigurarJuego;
import com.retosofka.casosdeuso.IniciarJuego;
import com.retosofka.repositorio.RespositorioSqlite;


public class Runner {

    public static void main(String[] args) {
        ConfigurarJuego configurarJuego=new ConfigurarJuego();
        IniciarJuego iniciarJuego=new IniciarJuego(configurarJuego.iniciarConfiguracionJuego());
        iniciarJuego.iniciaJuego();

        RespositorioSqlite connectionSqlite= new RespositorioSqlite();

        connectionSqlite.crearTabla();
        connectionSqlite.almacenarJuego(iniciarJuego.getJuegoConfigurado());

    }
}