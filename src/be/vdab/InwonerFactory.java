package be.vdab;
public enum InwonerFactory {
    
    // membervariabelen
    
    INSTANCE;
    
    // andere methods
    
    public Inwoner maakInwoner(String regel) throws InwonerException {
        char soort = regel.charAt(0);
        String naam = regel.substring(1).trim(); // eventuele spaties op einde regel weghalen
        
        switch (soort){
            case 'V':
                try {
                    return new Vogel(naam);
                }
                catch(InwonerException ex){
                    System.out.println(ex.getMessage());
                }
            case 'Z':
                try {
                    return new Zoogdier(naam);
                }
                catch (InwonerException ex){
                    System.out.println(ex.getMessage());
                }
            default:
                throw new InwonerException("Inwoner " + naam + "is geen correcte inwoner.");
        }
    }
}
