package Vererbung.Tier;

public class RunTier {
    public static void main(String[] args) {
        Tier tier = new Hund(); // tier ist vom Typ Tier, aber zeigt auf ein Hund-Objekt
        tier.geraeuschMachen(); // Ruft die Methode aus der Hund-Klasse auf (dynamische Bindung)
        tier.essen();

        Tier tier2 = new Tier();
        tier2.geraeuschMachen();
        tier2.essen();
        System.out.println(tier instanceof Hund);
        System.out.println(tier2 instanceof Hund);

        Katze katz = new Katze();
        katz.geraeuschMachen();
        katz.mausJagen();
        System.out.println(katz instanceof Tier);
    
    }
}

