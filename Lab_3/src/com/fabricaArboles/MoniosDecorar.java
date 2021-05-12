package com.fabricaArboles;

import java.util.*;

public class MoniosDecorar extends ListonDecorar {

    int MoniosDecorar = 0;
    
    public MoniosDecorar(IArbol colocar) {
        super(colocar);
    }
    
    public void colocar(){
        super.colocar.colocar("PINABETE");
        this.addMonio(super.colocar);
        
        super.colocar.colocar("CHIRIVISCO");
        this.addMonio(super.colocar);
        
        super.colocar.colocar("ACEBO");
        this.addMonio(super.colocar);
        
        super.colocar.colocar("THUYA");
        this.addMonio(super.colocar);
        
        super.colocar.colocar("PICEA");
        this.addMonio(super.colocar);
    }

    public void addMonio(IArbol tree) {
        if(tree instanceof PinabeteArbol && MoniosDecorar == 0){
            System.out.println("Decorando Pinabete con Moños de navidad");
        }
        
        if(tree instanceof ChiriviscoArbol && MoniosDecorar == 0){
            System.out.println("Decorando Chirivisco con Moños de navidad");
        }
        
        if(tree instanceof AceboArbol && MoniosDecorar == 0){
            System.out.println("Decorando Acebo con Moños de navidad");
        }
        
        if(tree instanceof ThuyaArbol && MoniosDecorar == 0){
            System.out.println("Decorando Thuya con Moños de navidad");
        }
        
        if(tree instanceof PiceaArbol && MoniosDecorar == 0){
            System.out.println("Decorando Picea con Moños de navidad");
        }
        MoniosDecorar++;
    }

}