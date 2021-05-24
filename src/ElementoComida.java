package src;

import java.util.Objects;

public abstract class ElementoComida {
   private String nombre,tipo,modoPreparacion;


    public ElementoComida(String nombre, String tipo, String modoPreparacion,int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
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
