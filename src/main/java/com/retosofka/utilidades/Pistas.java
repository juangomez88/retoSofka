package com.retosofka.utilidades;

import com.retosofka.entidades.Carro;
import com.retosofka.entidades.Pista;

import java.util.ArrayList;

public class Pistas {
    private ArrayList<Pista> pistas = new ArrayList<>();
    private static Pistas unicaInstancia;

    public static Pistas obtenerUnicaInstancia(){
        if(unicaInstancia == null){
            unicaInstancia = new Pistas();
        }
        return unicaInstancia;
    }
    private Pistas() {

        pistas.add(crearCircuitoBrazil());
        pistas.add(crearCircuitoSpa());
        pistas.add(crearCircuitoSusuka());

    }

    private Pista crearCircuitoSusuka(){
        Pista circuitoSusuka = new Pista();
        circuitoSusuka.setNombreCircuito("Susuka");
        circuitoSusuka.setKilometros(26);
        return circuitoSusuka;
    }

    private Pista crearCircuitoBrazil(){
        Pista circuitoBrazil = new Pista();
        circuitoBrazil.setNombreCircuito("Brazil");
        circuitoBrazil.setKilometros(24);
        return circuitoBrazil;
    }

    private Pista crearCircuitoSpa(){
        Pista circuitoSpa = new Pista();
        circuitoSpa.setNombreCircuito("SPA");
        circuitoSpa.setKilometros(28);
        return circuitoSpa;
    }


}
