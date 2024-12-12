public class Circle{
    private double radius;
    private boolean filled;
    public double getCircumference(){
        return 2*SomeMaths.pi*radius;
    }
    public double getArea(){
        return SomeMaths.pi*SomeMaths.getSquare(radius);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius1){
        this.radius = radius1;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled1){
        this.filled = filled1;
    }

    Circle(){
        this.radius = 1;
        this.filled = false;
    }
    Circle(double radius){
        this.radius = radius;
        this.filled = false;
    }
    Circle(double radius, boolean filled){
        this.radius = radius;
        this.filled = filled;
    }
}
