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

}
