package src;

import java.util.Objects;

public abstract class ElementoComida {
   private String nombre,tipo,modoPreparacion;
    protected int estacionAsignada,precio;

    public ElementoComida(String nombre, String tipo, String modoPreparacion,int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        estacionAsignada=0;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public int getEstacionAsignada() {
        return estacionAsignada;
    }

    public abstract int getPrecio();
    public abstract int getTiempo();
    public abstract int getCalorias();



    @Override
    public boolean equals(Object o) {

        ElementoComida that = (ElementoComida) o;
        return Objects.equals(getNombre(), that.getNombre());
    }


}
