package src.calculosTarifa;

import src.ElementoComida;

public class CalculadorPorPorcentaje implements CalculadorPrecio{
    private String concepto;
    private int porcentaje;

    public CalculadorPorPorcentaje(String concepto, int porcentaje) {
        this.concepto = concepto;
        this.porcentaje = porcentaje;
    }

    @Override
    public int calcularAdicional(ElementoComida comida) {
        return ((comida.getPrecio()*porcentaje)/100);
    }
}
