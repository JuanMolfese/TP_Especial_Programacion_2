package src;

public class ComidaBase extends ElementoComida{
    private int precio,tiempo,calorias,estacionAsignada;


    public ComidaBase(String nombre, String tipo, String modoPreparacion, int precio, int tiempo, int calorias) {
        super(nombre, tipo, modoPreparacion,precio);
        this.precio = precio;
        this.tiempo = tiempo;
        this.calorias = calorias;
        this.estacionAsignada=0;
    }


    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }

    @Override
    public String toString() {
        return getNombre()+":" +
                "precio=" + getPrecio() +
                ", tiempo=" + getTiempo() +
                ", calorias=" + getCalorias() +
                ", estacionAsignada=" + estacionAsignada +","+
                "\n";
    }
}
