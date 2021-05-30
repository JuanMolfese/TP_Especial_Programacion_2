package src;
import src.busquedas.*;
import src.calculosTarifa.CalculadorPorCondicion;
import src.calculosTarifa.CalculadorPorPorcentaje;
import src.estacionesTrabajo.EstacionModoPreparacion;
import src.estacionesTrabajo.EstacionTemporal;
import src.estacionesTrabajo.EstacionSaleconFritas;
import src.estacionesTrabajo.EstacionTipoComida;

import java.util.ArrayList;


public class Palacio {
    private ArrayList<ElementoComida> comidas=new ArrayList<>();



//TODO Ver si se pueden armar metodos para hacer
// los add en la clase Palacio


    public static void main (String[] args){



    //Creamos COMIDAS SIMPLES Y COMPUESTAS
        ComidaBase c1=new ComidaBase ("pollo","carne","horno",250,45,1500);
        ComidaBase c2=new ComidaBase ("tapas de empanada","entrada","frito",50,3,500);
        ComidaBase c3=new ComidaBase ("arroz","cereal","hervido",120,30,200);

        ComidaCompuesta comp1=new ComidaCompuesta ("empanadas de pollo","entrada","frito");
        ComidaCompuesta comp2=new ComidaCompuesta ("rissotto","guiso","olla");

        comp1.agregarComidaBase(c1);
        comp1.agregarComidaBase(c2);

        comp2.agregarComidaBase(c1);
        comp2.agregarComidaBase(c3);

    //Creamos PEDIDO y agregamos COMIDAS
        Pedido p1=new Pedido(5,2,"Juampi");
        p1.agregarComida(comp1);
        p1.agregarComida(comp2);
        p1.agregarComida(c1);

    //***  BUSQUEDAS  ***
        //Por TIEMPO de coccion
        BuscarTiempoCoccion tiempoCoc1=new BuscarTiempoCoccion(20);

        //Por MODO de coccion
        BuscarModoCoccion modoCoc1= new BuscarModoCoccion("horno");
        BuscarModoCoccion modoCoc2= new BuscarModoCoccion("hervido");

        //Por TIPO de comida
        BuscarTipo tipoComida1 = new BuscarTipo("ensalada");
        BuscarTipo tipoComida2 = new BuscarTipo("carne");

        //Logica: AND y OR
        BusquedaCombinada_AND and = new BusquedaCombinada_AND(tiempoCoc1,modoCoc1);
        BusquedaCombinada_OR or = new BusquedaCombinada_OR(modoCoc2,tipoComida2);

    //TODO Criterios de Calculo de precios que establece la COCINA
        //Utilizo Busquedas y determino valor monetarios para si se cumple o no se cumple.
        CalculadorPorCondicion calc1 = new CalculadorPorCondicion(and, 50, 130);
        //Cargo porcentajes fijos (positivos o negativos) a todas las comidas de un pedido.
        CalculadorPorPorcentaje porc1=new CalculadorPorPorcentaje("Miercoles",-20);

    //*** ESTACIONES DE TRABAJO  ***
        //Creamos una estacion de trabajo de tipo : Tiempo Max de Coccion
        EstacionTemporal estTemporal1 = new EstacionTemporal(1, true, 80);
        //Creamos una estacion de trabajo de tipo: Sale con Fritas - Atiende todas las comidas mientas este libre
        EstacionSaleconFritas estSaleConFritas1 = new EstacionSaleconFritas(2,true);
        //Creamos una estacion de trabajo de tipo: Tipo de Comida
        EstacionTipoComida estTipoComida1 = new EstacionTipoComida(3, true, "carne");
        //Creamos una estacion de trabajo de tipo: Modo de Preparacion
        EstacionModoPreparacion estModoPreparacion1 = new EstacionModoPreparacion(4, true, "horno");

    //*** COCINA ***
        //Creamos el objeto COCINA
        Cocina nuestraCocina = new Cocina();

        //Asignamos las estaciones de trabajo a la cocina.
        nuestraCocina.addEstacion(estTemporal1);
        nuestraCocina.addEstacion(estSaleConFritas1);
        nuestraCocina.addEstacion(estTipoComida1);
        nuestraCocina.addEstacion(estModoPreparacion1);

        //Entregamos PEDIDO a la COCINA
        nuestraCocina.addPedido(p1);

        //Cargamos el CRITERIO DE CALCULO DE PRECIOS VIGENTE
        nuestraCocina.addCriterioCalculoPrecios(calc1);

        //TODO
        /*nuestraCocina.setFormaCalculo_MontoPedido(tiempoCoc1);
        nuestraCocina.setFormaCalculo_MontoPedido(modCoc1);
        nuestraCocina.setFormaCalculo_MontoPedido(tipoCoc1);
        nuestraCocina.setFormaCalculo_MontoPedido(and);*/


        //TODO
        //int monto = nuestraCocina.cobrarPedido(p1);
        //System.out.println(monto);

        //System.out.println(p1);
        //System.out.println(p1.buscar(coc1));



    }

}
