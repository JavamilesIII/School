public class Circle{
    double radius;
    public double getCircumference(){
        return 2*SomeMaths.pi*radius;
    }
    public double getArea( ){
        return SomeMaths.pi*SomeMaths.getSquare(radius);
    }
}
