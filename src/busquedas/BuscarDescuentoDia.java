package src.busquedas;

import src.ElementoComida;

import java.time.LocalDate;

//Pasarle el dia, nos posibilita a poder usarlo con cualquier dia que la cocina lo requiera, es decir
//no solo los miercoles.

public class BuscarDescuentoDia implements CriterioBusqueda{
    private String dia;

    public BuscarDescuentoDia(String dia){
        this.dia = dia;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        if(LocalDate.now().getDayOfWeek().equals(dia)){
            //comida.setPrecio(XXXXXXXXXXXXXXXXXXXXXXXXXXX);
        }
        return false;
    }
}
