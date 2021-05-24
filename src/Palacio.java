package src;

public class Palacio {


//TODO Ver si se pueden armar metodos para hacer
// los add en la clase Palacio


    public static void main (String[] args){

        ComidaBase c1=new ComidaBase ("pollo","carne","horno",250,45,1500);
        ComidaBase c2=new ComidaBase ("tapas de empanada","entrada","frito",50,3,500);
        ComidaCompuesta comp1=new ComidaCompuesta ("empanadas de pollo","entrada","frito");
        Pedido p1=new Pedido(5,2,"Juampi");
        comp1.agregarComidaBase(c1);
        comp1.agregarComidaBase(c2);

        System.out.println(comp1);


    }

}
