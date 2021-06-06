package src;

import src.compositeComida.ElementoComida;
import src.criteriosEstacion.CriterioEstacion;

public  class EstacionTrabajo {
    private String nombre;
    private int nroEstacion;
    private boolean libre;
    private CriterioEstacion criterio;

    public EstacionTrabajo(String nombre, int nroEstacion, CriterioEstacion criterio) {
        this.nombre = nombre;
        this.nroEstacion = nroEstacion;
        this.libre = true;
        this.criterio = criterio;
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

    public String getNombre() {
        return nombre;
    }

    public void setCriterio(CriterioEstacion criterio) {
        this.criterio = criterio;
    }

    public boolean recibeComida(ElementoComida c){
        return (this.isLibre()&& criterio.cumple(c));
    }

    @Override
    public String toString() {
        return "Estacion de Trabajo :" + nroEstacion +
                ", libre=" + libre + "\n";
    }
}