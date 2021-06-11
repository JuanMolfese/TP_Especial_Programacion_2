package src.criteriosEstacion;

import src.compositeComida.ElementoComida;


public class CriterioModoPreparacion implements CriterioEstacion {
	private String modoPreparacion;

	public CriterioModoPreparacion(String modoPreparacion) {

		this.modoPreparacion = modoPreparacion;
	}



	public boolean cumple(ElementoComida c){

		return ( c.getModoPreparacion().equalsIgnoreCase(this.modoPreparacion));
		}
}
	
	


