package src;

public class ModoPreparacion extends EstacionTrabajo {
	private String modoPreparacion;

	public ModoPreparacion(int nroEstacion, boolean libre, String modoPreparacion) {
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


	public boolean cumple(Comida c){
		//Si el modo de preparacion de la cominda
		return ( c.getModoPreparacion().toLowerCase().equals(this.modoPreparacion.toLowerCase()));

		}
}
	
	


