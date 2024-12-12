package Vererbung.Tier;

// Unterklasse Hund, die von der Basisklasse Tier erbt
public class Hund extends Tier {
    // Überschreibt die Methode geraeuschMachen() aus der Basisklasse
    @Override
    public void geraeuschMachen() {
        System.out.println("Der Hund bellt: Wau Wau");
    }
    @Override
    public void essen(){
        System.out.println("Der Hund isst Knochen!");
    }
}
