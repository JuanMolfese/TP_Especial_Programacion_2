package src;



import src.calculosTarifa.CalculadorPrecio;
import src.estacionesTrabajo.EstacionTrabajo;

import java.util.ArrayList;

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

	public void asignarComidas(Pedido p) {
		//foreach del arraylista pedido ???

		//tomo de una comida y le pregunto a cada estacion de trabajo
		//SI : cumple(Comida c) && esta Libre => asigno a la estacion esa comida y la pongo en false al Libre.

	}

	@Override
	public String toString() {
		return "Cocina{\n" +
				"calculosAdicionales=" + calculoAdicional +
				", estaciones=" + estaciones +
				", pedidos=" + pedidos +
				"}\n";
	}
}

