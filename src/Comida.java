package src;

import java.util.Objects;

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

	//GETTERS y SETTERS
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
	public double getTiempoCoccion() {
		return tiempoCoccion;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
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
				"}\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Comida)) return false;
		Comida comida = (Comida) o;
		return getCalorias() == comida.getCalorias() && Double.compare(comida.getPrecio(), getPrecio()) == 0 && Double.compare(comida.getTiempoCoccion(), getTiempoCoccion()) == 0 && getNombre().equals(comida.getNombre()) && getTipo().equals(comida.getTipo()) && getModoPreparacion().equals(comida.getModoPreparacion());
	}


}
