package src.criteriosEstacion;

import src.compositeComida.ElementoComida;

public class CriterioOR implements CriterioEstacion{
    CriterioEstacion cond1,cond2;

    public CriterioOR(CriterioEstacion cond1, CriterioEstacion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return (cond1.cumple(c)||cond2.cumple(c));
    }
}
