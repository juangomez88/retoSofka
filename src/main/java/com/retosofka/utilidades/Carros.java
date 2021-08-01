package com.retosofka.utilidades;

import com.retosofka.entidades.Carro;

import java.util.ArrayList;

public class Carros {
    private  ArrayList<Carro> carros = new ArrayList<>();
    private static Carros unicaInstancia;

    public static Carros obternerUnicaInstancia(){
        if(unicaInstancia == null){
            unicaInstancia = new Carros();
        }
        return unicaInstancia;
    }

    public ArrayList<Carro> retornaListadoCarros(){
        return  carros;
    }

    private Carros() {

        carros.add(crearCarroTipoUno());
        carros.add(crearCarroTipoDos());
        carros.add(crearCarroTipoTres());
        carros.add(crearCarroTipoCuatro());
        carros.add(crearCarroTipoCinco());
        carros.add(crearCarroTipoSeis());
        carros.add(crearCarroTipoSiete());
        carros.add(crearCarroTipoOcho());

    }

    private Carro crearCarroTipoUno(){
        Carro carroTipoUno = new Carro();
        carroTipoUno.setNumero(1);
        carroTipoUno.setMarca("Ferrari");
        return carroTipoUno;
    }

    private Carro crearCarroTipoDos(){
        Carro carroTipoDos = new Carro();
        carroTipoDos.setNumero(2);
        carroTipoDos.setMarca("Fiat");
        return carroTipoDos;
    }

    private Carro crearCarroTipoTres(){
        Carro carroTipoTres = new Carro();
        carroTipoTres.setNumero(3);
        carroTipoTres.setMarca("Mazeratti");
        return carroTipoTres;
    }

    private Carro crearCarroTipoCuatro(){
        Carro carroTipoCuatro = new Carro();
        carroTipoCuatro.setNumero(4);
        carroTipoCuatro.setMarca("Porche");
        return carroTipoCuatro;
    }

    private Carro crearCarroTipoCinco(){
        Carro carroTipoCinco = new Carro();
        carroTipoCinco.setNumero(5);
        carroTipoCinco.setMarca("Lamborghini");
        return carroTipoCinco;
    }

    private Carro crearCarroTipoSeis() {
        Carro carroTipoSeis = new Carro();
        carroTipoSeis.setNumero(6);
        carroTipoSeis.setMarca("Bugatti");
        return carroTipoSeis;
    }

    private Carro crearCarroTipoSiete() {
        Carro carroTipoSiete = new Carro();
        carroTipoSiete.setNumero(7);
        carroTipoSiete.setMarca("Ford");
        return carroTipoSiete;
    }

    private Carro crearCarroTipoOcho() {
        Carro carroTipoOcho = new Carro();
        carroTipoOcho.setNumero(8);
        carroTipoOcho.setMarca("Audi");
        return carroTipoOcho;
    }

}
