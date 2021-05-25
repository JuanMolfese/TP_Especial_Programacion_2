package src.busquedas;

import src.ElementoComida;

public class BuscarNombre implements CriterioBusqueda {

    private String nombre;

    public BuscarNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        return (comida.getNombre().contains(nombre));

    }
}
