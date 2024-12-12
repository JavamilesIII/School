public class CircleExercise {
    public static void main(String[] args){
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(8);
        Circle thirdCircle = new Circle(8,true);


        System.out.printf("1. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%nGefüllt: %b%n\n", firstCircle.getRadius(), firstCircle.getArea(), firstCircle.getCircumference(), firstCircle.getFilled());
        System.out.printf("2. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%nGefüllt: %b%n\n", secondCircle.getRadius(), secondCircle.getArea(), secondCircle.getCircumference(), secondCircle.getFilled());
        System.out.printf("3. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%nGefüllt: %b%n\n", thirdCircle.getRadius(), thirdCircle.getArea(), thirdCircle.getCircumference(), thirdCircle.getFilled());

    }
    
}