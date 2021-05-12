package com.fabricaArboles;

import java.util.*;

public class PiceaArbol implements IArbol {
    
    int PiceaArbol = 0;
    
    public PiceaArbol() {
    }

    public void colocar(String tipoArbol) {
        if(PiceaArbol == 0){
            System.out.println("Fabricando Picea ");
            PiceaArbol++;
        }
    }

}