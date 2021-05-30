package src.busquedas;

import src.compositeComida.ElementoComida;

public class BuscarModoCoccion implements CriterioBusqueda{

    private String modoCoccion;

    public BuscarModoCoccion(String modoCoccion) {
        this.modoCoccion = modoCoccion;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        if(comida.getModoPreparacion().equals(modoCoccion)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "BuscarModoCoccion{" +
                "modoCoccion='" + modoCoccion + '\'' +
                '}';
    }
}
