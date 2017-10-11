package be.vdab;

import java.util.Observable;

public class Vulkaan extends Observable {
    
    // membervariabelen
    
    private String naam;
    
    // constructor
    
    public Vulkaan(String naam){
        if (naam != null && !naam.trim().isEmpty()){
            this.naam = naam;
        }
    }
    
    // getters
    
    public String getNaam(){
        return naam;
    }
    
    // andere methods
    
    public void uitbarsting(){
        setChanged();
        notifyObservers();
    }
}
