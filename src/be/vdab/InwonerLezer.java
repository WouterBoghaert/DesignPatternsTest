package be.vdab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public enum InwonerLezer {
    
    // membervariabelen
    
    INSTANCE;
    
    // andere methods
    
    public void lezer(Eiland eiland){
        Path INWONERS_PATH = Paths.get("C:\\Users\\Wouter\\Documents\\Java Wouter\\Design Patterns\\Test Design Patterns\\Eiland/inwoners.txt");
        try(Stream<String> stream = Files.lines(INWONERS_PATH)){
            stream.forEach(regel -> {
                try{
                    eiland.addInwoner(InwonerFactory.INSTANCE.maakInwoner(regel));
                }
                catch (InwonerException ex){
                    System.out.println(ex.getMessage());
                }});
        }
        catch(IOException ex){
            ex.printStackTrace();
        }        
    }
}
