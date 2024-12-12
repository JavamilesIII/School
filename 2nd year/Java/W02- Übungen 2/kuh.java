public class kuh {
    private String name;
    private int gewicht;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getGewicht(){
        return gewicht;
    }
    public void setGewicht(int gewicht){
        this.gewicht = gewicht;
    }
    public void nameUndGewichtAusgabe(){
        System.out.println(this.getName()+this.getGewicht());
    }
}
