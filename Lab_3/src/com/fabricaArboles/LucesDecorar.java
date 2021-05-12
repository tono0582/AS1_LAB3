package com.fabricaArboles;

import java.util.*;

public class LucesDecorar extends BombasDecorar {

    int LucesDecorar = 0;
    
    public LucesDecorar(IArbol colocar) {
        super(colocar);
    }
    
    public void colocar(){
        super.colocar.colocar("PINABETO");
        this.addLuces(super.colocar);
        
        super.colocar.colocar("CHIRIVISCO");
        this.addLuces(super.colocar);
        
        super.colocar.colocar("ABIES");
        this.addLuces(super.colocar);
        
        super.colocar.colocar("ACEBO");
        this.addLuces(super.colocar);
        
        super.colocar.colocar("PICEA");
        this.addLuces(super.colocar);
    }

    public void addLuces(IArbol tree) {
        if(tree instanceof PinabeteArbol && LucesDecorar == 0){
            System.out.println("Decorando Pinabete con luces de colores");
        }
        
        if(tree instanceof ChiriviscoArbol && LucesDecorar == 0){
            System.out.println("Decorando Chirivisco con luces de colores");
        }
        
        if(tree instanceof AceboArbol && LucesDecorar == 0){
            System.out.println("Decorando Acebo con luces de colores");
        }
        
        if(tree instanceof ThuyaArbol && LucesDecorar == 0){
            System.out.println("Decorando Thuya con luces de colores");
        }
        
        if(tree instanceof PiceaArbol && LucesDecorar == 0){
            System.out.println("Decorando Picea con luces de colores");
        }
        
        LucesDecorar++;
    }

}