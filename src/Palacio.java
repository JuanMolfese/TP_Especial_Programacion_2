package src;

import src.calculosTarifa.*;
import src.compositeComida.ComidaBase;
import src.compositeComida.ComidaCompuesta;
import src.criteriosEstacion.*;

public class Palacio {


    public static void main (String[] args){

    //Creamos COMIDAS SIMPLES Y COMPUESTAS
        ComidaBase c1=new ComidaBase ("pollo","carne","horno",250,10,1500);
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
        p1.agregarComida(c1);
        p1.agregarComida(comp1);
        p1.agregarComida(comp2);


    //***  ESTABLECIMIENTO DE CRITERIOS  ***
        //Por TIEMPO de coccion
        CriterioTiempoMenor tiempoCoc1=new CriterioTiempoMenor(50);

        //Por MODO de coccion
        CriterioModoPreparacion modoCoc1= new  CriterioModoPreparacion("horno");
        CriterioModoPreparacion modoCoc2= new  CriterioModoPreparacion("hervido");

        //Por TIPO de comida
        CriterioTipoComida tipoComida1 = new CriterioTipoComida("ensalada");
        CriterioTipoComida tipoComida2 = new CriterioTipoComida("carne");

        //Logica: AND y OR
        CriterioAND and_TiempoMenor50_y_ModoHorno = new CriterioAND(modoCoc1,tiempoCoc1);
        CriterioOR or_ModoHervido_o_TipoCarne = new CriterioOR(modoCoc2,tipoComida2);


    //*** CALCULADORES ***
        //Utilizamos Busquedas y determinamos valor monetarios para si se cumple o no se cumple.
        CalculadorPorCondicion calcCondicion_1 = new CalculadorPorCondicion(and_TiempoMenor50_y_ModoHorno, 50, 130);

        //Cargamos porcentajes fijos (positivos o negativos) a todas las comidas de un pedido.
        CalculadorPorPorcentaje calcMiercoles =new CalculadorPorPorcentaje("Miercoles",-20);

        //Combinacion logica and calculador por condicion y calculador por procentaje.
        CalculadorAND calculadorAnd_Condicion_1_y_miercoles = new CalculadorAND(calcCondicion_1 , calcMiercoles);


    //*** ESTACIONES DE TRABAJO  ***
        //Creamos una estacion de trabajo de tipo : Tiempo Max de Coccion
        EstacionTrabajo estTemporal_1 = new EstacionTrabajo("temporal",2,
                                        new CriterioTiempoMenor(45));

        //Cambiamos especialidad de la estacion en tiempo de ejecución
        estTemporal_1.setCriterio(new CriterioSaleConFritas());

        //Creamos una estacion de trabajo de tipo: Sale con Fritas - Atiende todas las comidas mientas este libre
        EstacionTrabajo estSaleConFritas_1 = new EstacionTrabajo("Sale con fritas",1,
                                             new CriterioSaleConFritas());
        //Creamos una estacion de trabajo de tipo: Tipo de Comida
        EstacionTrabajo estTipoComida_1 = new EstacionTrabajo("Por tipo",4,
                                          new CriterioTipoComida("carne"));
        //Creamos una estacion de trabajo de tipo: Modo de Preparacion
        EstacionTrabajo estModoPreparacion_1 = new EstacionTrabajo("Por modo preparacion",6,
                                               new src.criteriosEstacion.CriterioModoPreparacion("horno"));




    //*** COCINA ***
        //Creamos el objeto COCINA
        Cocina nuestraCocina = new Cocina();

        //Asignamos las estaciones de trabajo a la cocina.
        nuestraCocina.addEstacion(estTemporal_1);
        nuestraCocina.addEstacion(estModoPreparacion_1);
        nuestraCocina.addEstacion(estTipoComida_1);
        nuestraCocina.addEstacion(estSaleConFritas_1);

        //Entregamos PEDIDO a la COCINA
        nuestraCocina.addPedido(p1);


        //Asignamos las comidas del PEDIDO en la COCINA
        nuestraCocina.asignarComidas_aEstacion(p1);


        //Cargamos el CRITERIO DE CALCULO DE PRECIOS VIGENTE
        nuestraCocina.setCalculoAdicional(calculadorAnd_Condicion_1_y_miercoles);

        System.out.println(nuestraCocina);
        System.out.println (nuestraCocina.PrecioFinalPedido(p1));


    }

}