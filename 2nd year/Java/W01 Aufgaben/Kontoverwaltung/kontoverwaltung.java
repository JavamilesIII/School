import java.util.Scanner;

public class kontoverwaltung {
    static Scanner sc = new Scanner(System.in);
    static double kontostand;

    public static void main(String[] args) {
        while (true) {
            System.out.println("********Einfaches Konto********");
            System.out.println("Aktueller Kontostand: " + kontostand);
            System.out.println("Einzahlen (e), Abheben (a), Beenden(b): ");
            String input = sc.next();

            if (input.equals("e")) {
                einzahlen();
            } else if (input.equals("a")) {
                abheben();
            } else if (input.equals("b")) {
                break;
            }
            else {
                System.out.println("Geben Sie bitte einen der angegebenen Buchstabe ein!!");
            }
        }
    }

    public static void einzahlen() {
        try{
            System.out.println("********Einfaches Konto********");
            System.out.println("Betrag einzahlen: ");
            double input = sc.nextDouble();
            kontostand += input;
        }
        catch (Exception e){
            System.out.println("Ihre Eingabe ist kein Betrag");
        }

    }

    public static void abheben() {
        try {            System.out.println("********Einfaches Konto********");
            System.out.println("Betrag abheben: ");
            double input = sc.nextDouble();
            if (input > kontostand){
                System.out.printf("Sie können nicht mahr als "+kontostand+" Franken beziehen.");
            }
            else{
                kontostand -= input;
            }
        }
        catch (Exception e){
            System.out.println("Ihre eingabe ist kein Betrag");
        }
    }
}
