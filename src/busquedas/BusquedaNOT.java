package src.busquedas;

import src.compositeComida.ElementoComida;

public class BusquedaNOT implements CriterioBusqueda{
    CriterioBusqueda criterio;

    public BusquedaNOT(CriterioBusqueda criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        return (!criterio.cumple(comida));
    }
}
