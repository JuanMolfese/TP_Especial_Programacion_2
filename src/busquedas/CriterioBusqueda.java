package src.busquedas;

import src.compositeComida.ElementoComida;

public interface CriterioBusqueda {

    boolean cumple(ElementoComida comida);

}
