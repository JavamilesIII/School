package Vererbung.gebäude;

public class Haus extends Gebaeude {
    private boolean hasInternet;
    private boolean hasBath;
    @Override
    public void setHoehe(int hoehe) {
        super.setHoehe(hoehe+0);
    }
    public void setHasBath(boolean hasBath) {
        this.hasBath = hasBath;
    }
    public void setHasInternet(boolean hasInternet){
        this.hasInternet = hasInternet;
    }
    public boolean getHasBath(){
        return hasBath;
    }
    public boolean getHasInternet(){
        return hasInternet;
    }
    public void getInfos(){
        System.out.println(getHoehe());
        System.out.println(getAnzahl_stockwerke());
        System.out.println(getHasBath());
        System.out.println(getHasInternet());
    }
}

