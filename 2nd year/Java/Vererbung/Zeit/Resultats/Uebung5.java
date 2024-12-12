package Vererbung.Tier.Resultats;

public class Uebung5
{
  public static void main(String[] args)
  {
    Zeit t1 = new Zeit(0, 36);
    Zeit t2 = new Zeit(7, 23);

    System.out.printf("Uhrzeit t1: %d Uhr %d%n",
                      t1.getStunde(), t1.getMinute());
    System.out.printf("Uhrzeit t2: %d Uhr %d%n",
                      t2.getStunde(), t2.getMinute());

    if(!t1.equals(t2))
      System.out.println("t1 ist nicht die gleiche Zeit wie t2");
    else
      System.out.println("t1 ist die gleiche Zeit wie t2");


    Zeit t3 = (Zeit)t1.clone();
    System.out.printf("Uhrzeit t3: %d Uhr %d%n",
                      t3.getStunde(), t3.getMinute());

    if(!t1.equals(t3))
      System.out.println("t1 ist nicht die gleiche Zeit wie t3");
    else
      System.out.println("t1 ist die gleiche Zeit wie t3");

    t3.setStunde(19);
    t3.setMinute(45);

    System.out.printf("Neue Uhrzeit t3: %d Uhr %d%n",
                      t3.getStunde(), t3.getMinute());
  }
}
