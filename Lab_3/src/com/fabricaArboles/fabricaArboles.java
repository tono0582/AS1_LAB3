package com.fabricaArboles;

import java.util.*;

public class fabricaArboles {

    public fabricaArboles() {
    }

    public static void main(String[] args) {
        
        IArbol pinabete = new PinabeteArbol();
        ArbolNavidad bombas = new BombasDecorar(pinabete);
        ArbolNavidad luces = new LucesDecorar(pinabete);
        ArbolNavidad liston = new ListonDecorar(pinabete);
        ArbolNavidad monio = new MoniosDecorar(pinabete);
        ArbolNavidad camapana = new CampanasDecorar(pinabete);
        bombas.colocar();
        luces.colocar();
        liston.colocar();
        monio.colocar();
        camapana.colocar();
        System.out.println("---------------------------------------------------");
        
        IArbol picea = new PiceaArbol();
        ArbolNavidad bombas5 = new BombasDecorar(picea);
        ArbolNavidad luces5 = new LucesDecorar(picea);
        ArbolNavidad liston5 = new ListonDecorar(picea);
        ArbolNavidad monio5 = new MoniosDecorar(picea);
        ArbolNavidad camapana5 = new CampanasDecorar(picea);
        bombas5.colocar();
        luces5.colocar();
        liston5.colocar();
        monio5.colocar();
        camapana5.colocar();      
        System.out.println("---------------------------------------------------");
        
        IArbol chirivisco = new ChiriviscoArbol();
        ArbolNavidad bombas2 = new BombasDecorar(chirivisco);
        ArbolNavidad luces2 = new LucesDecorar(chirivisco);
        ArbolNavidad liston2 = new ListonDecorar(chirivisco);
        ArbolNavidad monio2 = new MoniosDecorar(chirivisco);
        ArbolNavidad camapana2 = new CampanasDecorar(chirivisco);
        bombas2.colocar();
        luces2.colocar();
        liston2.colocar();
        monio2.colocar();
        camapana2.colocar();
        System.out.println("---------------------------------------------------");
        
        IArbol acebo = new AceboArbol();
        ArbolNavidad bombas3 = new BombasDecorar(acebo);
        ArbolNavidad luces3 = new LucesDecorar(acebo);
        ArbolNavidad liston3 = new ListonDecorar(acebo);
        ArbolNavidad monio3 = new MoniosDecorar(acebo);
        ArbolNavidad camapana3 = new CampanasDecorar(acebo);
        bombas3.colocar();
        luces3.colocar();
        liston3.colocar();
        monio3.colocar();
        camapana3.colocar();
        System.out.println("---------------------------------------------------");
        
        IArbol thuya = new ThuyaArbol();
        ArbolNavidad bombas4 = new BombasDecorar(thuya);
        ArbolNavidad luces4 = new LucesDecorar(thuya);
        ArbolNavidad liston4 = new ListonDecorar(thuya);
        ArbolNavidad monio4 = new MoniosDecorar(thuya);
        ArbolNavidad camapana4 = new CampanasDecorar(thuya);
        bombas4.colocar();
        luces4.colocar();
        liston4.colocar();
        monio4.colocar();
        camapana4.colocar();
        System.out.println("---------------------------------------------------");
        

        
        
        
        
    }

}