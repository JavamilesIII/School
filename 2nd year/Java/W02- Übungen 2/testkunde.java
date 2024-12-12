public class testkunde {
    public static void main(String[] args){
        kunde k = new kunde();
        System.out.println(k.getKontostand());
        k.setKontostand(100);
        System.out.println(k.getKontostand());
    }
}
