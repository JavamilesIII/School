package Vererbung.Tier.Resultats;

public class Uebung1
{
  public static void main(String[] args)
  {
    Zeit t = new Zeit(15, 3);
    System.out.printf("%d Uhr %d%n",
                      t.getStunde(), t.getMinute());
    t.setStunde(19);
    t.setMinute(45);
    System.out.printf("%d Uhr %d%n",
                      t.getStunde(), t.getMinute());
  }
}
