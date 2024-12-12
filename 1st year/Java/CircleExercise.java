public class CircleExercise {
    public static void main(String[] args){
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle();
        Circle thirdCircle = new Circle();

        firstCircle.radius = 3;
        secondCircle.radius = 8;
        thirdCircle.radius = 5;

        System.out.printf("1. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n\n", firstCircle.radius, firstCircle.getArea(), firstCircle.getCircumference());
        System.out.printf("2. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n\n", secondCircle.radius, secondCircle.getArea(), secondCircle.getCircumference());
        System.out.printf("3. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n\n", thirdCircle.radius, thirdCircle.getArea(), thirdCircle.getCircumference());

    }
    
}