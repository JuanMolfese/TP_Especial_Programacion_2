package src;

public class SaleconFritas extends EstacionTrabajo {


	public SaleconFritas(int nroEstacion, boolean libre) {
		super(nroEstacion, libre);

	}

	public boolean cumple(ElementoComida c){
		//Siempre CUMPLE con la condicion
		return true;
	}

}
