package be.vdab;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public enum Eiland {
    
    // membervariabelen
    INSTANCE;
    private final Set<Inwoner> lijstVanInwoners  = new LinkedHashSet<>();
    private final Map<String,Vulkaan> lijstVanVulkanen = new LinkedHashMap<>();
    
    // constructor
    
    Eiland(){
        InwonerLezer.INSTANCE.lezer(Eiland.this);
        //inwonersInlezen();
        Vulkaan etna = new Vulkaan("Etna");
        Vulkaan vesuvius = new Vulkaan("Vesuvius");
        lijstVanVulkanen.put(etna.getNaam(), etna);
        lijstVanVulkanen.put(vesuvius.getNaam(),vesuvius);
        observeren();
    }
    
    // getters
    
    public Set<Inwoner> getLijstVanInwoners(){
        return lijstVanInwoners;
    }
    
    public Map<String, Vulkaan> getLijstVanVulkanen(){
        return lijstVanVulkanen;
    }
    
    // andere methods
    
    public void addInwoner(Inwoner inwoner){
        lijstVanInwoners.add(inwoner);
    }
    
    public void addVulkaan(Vulkaan vulkaan){
        lijstVanVulkanen.put(vulkaan.getNaam(),vulkaan);
    }
    
    public void observeren(){
        for (Inwoner inwoner: getLijstVanInwoners()){
            for (Vulkaan vulkaan: getLijstVanVulkanen().values()){
                vulkaan.addObserver(inwoner);
            }
        }
    }
    
//    public void inwonersInlezen(){
//        InwonerLezer.INSTANCE.lezer(this);
//    }
}
