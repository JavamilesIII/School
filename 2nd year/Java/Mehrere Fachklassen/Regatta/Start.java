package Regatta;
public class Start {
    public static void main(String[] args) {
        Wettkampf w = new Wettkampf("Regatta");
        Schiff s1 = new Schiff(1, "Carlos");
        Schiff s2 = new Schiff(2, "Sven");
        Schiff s3 = new Schiff(3, "Ralf");
        w.addSchiff(s1);
        w.addSchiff(s2);
        w.addSchiff(s3);
        w.start();
        w.printSchiffe();
    }
}
