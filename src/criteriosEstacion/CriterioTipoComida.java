package src.criteriosEstacion;

import src.compositeComida.ElementoComida;


public class CriterioTipoComida implements CriterioEstacion {
	private String tipo;

	public CriterioTipoComida(String tipo) {

		this.tipo = tipo;
	}

	public boolean cumple(ElementoComida c){
		//Si el tipo de la comida es del tipo de ESTA estacion
		return (c.getTipo().equalsIgnoreCase(this.tipo) );
	}

}
