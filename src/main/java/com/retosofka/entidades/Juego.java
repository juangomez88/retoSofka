package com.retosofka.entidades;

public class Juego {
    private long codigo;
    private int numeroJugadores;
    private int limiteKilometrosPista;

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

    public int getLimiteKilometrosPista() {
        return limiteKilometrosPista;
    }

    public void setLimiteKilometrosPista(int limiteKilometrosPista) {
        this.limiteKilometrosPista = limiteKilometrosPista;
    }
}
