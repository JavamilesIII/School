package Vererbung.gebäude;

public class Gebaeude {
    private int hoehe;
    public int anzahl_stockwerke;
    public int getAnzahl_stockwerke() {
        return anzahl_stockwerke;
    }
    public int getHoehe() {
        return hoehe;
    }
    public void setAnzahl_stockwerke(int anzahl_stockwerke) {
        this.anzahl_stockwerke = anzahl_stockwerke;
    }
    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
}
