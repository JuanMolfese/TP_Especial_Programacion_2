package src.busquedas;

import src.ElementoComida;

//TODO quizas sea un error pero dejo expresado que todas las comidas
// cumplen con la condiciones para que se le aplique el 10% en concepto
// de propina. y les moficio el precio sumando un 10%

public class BuscarSumaPorcentajeFijoPropina implements CriterioBusqueda{

    private int porcentajeAincrementar;

    public BuscarSumaPorcentajeFijoPropina(int porcentajeAincrementar) {
        this.porcentajeAincrementar = porcentajeAincrementar;
    }

    @Override
    public boolean cumple(ElementoComida comida) {
        // comida.setPrecio((comida.getPrecio()*10)/100);
        return true;
    }
}
