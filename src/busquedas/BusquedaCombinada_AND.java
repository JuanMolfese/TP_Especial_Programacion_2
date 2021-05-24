package src.busquedas;

import src.ElementoComida;

public class BusquedaCombinada_AND implements CriterioBusqueda{

    CriterioBusqueda c1;
    CriterioBusqueda c2;

    public BusquedaCombinada_AND(CriterioBusqueda c1, CriterioBusqueda c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        if(c1.cumple(comida) && c2.cumple(comida)){
            return true;
        }else{
            return false;
        }
    }
}
