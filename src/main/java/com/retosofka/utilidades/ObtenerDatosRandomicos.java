package com.retosofka.utilidades;

import com.retosofka.entidades.Pista;

import java.security.SecureRandom;

public class ObtenerDatosRandomicos {

    public static int obtenerCarrilAleatorio(){
        SecureRandom numerosAleatorios=new SecureRandom();
        return numerosAleatorios.nextInt(8);
    }

    public static  int obttenerNumeroAleatorioEnRango(int rango){
        SecureRandom numerosAleatorios=new SecureRandom();

        return numerosAleatorios.nextInt(rango);
    }

    public static int tirarDados(){
        SecureRandom numerosAleatorios=new SecureRandom();
        return 1+numerosAleatorios.nextInt(6);
    }

}
