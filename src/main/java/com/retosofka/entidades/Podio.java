package com.retosofka.entidades;

public class Podio {
    private Conductor primerPuesto;
    private Conductor segundoPuesto;
    private Conductor tercerPuesto;

    public Conductor getPrimerPuesto() {
        return primerPuesto;
    }

    public void setPrimerPuesto(Conductor primerPuesto) {
        this.primerPuesto = primerPuesto;
    }

    public Conductor getSegundoPuesto() {
        return segundoPuesto;
    }

    public void setSegundoPuesto(Conductor segundoPuesto) {
        this.segundoPuesto = segundoPuesto;
    }

    public Conductor getTercerPuesto() {
        return tercerPuesto;
    }

    public void setTercerPuesto(Conductor tercerPuesto) {
        this.tercerPuesto = tercerPuesto;
    }
}
