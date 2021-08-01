package com.retosofka.casosdeuso;

import com.retosofka.entidades.Carro;
import com.retosofka.entidades.Conductor;
import com.retosofka.entidades.Juego;
import com.retosofka.utilidades.Carros;
import com.retosofka.utilidades.TecladoInput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.stream.Collectors;

public class ConfigurarJuego {
    private  Juego juego;
    private TecladoInput tecladoInput;
    private  Carros carros;
    private ArrayList<Carro> listaTemporalCarros=new ArrayList<>();

    public ConfigurarJuego(){
        this.tecladoInput=TecladoInput.obtenerUnicaInstancia();
        this.carros=Carros.obternerUnicaInstancia();
        listaTemporalCarros= carros.retornaListadoCarros();
        juego=new Juego();
    }

    public Juego iniciarConfiguracionJuego(){
        generarCodigoJuego();
        ingresarCantidadJugadores();
        regitroPilotos();
        return juego;
    }

    private void generarCodigoJuego(){
        juego.setCodigo(Calendar.getInstance(Locale.ROOT).getTimeInMillis());
    }

    private void ingresarCantidadJugadores(){
        System.out.print("Ingrese la cantidad de jugadores: ");
        juego.setNumeroJugadores(tecladoInput.getTeclado().nextInt());
        tecladoInput.getTeclado().nextLine();
    }

    private void regitroPilotos(){
        for (int i = 0; i < juego.getNumeroJugadores();i++){
            Conductor piloto = ingresarConductor(i);
            juego.getJugadores().add(piloto);
        }
    }

    private Conductor ingresarConductor(int i) {
        Conductor piloto = new Conductor();
        System.out.println("Ingrese los datos del piloto " + (i + 1));
        System.out.print("Ingrese el nombre: ");
        piloto.setNombre(tecladoInput.getTeclado().nextLine());

        int opcion;
        System.out.println("Seleccione el numero del carro disponible");
        listaTemporalCarros.forEach(carro ->
                System.out.println("Numero: " + carro.getNumero() + " Marca: " + carro.getMarca()));
        opcion = tecladoInput.getTeclado().nextInt();
        tecladoInput.getTeclado().nextLine();
        piloto.setNumeroCarro(opcion);
        listaTemporalCarros = listaTemporalCarros.stream()
                .filter(carro -> carro.getNumero() != opcion)
                .collect(Collectors.toCollection(ArrayList<Carro>::new));


        return piloto;
    }

}
