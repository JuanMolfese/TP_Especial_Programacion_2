package src;

import src.calculosTarifa.CalculadorPrecio;
import src.compositeComida.ElementoComida;
import src.estacionesTrabajo.EstacionTrabajo;

import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class Cocina {

	private CalculadorPrecio calculoAdicional;
	private ArrayList<EstacionTrabajo> estaciones;
	private ArrayList<Pedido> pedidos;



	public Cocina() {
		estaciones = new ArrayList<>();
		pedidos = new ArrayList<>();
		calculoAdicional = null;

	}

	public void setCalculoAdicional(CalculadorPrecio calculoAdicional) {
		this.calculoAdicional = calculoAdicional;
	}

	public void addEstacion(EstacionTrabajo e) {
		estaciones.add(e);
	}

	public void addPedido(Pedido p){
		pedidos.add(p);
	}



	public int PrecioFinalPedido(Pedido p){//establezco precio final en base a los criterios
		if (calculoAdicional!=null) {
			return p.precioFinalComida(calculoAdicional);
		}
		else{
			return p.precioFinalComida();
		}
	}


	public void asignarComidas_aEstacion(Pedido p) {
		for (EstacionTrabajo estacion: estaciones) {
			p.consultarRequisitos(estacion);
		}
	}


	@Override
	public String toString() {
		return "Cocina :\n" +
				"Calculos Adicionales = " + calculoAdicional +
				"\nEstaciones = \n" + estaciones +
				"Pedidos = \n" + pedidos +
				"\n";
	}
}