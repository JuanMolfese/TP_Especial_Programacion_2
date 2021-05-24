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
        int tiempoTotal=0;
        for (ElementoComida comida: listaComidas){
            tiempoTotal+= comida.getTiempo();
        }

        return tiempoTotal;
    }

    @Override
    public int getCalorias() {
        int totalCalorias=0;
        for (ElementoComida comida: listaComidas){
            totalCalorias+= comida.getCalorias();

        }
        return totalCalorias;
    }

    @Override
    public String toString() {
        return getNombre()+"{" +
                "Compuesta por= " + listaComidas +
                "tiempoTotal= " + getTiempo() +" minutos, "+
                "total calorías= " + getCalorias() + " calorias, "+
                "preciototal= $" + getPrecio() +
                '}';
    }
}
