package src;
import src.busquedas.*;
import src.calculosTarifa.*;
import src.compositeComida.ComidaBase;
import src.compositeComida.ComidaCompuesta;
import src.estacionesTrabajo.*;

public class Palacio {




    public static void main (String[] args){



    //Creamos COMIDAS SIMPLES Y COMPUESTAS
        ComidaBase c1=new ComidaBase ("pollo","carne","horno",250,45,1500);
        ComidaBase c2=new ComidaBase ("tapas de empanada","entrada","frito",50,3,500);
        ComidaBase c3=new ComidaBase ("arroz","cereal","hervido",120,30,200);

        ComidaCompuesta comp1=new ComidaCompuesta ("empanadas de pollo","entrada","horno");
        ComidaCompuesta comp2=new ComidaCompuesta ("rissotto","guiso","olla");

        comp1.agregarComidaBase(c1);
        comp1.agregarComidaBase(c2);

        comp2.agregarComidaBase(c1);
        comp2.agregarComidaBase(c3);

    //Creamos PEDIDO y agregamos COMIDAS
        Pedido p1=new Pedido(5,2,"Juampi");
        p1.agregarComida(comp1);
        p1.agregarComida(comp2);


    //***  BUSQUEDAS  ***
        //Por TIEMPO de coccion
        BuscarTiempoCoccion tiempoCoc1=new BuscarTiempoCoccion(50);

        //Por MODO de coccion
        BuscarModoCoccion modoCoc1= new BuscarModoCoccion("horno");
        BuscarModoCoccion modoCoc2= new BuscarModoCoccion("hervido");

        //Por TIPO de comida
        BuscarTipo tipoComida1 = new BuscarTipo("ensalada");
        BuscarTipo tipoComida2 = new BuscarTipo("carne");

        //Logica: AND y OR
        BusquedaCombinada_AND and = new BusquedaCombinada_AND(tiempoCoc1,modoCoc1);
        BusquedaCombinada_OR or = new BusquedaCombinada_OR(modoCoc2,tipoComida2);

        //Utilizamos Busquedas y determinamos valor monetarios para si se cumple o no se cumple.
        CalculadorPorCondicion calc1 = new CalculadorPorCondicion(and, 50, 130);

        //Cargo porcentajes fijos (positivos o negativos) a todas las comidas de un pedido.
        CalculadorPorPorcentaje porc1=new CalculadorPorPorcentaje("Miercoles",-20);
        CalculadorAND porcYCalc1=new CalculadorAND(calc1,porc1);


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
        System.out.println(nuestraCocina);

        //Cargamos el CRITERIO DE CALCULO DE PRECIOS VIGENTE
       nuestraCocina.setCalculoAdicional(porcYCalc1);
       System.out.println(nuestraCocina.PrecioFinalPedido(p1));










    }

}
