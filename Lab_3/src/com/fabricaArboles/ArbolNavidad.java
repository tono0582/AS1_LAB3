package com.fabricaArboles;

import java.util.*;

public abstract class ArbolNavidad extends ArbolNavidadFacade {

    protected IArbol colocar;
    
    public ArbolNavidad(IArbol colocar) {
        this.colocar = colocar;
    }

    public void colocar() {
        this.colocar.colocar("PINABETO");
        this.colocar.colocar("CHIRIVISCO");
        this.colocar.colocar("ACEBO");
        this.colocar.colocar("THUYA");
        this.colocar.colocar("PICEA");        
    }

}