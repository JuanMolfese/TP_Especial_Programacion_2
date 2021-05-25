package src.busquedas;

import src.ElementoComida;

import java.time.LocalDate;

public class BuscarDescuentoMiercoles implements CriterioBusqueda{
    private String dia;

    public BuscarDescuentoMiercoles() {
        this.dia = "miercoles";
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        if(LocalDate.now().getDayOfWeek().equals(dia)){
            //comida.setPrecio(XXXXXXXXXXXXXXXXXXXXXXXXXXX);
        }
        return false;
    }
}
