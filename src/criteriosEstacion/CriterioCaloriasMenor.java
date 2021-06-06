package src.criteriosEstacion;

import src.compositeComida.ElementoComida;

public class CriterioCaloriasMenor implements CriterioEstacion{
    private int calorias;

    public CriterioCaloriasMenor(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return (c.getCalorias()<calorias);
    }
}
