package com.retosofka.entidades;


import java.util.HashMap;

public class Pista {
    private String nombreCircuito;
    private int kilometros;
    private HashMap<Integer,Integer> carrilPorCarro =new HashMap<>();

    public HashMap<Integer, Integer> getCarrilPorCarro() {
        return carrilPorCarro;
    }

    public void setCarrilPorCarro(HashMap<Integer, Integer> carrilPorCarro) {
        this.carrilPorCarro = carrilPorCarro;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }
}
