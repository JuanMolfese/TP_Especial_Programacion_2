package src.busquedas;

import src.ElementoComida;

public class BuscarTiempoCoccion implements CriterioBusqueda{

    private int tiempococcion;

    public BuscarTiempoCoccion(int tiempococcion) {
        this.tiempococcion = tiempococcion;
    }

    //Si la comida que analizamos tiene un tiempo de coccion menor al
    //establecido por parametro.
    @Override
    public boolean cumple(ElementoComida comida) {
        if (comida.getTiempo()<tiempococcion){
            return true;
        }else{
            return false;
        }

    }
}
