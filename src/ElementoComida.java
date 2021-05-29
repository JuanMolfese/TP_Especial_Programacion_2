package src;

import java.util.Objects;

public abstract class ElementoComida {
   private String nombre,tipo,modoPreparacion;

//TODO tenemos q re-hablar el tema del precio, en teoria todo elemento comida, tendria que
// tener un precio ? pienso que si. Aca esta en la signatura pero no el constructor y por
// ende no le podemos hacer un setPrecio (que lo veo necesario al implementar la
// busquedaSumaPorcentajeFijoPropina, ya que quería setear el vamor sumandole el porcentaje que
// pasen al crear/instanciar la busqueda).
    public ElementoComida(String nombre, String tipo, String modoPreparacion) {
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
    //public void setPrecio(int precio){this.precio = precio;}


    public abstract int getPrecio();
    public abstract int getTiempo();
    public abstract int getCalorias();



    @Override
    public boolean equals(Object o) {
        ElementoComida that = (ElementoComida) o;
        return Objects.equals(getNombre(), that.getNombre());
    }


}
