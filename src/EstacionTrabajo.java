package src;

public abstract class EstacionTrabajo {
    protected int nroEstacion;
    protected boolean libre;

    public EstacionTrabajo(int nroEstacion, boolean libre) {
        this.nroEstacion = nroEstacion;
        this.libre = libre;
    }


    //Getters y Setters
    public int getNroEstacion() {
        return nroEstacion;
    }
    public void setNroEstacion(int nroEstacion) {
        this.nroEstacion = nroEstacion;
    }
    public boolean isLibre() {
        return libre;
    }
    public void setLibre(boolean libre) {
        this.libre = libre;
    }


    //Metodos abstractos que deben implementar los que implementen
    public abstract boolean cumple(Comida c);

}
