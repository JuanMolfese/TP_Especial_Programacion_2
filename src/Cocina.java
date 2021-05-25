package src;

import src.busquedas.CriterioBusqueda;

import java.util.ArrayList;

public class Cocina {


	private ArrayList<EstacionTrabajo> estaciones;

	public Cocina() {
		estaciones = new ArrayList<>();

	}


	public void addEstacion(EstacionTrabajo e){
		estaciones.add(e);
	}

	public void asignarComidas(Pedido p){
		//foreach del arraylista pedido ???
		//tomo de una comida y le pregunto a cada estacion de trabajo
		//SI : cumple(Comida c) && esta Libre => asigno a la estacion esa comida y la pongo en false al Libre.

	}

	//TODO maneja los criterios para CALCULAR COSTO DEL PEDIDO. Diariamente los puede ir cambiando.
	// Quizas debamos tener en la clase cocina un arreglo con los criterios que se aplican este día
	// para calcular el momento a cobrar de un pedido.- OJO no estoy seguro, pero lo dejo por aca para que lo charlemos
	 public void setFormaCalculo_MontoPedido(CriterioBusqueda criterio){
		//listaCrietoriosAaplicar.add(criterio);
	 }
	

}
