package src;

public class Palacio {


//TODO Ver si se pueden armar metodos para hacer
// los add en la clase Palacio


    public static void main (String[] args){
        Comida c1=new Comida ("pollo","carne","frito",250,750,2);
        Pedido p1=new Pedido(5,2,"Juampi");
        p1.agregarComida(c1);
        System.out.println(p1);


    }

}
