package com.fabricaArboles;

import java.util.*;

public class PinabeteArbol implements IArbol {
    
    int PinabeteArbol = 0;
    
    public PinabeteArbol() {
    }

    public void colocar(String tipoArbol) {
        if(PinabeteArbol == 0){
            System.out.println("Fabricando Pinabete");
            PinabeteArbol++;
        }
        
    }

}