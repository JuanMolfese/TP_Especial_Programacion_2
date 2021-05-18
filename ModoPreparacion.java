package tpe;

public class ModoPreparacion extends EstacionTrabajo {
	private String modoPreparacion;

	public ModoPreparacion(String nombre, boolean libre, String modoPreparacion) {
		super(nombre, libre);
		this.modoPreparacion = modoPreparacion;
	}

	public String getModoPreparacion() {
		return modoPreparacion;
	}

	public void setModoPreparacion(String modoPreparacion) {
		this.modoPreparacion = modoPreparacion;
	}

	public void estaLibre(){

	}
	
	

}
