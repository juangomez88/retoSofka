package com.retosofka.entidades;

import java.util.ArrayList;

public class Pista {
    private int numeroCarriles;
    private int kilometros;
    private ArrayList<Carro> carriles=new ArrayList<>();

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getNumeroCarriles() {
        return numeroCarriles;
    }

    public void setNumeroCarriles(int numeroCarriles) {
        this.numeroCarriles = numeroCarriles;
    }
}
