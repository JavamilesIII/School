package junit;

import java.util.Random;
/**
* Diese Klasse repräsentiert ein Schiff mit einer Nummer, einem Namen, einer Zeit und einem Besitzer.
 */
public class Schiff implements Comparable<Schiff> {
    private int nr;
    private String name;
    private int time;
    private Besitzer besitzer;


    /**
     * Konstruktor, um eine Schiff zu erstellen.
     *
     * @param nr die Nummer des Schiffs
     * @param name der Name des Schiffs
     */
    public Schiff(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }

    /**
     * Gibt den Namen des Schiffs zurück.
     *
     * @return der Name des Schiffs
     */

    public String getName() {
        return name;
    }
    /**
     * Setzt den Namen des Schiffs.
     *
     * @param name der neue Name des Schiffs
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gibt die Nummer des Schiffs zurück.
     *
     * @return die Nummer des Schiffs
     */

    public int getNr() {
        return nr;
    }

    /**
     * Setzt die Nummer des Schiffs.
     *
     * @param nr die neue Nummer des Schiffs
     */
    public void setNr(int nr) {
        this.nr = nr;
    }

    /**
     * Methode, um ein Wettkampf zu simulieren. Setzt die Zeit des Schiffs auf einer zufälligen Zahl zwischen 300 und 600.
     */
    public void race(){
        Random rand = new Random();
        time = rand.nextInt((600-300)+1)+300;
    }
    /**
     * Gibt die Zeit des Schiffs zurück.
     *
     * @return die Zeit des Schiffs
     */
    public int getTime() {
        return time;
    }

    /**
     * Gibt die Adresse des Besitzers zurück.
     *
     * @return die Adresse des Besitzers
     */
    public Besitzer getBesitzer(){
        return besitzer;
    }
    /**
     * Setzt die Adresse des Besitzers.
     *
     * @param besitzer die neue Adresse des Besitzers
     */
    public void setBesitzer(Besitzer besitzer){
        this.besitzer = besitzer;
    }

    /**
     * Überschreibt die Methode compareTo
     *
     *
     * @param o das Objekt zum Vergleichen.
     * @return die Zeit des Schiffs
     */
    @Override
    public int compareTo(Schiff o) {
        return this.time - o.time;
    }
}
