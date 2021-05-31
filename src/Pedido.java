package src;

import src.calculosTarifa.CalculadorPrecio;
import src.compositeComida.ElementoComida;
import src.estacionesTrabajo.EstacionTrabajo;
import java.util.ArrayList;

public class Pedido {
	private ArrayList<ElementoComida> comidas;
	private int nroMesa,nroPedido,precioTotal;
	private String mozo;

	public Pedido(int nroMesa, int nroPedido,String mozo) {
		
		this.nroMesa = nroMesa;
		this.nroPedido = nroPedido;
		this.precioTotal=0;
		this.mozo = mozo;
		comidas=new ArrayList<>();

	}


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


	public void agregarComida (ElementoComida c){comidas.add(c);}


	public int precioFinalComida(){
		precioTotal=0;
		for (ElementoComida com: comidas){
			precioTotal+=com.getPrecio();
		}
		return precioTotal;
	}


	public int precioFinalComida(CalculadorPrecio cal){
		int sumaTotal=0;
		for (ElementoComida c: comidas){
			sumaTotal += c.getPrecio()+cal.calcularAdicional(c);
		}
		return sumaTotal;
	}


	public void consultarRequisitos(EstacionTrabajo estacion){
		for (ElementoComida comida : comidas) {
			if (estacion.cumple(comida)){
				comida.setEstacionAsignada(estacion.getNroEstacion());
			}
		}
	}


	@Override
	public String toString() {
		return 	"Pedido Nro = " + nroPedido +
				", Nro Mesa = " + nroMesa +
				", Mozo = " + mozo +"\n"+
				" Comidas = " + comidas + "\n" +
				" Precio total del pedido = $ " + precioFinalComida() +
				"\n";
	}

}