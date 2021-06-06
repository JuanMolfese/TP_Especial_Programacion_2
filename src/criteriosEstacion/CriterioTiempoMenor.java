package src.criteriosEstacion;

import src.compositeComida.ElementoComida;
import src.EstacionTrabajo;

public class CriterioTiempoMenor implements CriterioEstacion {
	private int tiempoCoccionMaxima;

	public CriterioTiempoMenor(int tiempoCoccionMaxima) {

		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}

	//Getters y Setters
	public int getTiempoCoccionMaxima() {
		return tiempoCoccionMaxima;
	}
	public void setTiempoCoccionMaxima(int tiempoCoccionMaxima) {
		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}


	public boolean cumple(ElementoComida c){
		//Si el tiempo de coccion de la comida es menor al tiempo de ESTA estacion TRUE
		return (c.getTiempo()<this.tiempoCoccionMaxima);
	}

}
