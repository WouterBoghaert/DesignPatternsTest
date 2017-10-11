package be.vdab;
public class EilandMain {
    public static void main(String[] args) {
        Eiland.INSTANCE.getLijstVanVulkanen().get("Etna").uitbarsting();
    }    
}
