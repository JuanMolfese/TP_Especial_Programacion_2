package src.estacionesTrabajo;

import src.compositeComida.ElementoComida;

public class EstacionModoPreparacion extends EstacionTrabajo {
	private String modoPreparacion;

	public EstacionModoPreparacion(int nroEstacion, boolean libre, String modoPreparacion) {
		super(nroEstacion, libre);
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
		return ( isLibre()&&c.getModoPreparacion().toLowerCase().equals(this.modoPreparacion.toLowerCase()));
		}
}
	
	


