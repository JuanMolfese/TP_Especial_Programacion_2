package src;

public class Comida {
	private String nombre,tipo, modoPreparacion;
	private int calorias;
	private double precio, tiempoCoccion;

	public Comida(String nombre, String tipo, String modoPreparacion,int calorias,
			double precio, double tiempoCoccion) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.modoPreparacion = modoPreparacion;
		this.calorias = calorias;
		this.precio = precio;
		this.tiempoCoccion = tiempoCoccion;
	}
	public String getNombre() {

		return nombre;
	}



	public String getTipo() {
		return tipo;
	}

	public String getModoPreparacion() {

		return modoPreparacion;
	}


	public int getCalorias()
	{
		return calorias;
	}



	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTiempoCoccion() {
		return tiempoCoccion;
	}

	@Override
	public String toString() {
		return "Comida{" +
				"nombre='" + nombre + '\'' +
				", tipo='" + tipo + '\'' +
				", modoPreparacion='" + modoPreparacion + '\'' +
				", calorias=" + calorias +
				", precio=" + precio +
				", tiempoCoccion=" + tiempoCoccion +
				'}';
	}
}
