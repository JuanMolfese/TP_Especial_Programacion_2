package src;

public abstract class EstacionTrabajo {
    private String nombre;
    private boolean libre;

    public EstacionTrabajo(String nombre, boolean libre) {
        this.nombre = nombre;
        this.libre = libre;
    }

    public String getNombre() {
        return nombre;
    }



    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public abstract void estaLibre();

}
