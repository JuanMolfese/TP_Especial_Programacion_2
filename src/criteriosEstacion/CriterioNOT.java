package src.criteriosEstacion;

import src.compositeComida.ElementoComida;

public class CriterioNOT implements CriterioEstacion{
    CriterioEstacion cond;

    public CriterioNOT(CriterioEstacion cond) {
        this.cond = cond;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return (!cond.cumple(c));
    }
}
