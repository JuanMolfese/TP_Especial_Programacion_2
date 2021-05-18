package src;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Comida> comidas;
	private int nroMesa,nroPedido;
	private String mozo;


	public Pedido(int nroMesa, int nroPedido, String mozo) {
		
		this.nroMesa = nroMesa;
		this.nroPedido = nroPedido;
		this.mozo = mozo;
		comidas=new ArrayList<Comida>();

	}
	public ArrayList<Comida> getComidas() {
		return comidas;
	}

	public void agregarComida (Comida c){
		comidas.add(c);
	}
	public int getNroMesa() {

		return nroMesa;
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public String getMozo() {
		return mozo;
	}

	public void setMozo(String mozo) {
		this.mozo = mozo;
	}

	@Override
	public String toString() {
		return "Pedido{" +
				"comidas=" + comidas +
				", nroMesa=" + nroMesa +
				", nroPedido=" + nroPedido +
				", mozo='" + mozo + '\'' +
				'}';
	}
}
