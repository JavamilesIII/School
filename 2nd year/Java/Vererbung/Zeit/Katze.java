package Vererbung.Tier;

public class Katze extends Tier {
    // Überschreibt die Methode geraeuschMachen() aus der Basisklasse
    @Override
    public void geraeuschMachen() {
        System.out.println("Die Katze miaut: Miau Miau");
    }
    public void mausJagen(){
        System.out.println("Die Katze jagt eine Mau!");
    }
    @Override
    public void essen(){
        System.out.println("Die Katze isst Fische!");
    }

}