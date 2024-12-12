package Vererbung.gebäude;

public class test_gebaeude {
    public static void main(String[] args) {
        Haus einfamilieHaus = new Haus();
        Gebaeude grosspetertower = new Gebaeude();
        einfamilieHaus.setAnzahl_stockwerke(3);
        einfamilieHaus.setHoehe(10);
        grosspetertower.setHoehe(70);
        einfamilieHaus.getInfos();
    }
}
