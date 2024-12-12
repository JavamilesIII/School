package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Wettkampf {
    private String name;
    ArrayList<Schiff> schiffe = new ArrayList<>();

    public Wettkampf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSchiff(Schiff s){
        schiffe.add(s);
    }
    public void start(){
        for(Schiff schiff : schiffe){
            schiff.race();
        }
    }
    public void printSchiffe(){
        System.out.println(getName());
        for(Schiff schiff : schiffe){
            System.out.println("\nNr: " + schiff.getNr() + "\nName: " + schiff.getName() + "\nZeit: " + schiff.getTime());

        }
    }
    public void printRangliste(){
        Collections.sort(this.schiffe);
        System.out.println(getName());
        for(Schiff schiff : schiffe){
            System.out.println("\nNr: " + schiff.getNr() + "\nName: " + schiff.getName() + "\nZeit: " + schiff.getTime());

        }
    }

}