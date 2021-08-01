package com.retosofka.entidades;

import java.util.ArrayList;

public class Pista {
    private String nombreCircuito;
    private int kilometros;
    private ArrayList<Carro> carriles=new ArrayList<>();

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public ArrayList<Carro> getCarriles() {
        return carriles;
    }

    public void setCarriles(ArrayList<Carro> carriles) {
        this.carriles = carriles;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }
}
