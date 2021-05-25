package src;
import src.busquedas.*;

import java.util.ArrayList;

public class Palacio {
    private ArrayList<ElementoComida> comidas=new ArrayList<>();







//TODO Ver si se pueden armar metodos para hacer
// los add en la clase Palacio


    public static void main (String[] args){

        Pedido p1=new Pedido(5,2,"Juampi");
        ComidaBase c1=new ComidaBase ("pollo","carne","horno",250,45,1500);
        ComidaBase c2=new ComidaBase ("tapas de empanada","entrada","frito",50,3,500);
        ComidaCompuesta comp1=new ComidaCompuesta ("empanadas de pollo","entrada","frito");
        comp1.agregarComidaBase(c1);
        comp1.agregarComidaBase(c2);
        p1.agregarComida(comp1);
        ComidaBase c3=new ComidaBase ("arroz","cereal","hervido",120,30,200);
        ComidaCompuesta comp2=new ComidaCompuesta ("rissotto","guiso","olla");
        comp2.agregarComidaBase(c1);
        comp2.agregarComidaBase(c3);
        p1.agregarComida(comp2);


        System.out.println(p1);

        BuscarTiempoCoccion coc1=new BuscarTiempoCoccion(50);
        System.out.println(p1.buscar(coc1));


    }

}
