package Interfaces;

public class Audio extends MediaAdapter{
    public void play() {
        System.out.println(this.getClass()+": Play audio");
    }
    public void stop() {
        System.out.println(this.getClass()+": Stop audio");
    }
}
