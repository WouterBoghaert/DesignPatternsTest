package be.vdab;
public class Vogel extends Inwoner {
    
    // constructor
    
    public Vogel(String naam) throws InwonerException {
        super(naam);
    }

    // andere methods
    
    @Override
    public void getReactie(){
        System.out.println("Vogel " + this.getNaam() + " reageert op de vulkaanuitbarsting door hoger te vliegen");
    }
}
