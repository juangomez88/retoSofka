package com.retosofka.entidades;

import java.util.ArrayList;

public class Juego {
    private long codigo;
    private int numeroJugadores;
    private ArrayList<Conductor> jugadores = new ArrayList<>();
    private Pista pistaSeleccionada;
    private Podio podio;

    public Podio getPodio() {
        return podio;
    }

    public void setPodio(Podio podio) {
        this.podio = podio;
    }

    public Pista getPistaSeleccionada() {
        return pistaSeleccionada;
    }

    public void setPistaSeleccionada(Pista pistaSeleccionada) {
        this.pistaSeleccionada = pistaSeleccionada;
    }

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
