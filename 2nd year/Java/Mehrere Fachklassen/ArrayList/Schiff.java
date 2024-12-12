package ArrayList;

import java.util.Random;

public class Schiff implements Comparable<Schiff> {
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


    public void race(){
        Random rand = new Random();
        time = rand.nextInt((600-300)+1)+300;
    }
    public int getTime() {
        return time;
    }


    public Schiff(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }
    @Override
    public int compareTo(Schiff o) {
        return this.time - o.time;
    }
}
