package src.compositeComida;

import java.util.Objects;

public abstract class ElementoComida {
   private String nombre,tipo,modoPreparacion;
   private int estacionAsignada;


    public ElementoComida(String nombre, String tipo, String modoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        this.estacionAsignada=0;
    }

    //GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public void setEstacionAsignada(int estacionAsignada) {
        this.estacionAsignada = estacionAsignada;
    }

    public abstract int getPrecio();
    public abstract int getTiempo();
    public abstract int getCalorias();



    @Override
    public boolean equals(Object o) {
        ElementoComida that = (ElementoComida) o;
        return Objects.equals(getNombre(), that.getNombre());
    }

    @Override
    public String toString() {
        return  "Nombre = " + nombre +
                ", Tipo = " + tipo +
                ", Modo de preparacion = " + modoPreparacion +
                ", Estacion Asignada = " + estacionAsignada + " , ";
    }
}
