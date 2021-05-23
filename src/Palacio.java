package src;

public class Palacio {


//TODO Ver si se pueden armar metodos para hacer
// los add en la clase Palacio


    public static void main (String[] args){
        Comida c1=new Comida ("pollo","carne","frito",250,750,2);
        Comida c2=new Comida ("empanadas de polenta","entrada","frito",988,120,20);
        Pedido p1=new Pedido(5,2,"Juampi");
        p1.agregarComida(c1);
        p1.agregarComida(c2);
        p1.calcularPrecio();
        System.out.println(p1);


    }

}
