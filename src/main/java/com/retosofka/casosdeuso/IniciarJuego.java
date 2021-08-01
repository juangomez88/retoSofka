package com.retosofka.casosdeuso;

import com.retosofka.entidades.Conductor;
import com.retosofka.entidades.Juego;
import com.retosofka.utilidades.Conversores;
import com.retosofka.utilidades.ObtenerDatosRandomicos;

import java.util.ArrayList;


public class IniciarJuego {
    private Juego juegoConfigurado;
    private boolean juegoEnCurso =true;

    public IniciarJuego(Juego juegoConfigurado) {
        this.juegoConfigurado = juegoConfigurado;
    }

    public void iniciaJuego(){
        int distanciaPistaMetros= Conversores.convertirKilometrosAMetros(juegoConfigurado.getPistaSeleccionada().getKilometros());
        ArrayList<Conductor> listaTemporalConductores=juegoConfigurado.getJugadores();
        listaTemporalConductores.forEach(conductor -> conductor.setDistanciaRecorrida(0));

        do{
            for(int i=0;i<listaTemporalConductores.size();i++){
                tirarDados(listaTemporalConductores.get(i));
                System.out.println("Conductor: "+listaTemporalConductores.get(i).getNombre()+"  Recorrido: "+listaTemporalConductores.get(i).getDistanciaRecorrida());
                if(comprobarAvance(listaTemporalConductores.get(i), distanciaPistaMetros)){
                    listaTemporalConductores.remove(i);
                }
            }

        }while(juegoEnCurso);

        System.out.println("Puesto 1 "+juegoConfigurado.getPodio().getPrimerPuesto().getNombre());
        System.out.println("Puesto 2 "+juegoConfigurado.getPodio().getSegundoPuesto().getNombre());
        if (juegoConfigurado.getNumeroJugadores()>= 3) {
            System.out.println("Puesto 3 " + juegoConfigurado.getPodio().getTercerPuesto().getNombre());
        }
    }

    private void tirarDados(Conductor conductor){
        int valor= ObtenerDatosRandomicos.tirarDados();
        conductor.setDistanciaRecorrida(conductor.getDistanciaRecorrida()+(valor * 100));
    }

    private boolean  comprobarAvance(Conductor conductor,int distanciaPista){
        if(conductor.getDistanciaRecorrida()>=distanciaPista){
            checkearPodio(conductor);
            return true;
        }
        else
            return false;
    }

    private void checkearPodio(Conductor conductor) {
        if(juegoConfigurado.getPodio().getPrimerPuesto()==null)
            juegoConfigurado.getPodio().setPrimerPuesto(conductor);
        else if(juegoConfigurado.getPodio().getSegundoPuesto()==null) {
            juegoConfigurado.getPodio().setSegundoPuesto(conductor);
            if(juegoConfigurado.getNumeroJugadores()==2){
                juegoEnCurso=false;
            }
        }

        else if(juegoConfigurado.getPodio().getTercerPuesto()==null) {
            juegoConfigurado.getPodio().setTercerPuesto(conductor);
            juegoEnCurso = false;
        }
    }


}
