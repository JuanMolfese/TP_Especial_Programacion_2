package src;



import src.calculosTarifa.CalculadorPrecio;
import src.estacionesTrabajo.EstacionTrabajo;

import java.util.ArrayList;

public class Cocina {

	private ArrayList<CalculadorPrecio> calculosAdicionales;
	private ArrayList<EstacionTrabajo> estaciones;
	private ArrayList<Pedido> pedidos;
	//private ArrayList<ElementoComida> comidas;



	public Cocina() {
		estaciones = new ArrayList<>();
		pedidos = new ArrayList<>();
		calculosAdicionales = new ArrayList<>();
		//	comidas = new ArrayList<>();
	}


	public void addEstacion(EstacionTrabajo e) {
		estaciones.add(e);
	}

	public void addPedido(Pedido p){
		pedidos.add(p);
	}

	public void addCriterioCalculoPrecios(CalculadorPrecio calcPrecio){
		calculosAdicionales.add(calcPrecio);
	}


	public int sumarAdicionales (ArrayList<CalculadorPrecio> calc){
		return 0;
	}

	public void asignarComidas(Pedido p) {
		//foreach del arraylista pedido ???

		//tomo de una comida y le pregunto a cada estacion de trabajo
		//SI : cumple(Comida c) && esta Libre => asigno a la estacion esa comida y la pongo en false al Libre.

	}



	//TODO maneja los criterios para CALCULAR COSTO DEL PEDIDO. Diariamente los puede ir cambiando.
	// Quizas debamos tener en la clase cocina un arreglo con los criterios que se aplican este día
	// para calcular el momento a cobrar de un pedido.- OJO no estoy seguro, pero lo dejo por aca para que lo charlemos





/*	 public int cobrarPedido(Pedido p){
		int montoPedido=0;

		for (ElementoComida comida : comidas){
			//TODO
			// A cada comida => calcular el precio en funcion a los criterios instanciados
			for(CriterioBusqueda criterio : listaCriteriosAaplicar){
				if (criterio.cumple(comida)){
					//ACA CAGAMOS
				}
			}
		}
		return montoPedido;
	 }*/


}

