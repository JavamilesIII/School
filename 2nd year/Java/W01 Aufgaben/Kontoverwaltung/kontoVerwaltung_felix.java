import java.util.Scanner;

public class kontoVerwaltung_felix{
    private double kontostand = 0.0;

    // Methode zum Einzahlen
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println("Erfolgreich " + betrag + " eingezahlt.");
        } else {
            System.out.println("Ungültiger Betrag.");
        }
    }

    // Methode zum Abheben
    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
            System.out.println("Erfolgreich " + betrag + " abgehoben.");
        } else {
            System.out.println("Ungültiger Betrag oder zu wenig Guthaben.");
        }
    }

    // Methode zur Anzeige des Kontostands
    public void kontostandAnzeigen() {
        System.out.println("Aktueller Kontostand: " + kontostand);
    }

    public static void main(String[] args) {
        kontoVerwaltung_felix konto = new kontoVerwaltung_felix();
        Scanner scanner = new Scanner(System.in);
        char auswahl;

        do {
            System.out.println("\nKontostand (k), Einzahlen (e), Abheben (a), Beenden (b)");
            System.out.print("Bitte Auswahl eingeben: ");
            auswahl = scanner.next().charAt(0);

            if (auswahl == 'k') {
                konto.kontostandAnzeigen();
            } else if (auswahl == 'e') {
                System.out.print("Betrag eingeben: ");
                double betrag = scanner.nextDouble();
                konto.einzahlen(betrag);
            } else if (auswahl == 'a') {
                System.out.print("Betrag eingeben: ");
                double betrag = scanner.nextDouble();
                konto.abheben(betrag);
            } else if (auswahl == 'b') {
                System.out.println("Programm beendet.");
            } else {
                System.out.println("Ungültige Auswahl.");
            }

        } while (auswahl != 'b');

        scanner.close();
    }
    
}
