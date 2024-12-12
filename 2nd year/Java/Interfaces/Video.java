package Interfaces;

public class Video extends MediaAdapter{
    public void display() {
        System.out.println(this.getClass()+": Display video");
    }

    public void play() {
        System.out.println(this.getClass()+": Play video");
    }

    public void stop() {
        System.out.println(this.getClass()+": Stop video");
    }
}
