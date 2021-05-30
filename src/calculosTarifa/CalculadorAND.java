package src.calculosTarifa;

import src.compositeComida.ElementoComida;

public class CalculadorAND implements CalculadorPrecio{
    CalculadorPrecio cond1,cond2;

    public CalculadorAND(CalculadorPrecio cond1, CalculadorPrecio cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public int calcularAdicional(ElementoComida comida) {
        return (cond1.calcularAdicional(comida)+cond2.calcularAdicional(comida));
    }
}
