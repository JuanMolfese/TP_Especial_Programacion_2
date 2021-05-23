package src;

public class TipoComida extends EstacionTrabajo {
	private String tipo;

	public TipoComida(int nroEstacion, boolean libre, String tipo) {
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
		return ( c.getTipo().toLowerCase().equals(this.getTipo().toLowerCase() ) );
	}

}
