package com.retosofka.casosdeuso;

import com.retosofka.entidades.Conductor;
import com.retosofka.entidades.Juego;
import com.retosofka.utilidades.Conversores;
import com.retosofka.utilidades.ObtenerDatosRandomicos;


public class IniciarJuego {
    private Juego juegoConfigurado;
    private boolean juegoEnCurso =true;

    public IniciarJuego(Juego juegoConfigurado) {
        this.juegoConfigurado = juegoConfigurado;
    }

    public void iniciaJuego(){
        int distanciaPistaMetros= Conversores.convertirKilometrosAMetros(juegoConfigurado.getPistaSeleccionada().getKilometros());
        juegoConfigurado.getJugadores().forEach(conductor -> conductor.setDistanciaRecorrida(0));

        do{
            for(int i=0;i< juegoConfigurado.getNumeroJugadores();i++){
                if(!(juegoConfigurado.getJugadores().get(i).getDistanciaRecorrida()>=distanciaPistaMetros)) {
                    tirarDados(juegoConfigurado.getJugadores().get(i));
                    comprobarAvance(juegoConfigurado.getJugadores().get(i), distanciaPistaMetros);
                }
            }

        }while(juegoEnCurso);

        System.out.println("Puesto 1"+juegoConfigurado.getPodio().getPrimerPuesto().getNombre());
        System.out.println("Puesto 2"+juegoConfigurado.getPodio().getSegundoPuesto().getNombre());
        System.out.println("Puesto 3"+juegoConfigurado.getPodio().getPrimerPuesto().getNombre());
    }

    private void tirarDados(Conductor conductor){
        int valor= ObtenerDatosRandomicos.tirarDados();
        conductor.setDistanciaRecorrida(conductor.getDistanciaRecorrida()+(valor * 100));
    }

    private void  comprobarAvance(Conductor conductor,int distanciaPista){
        if(conductor.getDistanciaRecorrida()>=distanciaPista){
            checkearPodio(conductor);
        }
    }

    private void checkearPodio(Conductor conductor) {
        if(juegoConfigurado.getPodio().getPrimerPuesto()==null)
            juegoConfigurado.getPodio().setPrimerPuesto(conductor);
        else if(juegoConfigurado.getPodio().getSegundoPuesto()==null)
            juegoConfigurado.getPodio().setSegundoPuesto(conductor);
        else if(juegoConfigurado.getPodio().getTercerPuesto()==null) {
            juegoConfigurado.getPodio().setTercerPuesto(conductor);
            juegoEnCurso = false;
        }
        else
            juegoEnCurso=false;
    }


}
