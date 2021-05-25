package src.busquedas;

import src.ElementoComida;

public class BuscarModoCoccion implements CriterioBusqueda{

    private String tipoCoccion;

    public BuscarModoCoccion(String tipoCoccion) {
        this.tipoCoccion = tipoCoccion;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        if(comida.getTipo().equals(tipoCoccion)){
            return true;
        }else{
            return false;
        }
    }
}
