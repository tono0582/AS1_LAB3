package com.fabricaArboles;

import java.util.*;

public class ListonDecorar extends LucesDecorar {

    int ListonDecorar = 0;
    
    public ListonDecorar(IArbol colocar) {
        super(colocar);
    }
    
    public void colocar(){
        super.colocar.colocar("PINABETO");
        this.addListon(super.colocar);
        
        super.colocar.colocar("CHIRIVISCO");
        this.addListon(super.colocar);
        
        super.colocar.colocar("ACEBO");
        this.addListon(super.colocar);
        
        super.colocar.colocar("THUYA");
        this.addListon(super.colocar);
        
        super.colocar.colocar("PICEA");
        this.addListon(super.colocar);
    }

    public void addListon(IArbol tree) {
        if(tree instanceof PinabeteArbol && ListonDecorar == 0){
            System.out.println("Decorando Pinabete con Listones");
        }
        
        if(tree instanceof ChiriviscoArbol && ListonDecorar == 0){
            System.out.println("Decorando Chirivisco con Listones");
        }
        
        if(tree instanceof AceboArbol && ListonDecorar == 0){
            System.out.println("Decorando Acebo con Listones");
        }
        
        if(tree instanceof ThuyaArbol && ListonDecorar == 0){
            System.out.println("Decorando Thuya con Listones");
        }
        
        if(tree instanceof PiceaArbol && ListonDecorar == 0){
            System.out.println("Decorando Picea con Listones");
        }
        ListonDecorar++;
    }

}