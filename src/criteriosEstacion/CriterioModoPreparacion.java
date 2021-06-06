package src.criteriosEstacion;

import src.compositeComida.ElementoComida;
import src.EstacionTrabajo;

public class CriterioModoPreparacion implements CriterioEstacion {
	private String modoPreparacion;

	public CriterioModoPreparacion(String modoPreparacion) {

		this.modoPreparacion = modoPreparacion;
	}

	//Getters y Setters
	public String getModoPreparacion() {

		return modoPreparacion;
	}
	public void setModoPreparacion(String modoPreparacion) {

		this.modoPreparacion = modoPreparacion;
	}


	public boolean cumple(ElementoComida c){
		//Si el modo de preparacion de la cominda
		return ( c.getModoPreparacion().toLowerCase().equals(this.modoPreparacion.toLowerCase()));
		}
}
	
	


