package Regatta;

import java.util.Random;

public class Schiff {
    private int nr;
    private String name;
    private int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNr() {
        return nr;
    }
    public void setNr(int nr) {
        this.nr = nr;
    }


    public int race(){
        Random rand = new Random();
        time = rand.nextInt((600-300)+1)+300;
        return time;
    }
    public int getTime() {
        return time;
    }
    public Schiff(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }
}
