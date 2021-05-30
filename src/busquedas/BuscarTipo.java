package src.busquedas;

import src.compositeComida.ElementoComida;


public class BuscarTipo implements CriterioBusqueda{

    private String tipo;

    public BuscarTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        return (comida.getTipo().equals(tipo));
    }

    @Override
    public String toString() {
        return "BuscarTipo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
