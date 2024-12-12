package Erweiterung;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Start {
    public static void main(String[] args) {
        /**
         * Erstellen von neuen Objekten aus Wettkampf, Schiff und Besitzer.
         */
        Wettkampf w = new Wettkampf("Regatta");
        Schiff s1 = new Schiff(1, "Carlos");
        Schiff s2 = new Schiff(2, "Sven");
        Schiff s3 = new Schiff(3, "Ralf");
        Besitzer b1 = new Besitzer("Kluge", "Tim", "Liestal");
        Besitzer b2 = new Besitzer("Thüring", "Felix", "Laufenburg");
        Besitzer b3 = new Besitzer("Hagmann", "Rinor", "Reinach");
        /**
         * Setzt Besitzer zu Schiffe
         */
        s1.setBesitzer(b1);
        s2.setBesitzer(b2);
        s3.setBesitzer(b3);
        /**
         * Fügt alle Schiffe zum Wettkampf hinzu
         */
        w.addSchiff(s1);
        w.addSchiff(s2);
        w.addSchiff(s3);
        /**
         * Startet den Wettkampf und druckt die Ergebnisse aus.
         */
        w.start();
        @Test
                void correctTime(){
            assumeTrue()
        }
        //w.printSchiffe();
        w.printRangliste();
    }
}
