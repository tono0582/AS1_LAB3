package com.fabricaArboles;

import java.util.*;

public class BombasDecorar extends ArbolNavidad {
    
    int BombasDecorar = 0;
    
    public BombasDecorar(IArbol colocar) {
        super(colocar);
    }
    
    public void colocar(){
        super.colocar.colocar("PINABETE");
        this.addBombas(super.colocar);     
        
        super.colocar.colocar("CHIRIVISCO");
        this.addBombas(super.colocar);
        
        super.colocar.colocar("ACEBO");
        this.addBombas(super.colocar);
        
        super.colocar.colocar("THUYA");
        this.addBombas(super.colocar);
        
        super.colocar.colocar("PICEA");
        this.addBombas(super.colocar);
    }
    
    

    public void addBombas(IArbol tree) {
        if(tree instanceof PinabeteArbol && BombasDecorar == 0){
            System.out.println("Decorando Pinabete con bombas de navidad");
        }
        
        if(tree instanceof ChiriviscoArbol && BombasDecorar == 0){
            System.out.println("Decorando Chirivisco con bombas de navidad");
        }
        
        if(tree instanceof AceboArbol && BombasDecorar == 0){
            System.out.println("Decorando Acebo con bombas de navidad");
        }
        
        if(tree instanceof ThuyaArbol && BombasDecorar == 0){
            System.out.println("Decorando Thuya con bombas de navidad");
        }
        
        if(tree instanceof PiceaArbol && BombasDecorar == 0){
            System.out.println("Decorando Picea con bombas de navidad");
        }
        BombasDecorar++;
    }

}
