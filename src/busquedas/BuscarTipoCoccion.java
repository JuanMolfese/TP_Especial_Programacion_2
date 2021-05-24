package src.busquedas;

import src.ElementoComida;

public class BuscarTipoCoccion implements CriterioBusqueda{

    private String tipoCoccion;

    public BuscarTipoCoccion(String tipoCoccion) {
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
