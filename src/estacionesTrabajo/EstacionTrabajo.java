package src.estacionesTrabajo;

import src.ElementoComida;

public abstract class EstacionTrabajo {
    protected int nroEstacion;
    protected boolean libre;

    public EstacionTrabajo(int nroEstacion, boolean libre) {
        this.nroEstacion = nroEstacion;
        this.libre = libre;
    }

    //GETTERS y SETTERS
    public int getNroEstacion() {return nroEstacion;}
    public void setNroEstacion(int nroEstacion) {
        this.nroEstacion = nroEstacion;
    }
    public boolean isLibre() {
        return libre;
    }
    public void setLibre(boolean libre) {
        this.libre = libre;
    }


    //TODO Metodos abstractos que deben tener los que implementen
    public abstract boolean cumple(ElementoComida c);

}
