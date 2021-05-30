package src.estacionesTrabajo;

import src.ElementoComida;

public class EstacionSaleconFritas extends EstacionTrabajo {


	public EstacionSaleconFritas(int nroEstacion, boolean libre) {
		super(nroEstacion, libre);

	}

	public boolean cumple(ElementoComida c){
		//Siempre CUMPLE con la condicion
		return true;
	}

}
