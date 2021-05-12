package com.fabricaArboles;

import java.util.*;

public class AceboArbol implements IArbol {
    
    int fabAbies = 0;
    
    public AceboArbol() {
    }

    public void colocar(String tipoArbol) {
        if(fabAbies == 0){
            System.out.println("Fabricando Acebo");
            fabAbies++;
        }
    }

}