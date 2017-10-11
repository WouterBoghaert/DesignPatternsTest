package be.vdab;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public abstract class Inwoner implements Observer {
    
    // membervariabelen
    
    private final String naam;
    
    // constructor
    
    public Inwoner(String naam) throws InwonerException {
        if (naam != null && !naam.trim().isEmpty()){
            this.naam = naam;
            //System.out.println(naam); //test
        }
        else {
            throw new InwonerException("Naam moet ingevuld zijn.");
        }
    }
    
    // getters
    
    public String getNaam(){
        return naam;
    }
    
    // andere methods
    
    public abstract void getReactie();
    
    @Override
    public void update(Observable observable, Object argument){
        if(!(observable instanceof Vulkaan)){
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) observable;
        getReactie();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.naam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inwoner other = (Inwoner) obj;
        if (!Objects.equals(this.naam, other.naam)) {
            return false;
        }
        return true;
    }
    
    
}
