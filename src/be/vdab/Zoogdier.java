package be.vdab;
public class Zoogdier extends Inwoner {
    
    // constructor
    
    public Zoogdier(String naam) throws InwonerException {
        super(naam);
    }
    
    // andere methods
    
    @Override
    public void getReactie(){
        System.out.println("Zoogdier " + this.getNaam() + " reageert op de vulkaanuitbarsting door in zijn hol te schuilen.");
    }
    
}
