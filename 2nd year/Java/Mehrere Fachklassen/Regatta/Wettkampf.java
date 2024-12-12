package Regatta;
public class Wettkampf {
    private String name;
    Schiff[] schiffe = new Schiff[5];

    public Wettkampf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addSchiff(Schiff s){
        for(int i = 0; i<schiffe.length; i++){
            if(schiffe[i] == null){
                schiffe[i] = s;
                break;
            }
            else if(schiffe[4] != null){
                System.out.println("Alle Plätze besetzt!");
            }
        }
    }
    public void start(){
        for(int i = 0; i<schiffe.length; i++){
            if(schiffe[i] != null){
                schiffe[i].race();
            }
        }
    }
    public void printSchiffe(){
        for(int i = 0; i<schiffe.length; i++){
            if(schiffe[i] != null){
                System.out.println(getName() + "\nNr: " + schiffe[i].getNr() + "\nName: " + schiffe[i].getName() + "\nZeit: " + schiffe[i].getTime());
            }
        }
    }

}