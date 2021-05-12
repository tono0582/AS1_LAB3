package com.fabricaArboles;

import java.util.*;

public class AceboArbol implements IArbol {
    
    int AceboArbol = 0;
    
    public AceboArbol() {
    }

    public void colocar(String tipoArbol) {
        if(AceboArbol == 0){
            System.out.println("Fabricando Acebo");
            AceboArbol++;
        }
    }

}