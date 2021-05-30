package src.estacionesTrabajo;

import src.compositeComida.ElementoComida;

public class EstacionTemporal extends EstacionTrabajo {
	private int tiempoCoccionMaxima;

	public EstacionTemporal(int  nroEstacion, boolean libre, int tiempoCoccionMaxima) {
		super(nroEstacion, libre);
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
		return (isLibre() && c.getTiempo()<this.tiempoCoccionMaxima);
	}

}
