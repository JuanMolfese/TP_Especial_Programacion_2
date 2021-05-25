package src;

import src.busquedas.BuscarTipo;
import src.busquedas.CriterioBusqueda;

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


	//GETTERS y SETTERS
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

	public ArrayList<ElementoComida> buscar(CriterioBusqueda buscado) {//creo que va en Cocina,
		                                                               // revisar juntos el enunciado
		ArrayList<ElementoComida> p = new ArrayList<>();
		for (ElementoComida com : comidas) {
			if (buscado.cumple(com)) {
				p.add(com);
			}
		}
		return p;
	}

	//En una de las busquedas pide que el pedido informe si alguna de sus comidas
	//es de tipo ensalada, a su vez que indique la cantidad de ensaladas en el pedido.
	public boolean contieneTipoComida(String tipoComida){

		for (ElementoComida c : comidas) {
			if(c.getTipo().equals(new BuscarTipo(tipoComida))){
				return true;
			}
		}
		return false;
	}

	//Retorna el valor total de calorias del pedido, el INT resultante lo podemos usar para preguntar si
	//es mayor a 500 ... el total $$ del pedido le sumamos 100 pesos.

	public int cantidadCalorias(){//Juan, ya esta el metodo en ElementoComida(segun consigna, el adicional se aplica
		                          // a cada comida ordenada, es responsabilidad de Comida).Charlarlo dsps
		int totalCalorias=0;
		for (ElementoComida c:comidas){
			totalCalorias+=c.getCalorias();
		}
		return totalCalorias;
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
				" nroPedido=" + nroPedido +
				", nroMesa=" + nroMesa +
				", mozo= " + mozo +"\n"+
				"comidas=" + comidas + "\n" +
				" Precio total del pedido=" + calcularPrecio() +
				"}\n";
	}

}
