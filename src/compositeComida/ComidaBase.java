package src.compositeComida;

public class ComidaBase extends ElementoComida{
    private int precio,tiempo,calorias;



    public ComidaBase(String nombre, String tipo, String modoPreparacion, int precio, int tiempo, int calorias) {
        super(nombre, tipo, modoPreparacion);
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
        return   super.toString()+
                "Precio = $ " + getPrecio() +
                ", Tiempo = " + getTiempo() + " min "+
                ", Calorias = " + getCalorias() +
                "\n";
    }
}
