package src;

import java.util.ArrayList;

public class ComidaCompuesta extends ElementoComida {
    private ArrayList<ElementoComida> listaComidas= new ArrayList<>();

    public ComidaCompuesta(String nombre, String tipo, String modoPreparacion) {
        super(nombre, tipo, modoPreparacion,0);
        this.listaComidas = new ArrayList<>();


    }

    public void agregarComidaBase(ElementoComida com){
        if(!listaComidas.contains(com.getNombre())){
            listaComidas.add(com);
        }
    }




    @Override
    public int getPrecio() {
        int precioTotal=0;
        for (ElementoComida comida: listaComidas){
            precioTotal+= comida.getPrecio();

        }

        return precioTotal;
    }

    @Override
    public int getTiempo() {
        return 0;
    }

    @Override
    public int getCalorias() {
        return 0;
    }

    @Override
    public String toString() {
        return "ComidaCompuesta{" +
                "listaComidas=" + listaComidas +
                "preciototal=" + precio +
                '}';
    }
}
