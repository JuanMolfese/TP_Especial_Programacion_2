package src;

public class EstacionTemporal extends EstacionTrabajo {
	private double tiempoCoccionMaxima;

	public EstacionTemporal(int  nroEstacion, boolean libre, double tiempoCoccionMaxima) {
		super(nroEstacion, libre);
		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}

	//Getters y Setters
	public double getTiempoCoccionMaxima() {
		return tiempoCoccionMaxima;
	}

	public void setTiempoCoccionMaxima(double tiempoCoccionMaxima) {
		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}


	public boolean cumple(Comida c){
		//Si el tiempo de coccion de la comida es menor al tiempo de ESTA estacion TRUE
		return (c.getTiempoCoccion()<this.tiempoCoccionMaxima);

	}
	

}
