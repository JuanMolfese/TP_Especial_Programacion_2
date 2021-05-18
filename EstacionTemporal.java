package tpe;

public class EstacionTemporal extends EstacionTrabajo {
	private double tiempoCoccionMaxima;

	public EstacionTemporal(String nombre, boolean libre, double tiempoCoccionMaxima) {
		super(nombre, libre);
		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}

	public double getTiempoCoccionMaxima() {
		return tiempoCoccionMaxima;
	}

	public void setTiempoCoccionMaxima(double tiempoCoccionMaxima) {
		this.tiempoCoccionMaxima = tiempoCoccionMaxima;
	}

	
	public void estaLibre(){

	}
	

}
