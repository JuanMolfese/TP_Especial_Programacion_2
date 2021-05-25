package src.busquedas;

import src.ElementoComida;


public class BuscarTipo implements CriterioBusqueda{

    private String tipo;

    public BuscarTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        return (comida.getTipo().equals(tipo));
    }
}
