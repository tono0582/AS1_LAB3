package com.fabricaArboles;

import java.util.*;

public class ThuyaArbol implements IArbol {

    int ThuyaArbol = 0;
    
    public ThuyaArbol() {
    }

    public void colocar(String tipoArbol) {
        if(ThuyaArbol == 0) {
            System.out.println("Fabricando Thuya");
            ThuyaArbol++;
        }
    }

}