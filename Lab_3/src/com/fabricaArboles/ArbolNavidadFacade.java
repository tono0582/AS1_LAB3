package com.fabricaArboles;

import java.util.*;

public class ArbolNavidadFacade {
    
    public List<String> pinabeteArbol;
    public List<String> chiriviscoArbol;
    public List<String> aceboArbol;
    public List<String> thuyaArbol;
    public List<String> piceaArbol;
    
    public ArbolNavidadFacade() {
        this.pinabeteArbol = new ArrayList();
        this.chiriviscoArbol = new ArrayList();
        this.aceboArbol = new ArrayList();
        this.thuyaArbol = new ArrayList();
        this.piceaArbol = new ArrayList();
        
        this.pinabeteArbol.add("PINABETE");
        this.chiriviscoArbol.add("CHIRIVISCO");
        this.aceboArbol.add("ACEBO");
        this.thuyaArbol.add("THUYA");
        this.piceaArbol.add("PICEA");
    }

    public void colocarPinabete() {
        IArbol pinabete = new PinabeteArbol();
        
        for(int i=0; i<this.pinabeteArbol.size(); i++){
            pinabete.colocar(this.pinabeteArbol.get(i));
        }
    }

    public void colocarChirivisco() {
        IArbol chirivisco = new ChiriviscoArbol();
        
        for(int i=0; i<this.chiriviscoArbol.size(); i++){
            chirivisco.colocar(this.chiriviscoArbol.get(i));
        }
    }

    public void colocarAcebo() {
        IArbol acebo = new AceboArbol();
        
        for(int i=0; i<this.aceboArbol.size(); i++){
            acebo.colocar(this.aceboArbol.get(i));
        }
    }

    public void colocarThuya() {
        IArbol thuya = new ThuyaArbol();
        
        for(int i=0; i<this.thuyaArbol.size(); i++){
            thuya.colocar(this.thuyaArbol.get(i));
        }
    }

    public void colocarPicea() {
        IArbol picea = new PiceaArbol();
        
        for(int i=0; i<this.piceaArbol.size(); i++){
            picea.colocar(this.piceaArbol.get(i));
        }
    }

}