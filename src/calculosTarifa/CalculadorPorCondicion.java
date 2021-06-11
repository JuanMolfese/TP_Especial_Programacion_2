package src.calculosTarifa;

import src.compositeComida.ElementoComida;

import src.criteriosEstacion.CriterioEstacion;

public class CalculadorPorCondicion implements CalculadorPrecio{
   private CriterioEstacion condicion;
   private int seCumple, noSeCumple;

   public CalculadorPorCondicion(CriterioEstacion condicion, int seCumple, int noSeCumple) {
      this.condicion = condicion;
      this.seCumple = seCumple;
      this.noSeCumple = noSeCumple;
   }

   @Override
   public int calcularAdicional(ElementoComida c) {
      if (condicion.cumple(c))
         return seCumple;
      else
         return noSeCumple;
   }

   @Override
   public String toString() {
      return "CalculadorPorCondicion{" +
              "condicion=" + condicion +
              ", seCumple=" + seCumple +
              ", noSeCumple=" + noSeCumple +
              '}';
   }
}
