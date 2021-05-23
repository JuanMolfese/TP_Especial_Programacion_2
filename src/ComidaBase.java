package src;

public class ComidaBase extends ElementoComida{
    private int precio,tiempo,calorias;


    public ComidaBase(String nombre, String tipo, String modoPreparacion, int precio, int tiempo, int calorias) {
        super(nombre, tipo, modoPreparacion,precio);
        this.precio = precio;
        this.tiempo = tiempo;
        this.calorias = calorias;
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
        return "ComidaBase{" +
                "precio=" + precio +
                ", tiempo=" + tiempo +
                ", calorias=" + calorias +
                ", estacionAsignada=" + estacionAsignada +
                '}';
    }
}
