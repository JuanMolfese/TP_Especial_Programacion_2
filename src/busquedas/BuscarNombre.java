package src.busquedas;

import src.compositeComida.ElementoComida;

public class BuscarNombre implements CriterioBusqueda {

    private String nombre;

    public BuscarNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        return (comida.getNombre().contains(nombre));

    }

    @Override
    public String toString() {
        return "BuscarNombre{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
