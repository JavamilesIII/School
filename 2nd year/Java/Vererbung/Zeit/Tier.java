package Vererbung.Tier;

// Basisklasse Tier
public class Tier {
    protected String rasse;
    // Methode, die von Unterklassen überschrieben werden kann
    public void geraeuschMachen() {
        System.out.println("Das Tier macht ein Geräusch");
    }
    public void essen(){
        System.out.println("Das Tier isst.");
    }
}
