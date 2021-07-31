package com.retosofka.casosdeuso;

import com.retosofka.entidades.Juego;
import com.retosofka.utilidades.TecladoInput;

import java.util.Calendar;
import java.util.Locale;

public class ConfigurarJuego {
    private  Juego juego;
    private TecladoInput tecladoInput;

    private ConfigurarJuego(){
        this.tecladoInput=tecladoInput.obtenerUnicaInstancia();
        juego=new Juego();
    }

    private Juego iniciarConfiguracionJuego(){
        generarCodigoJuego();
        ingresarCantidadJugadores();

        return juego;
    }

    private void generarCodigoJuego(){
        juego.setCodigo(Calendar.getInstance(Locale.ROOT).getTimeInMillis());
    }

    private void ingresarCantidadJugadores(){
        System.out.print("Ingrese la cantidad de jugadores: ");
        juego.setNumeroJugadores(tecladoInput.getTeclado().nextInt());
    }

    private void ingresarLimiteKilometraje(){
        System.out.print("Ingrese el limite de kilometros de la pista: ");
        juego.setLimiteKilometrosPista(tecladoInput.getTeclado().nextInt());
    }

}
