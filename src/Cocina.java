package src;

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
	
	

}
