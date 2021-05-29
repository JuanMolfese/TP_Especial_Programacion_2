package src.busquedas;

import src.ElementoComida;

public class BuscarModoCoccion implements CriterioBusqueda{

    private String modoCoccion;

    public BuscarModoCoccion(String tipoCoccion) {
        this.modoCoccion = tipoCoccion;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        if(comida.getModoPreparacion().equals(modoCoccion)){
            return true;
        }else{
            return false;
        }
    }
}
