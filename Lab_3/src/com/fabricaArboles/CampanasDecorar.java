package com.fabricaArboles;

import java.util.*;

public class CampanasDecorar extends MoniosDecorar {

    int CampanasDecorar = 0;
    
    public CampanasDecorar(IArbol colocar) {
        super(colocar);
    }
    
    public void colocar(){
        super.colocar.colocar("PINABETE");
        this.addCampana(super.colocar);
        
        super.colocar.colocar("CHIRIVISCO");
        this.addCampana(super.colocar);
        
        super.colocar.colocar("ACEBO");
        this.addCampana(super.colocar);
        
        super.colocar.colocar("THUYA");
        this.addCampana(super.colocar);
        
        super.colocar.colocar("PICEA");
        this.addCampana(super.colocar);
    }

    public void addCampana(IArbol tree) {
        if(tree instanceof PinabeteArbol && CampanasDecorar == 0){
            System.out.println("Decorando Pinabete con Campanas");
        }
        
        if(tree instanceof ChiriviscoArbol && CampanasDecorar == 0){
            System.out.println("Decorando Chirivisco con Campanas");
        }
        
        if(tree instanceof AceboArbol && CampanasDecorar == 0){
            System.out.println("Decorando Acebo con Campanas");
        }
        
        if(tree instanceof ThuyaArbol && CampanasDecorar == 0){
            System.out.println("Decorando Thuya con Campanas");
        }
        
        if(tree instanceof PiceaArbol && CampanasDecorar == 0){
            System.out.println("Decorando Picea con Campanas");
        }
        CampanasDecorar++;
    }

}