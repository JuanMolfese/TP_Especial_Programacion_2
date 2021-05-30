package src.estacionesTrabajo;

import src.compositeComida.ElementoComida;

public class EstacionTipoComida extends EstacionTrabajo {
	private String tipo;

	public EstacionTipoComida(int nroEstacion, boolean libre, String tipo) {
		super(nroEstacion, libre);
		this.tipo = tipo;
	}

	//Getters y Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public boolean cumple(ElementoComida c){
		//Si el tipo de la comida es del tipo de ESTA estacion
		return ( isLibre() && c.getTipo().toLowerCase().equals(this.getTipo().toLowerCase() ) );
	}

}
