package src.criteriosEstacion;

import src.compositeComida.ElementoComida;


public class CriterioTiempoMenor implements CriterioEstacion {
	private int tiempoCoccionMaxima;

	public CriterioTiempoMenor(int tiempoCoccionMaxima) {

		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}



	public boolean cumple(ElementoComida c){
		//Si el tiempo de coccion de la comida es menor al tiempo de ESTA estacion
		return (c.getTiempo()<this.tiempoCoccionMaxima);
	}

}
