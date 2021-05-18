package src;

public class TipoComida extends EstacionTrabajo {
	private String tipo;

	public TipoComida(String nombre, boolean libre, String tipo) {
		super(nombre, libre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void estaLibre(){

	}

}
