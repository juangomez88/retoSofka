package com.retosofka.entidades;

import java.util.ArrayList;

public class Juego {
    private long codigo;
    //Todo quitar numero jugadores a futuro se manejara con tamaño de lalista
    private int numeroJugadores;
    private ArrayList<Conductor> jugadores = new ArrayList<>();

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public ArrayList<Conductor> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Conductor> jugadores) {
        this.jugadores = jugadores;
    }
}
