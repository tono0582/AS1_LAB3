package com.fabricaArboles;

import java.util.*;

public class ChiriviscoArbol implements IArbol {

    int ChiriviscoArbol = 0;
    
    public ChiriviscoArbol() {
    }

    public void colocar(String typeTree) {
        if(ChiriviscoArbol == 0){
            System.out.println("Fabricando Chirivisco");
            ChiriviscoArbol++;
        }
    }

}