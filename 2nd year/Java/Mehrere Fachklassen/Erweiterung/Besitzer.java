package Erweiterung;
/**
 * Diese Klasse repräsentiert ein Besitzer mit einem Namen, einem Vornamen und einem Wohnort.
 */
public class Besitzer {
    private String name;
    private String vorname;
    private String wohnort;
    /**
     * Konstruktor, um einen Besitzer zu erstellen.
     *
     * @param name der Name des Besitzers
     * @param vorname der Vorname des Besitzers
     * @param wohnort der Wohnort des Besitzers
     */
    public Besitzer(String name, String vorname, String wohnort){
        this.name = name;
        this.vorname = vorname;
        this.wohnort = wohnort;
    }

    /**
     * Gibt den Namen des Besitzers zurück
     *
     * @return der Name des Besitzers
     */
    public String getName() {
        return name;
    }
    /**
     * Gibt den Vornamen des Besitzers zurück
     *
     * @return der Vorname des Besitzers
     */
    public String getVorname() {
        return vorname;
    }
    /**
     * Gibt den Wohnort des Besitzers zurück
     *
     * @return der Wohnort des Besitzers
     */
    public String getWohnort() {
        return wohnort;
    }

    /**
     * Setzt den Namen des Besitzers
     *
     * @param name der Name des Besitzers
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Setzt den Vornamen des Besitzers
     *
     * @param vorname der Name des Besitzers
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    /**
     * Setzt den Wohnort des Besitzers
     *
     * @param wohnort der Name des Besitzers
     */
    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }
}
