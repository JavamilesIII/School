package Erweiterung;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Diese Klasse repräsentiert ein Wettkampf mit einem Namen und eine Liste für Schiffe.
 */
public class Wettkampf {
    private String name;
    ArrayList<Schiff> schiffe = new ArrayList<>();

    /**
     * Konstruktor, um einen Wettkampf zu erstellen.
     *
     * @param name die Nummer des Schiffs
     */
    public Wettkampf(String name) {
        this.name = name;
    }
    /**
     * Gibt den Namen des Wettkampfs zurück
     *
     * @return der Name des Wettkampfs
     */
    public String getName() {
        return name;
    }

    /**
     * Methode um ein Schiff zu dem Wettkampf hinzuzufügen
     * @param s der Schiff der hinzugefügt wird
     */
    public void addSchiff(Schiff s){
        schiffe.add(s);
    }

    /**
     * Methode um für jedes Schiff den Wettkampf zu starten.
     */
    public void start(){
        for(Schiff schiff : schiffe){
            schiff.race();
        }
    }

    /**
     * Methode um die Schiffe mit deren Nummer, Zeit und Besitzer auszugeben.
     */
    public void printSchiffe(){
        System.out.println(getName());
        for(Schiff schiff : schiffe){
            System.out.println("\nNr: " + schiff.getNr() + "\nName: " + schiff.getName() + "\nZeit: " + schiff.getTime() + "\nBesitzer: " + schiff.getBesitzer().getVorname() + " " + schiff.getBesitzer().getName() + " aus " + schiff.getBesitzer().getWohnort());

        }
    }
    /**
     * Methode um die Schiffe mit deren Nummer, Zeit und Besitzer in einer Rangliste auszugeben.
     */
    public void printRangliste(){
        Collections.sort(this.schiffe);
        System.out.println(getName());
        for(Schiff schiff : schiffe){
            System.out.println("\nNr: " + schiff.getNr() + "\nName: " + schiff.getName() + "\nZeit: " + schiff.getTime() + "\nBesitzer: " + schiff.getBesitzer().getVorname() + " " + schiff.getBesitzer().getName() + " aus " + schiff.getBesitzer().getWohnort());

        }
    }

}