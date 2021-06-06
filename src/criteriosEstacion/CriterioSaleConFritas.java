package src.criteriosEstacion;

import src.compositeComida.ElementoComida;
import src.EstacionTrabajo;

public class CriterioSaleConFritas implements CriterioEstacion {


	public CriterioSaleConFritas() {
	}

	public boolean cumple(ElementoComida c){
		//Siempre CUMPLE con la condicion
		return true;
	}

}
