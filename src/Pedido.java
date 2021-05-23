package src;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<ElementoComida> comidas;
	private int nroMesa,nroPedido,precioTotal;
	private String mozo;


	public Pedido(int nroMesa, int nroPedido,String mozo) {
		
		this.nroMesa = nroMesa;
		this.nroPedido = nroPedido;
		this.precioTotal=0;//esta bien inicializarlo aca?
		this.mozo = mozo;
		comidas=new ArrayList<>();

	}

	//NO DEBEMOS RESPONDER CON EL ARREGLO
	//public ArrayList<Comida> getComidas() {return comidas;}




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

	public void agregarComida (ElementoComida c){
		if (!comidas.contains(c))//equals implementado en clase Comida
			comidas.add(c);
	}

	public int calcularPrecio(){

		 for (ElementoComida com: comidas){
		 	precioTotal+=com.getPrecio();
		 }
		 return precioTotal;
	}

	@Override
	public String toString() {
		return "Pedido{" +
				"comidas=" + comidas +
				", nroMesa=" + nroMesa +
				", nroPedido=" + nroPedido +
				", precioTotal=" + precioTotal +
				", mozo='" + mozo + '\'' +
				'}';
	}
}
