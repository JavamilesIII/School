package Vererbung.Tier.Resultats;

public class Uebung6
{
  public static void main(String[] args)
  {
    ZeitFormat t1 = new ZeitFormat12(0, 36);
    ZeitFormat t2 = new ZeitFormat12(7, 23);
    ZeitFormat t3 = new ZeitFormat12(14, 43);
    ZeitFormat t4 = new ZeitFormat24(0, 36);
    ZeitFormat t5 = new ZeitFormat24(7, 23);
    ZeitFormat t6 = new ZeitFormat24(14, 43);

    System.out.println("Ausgabe:");
    t1.ausgabe();
    t2.ausgabe();
    t3.ausgabe();
    t4.ausgabe();
    t5.ausgabe();
    t6.ausgabe();

    System.out.println();
    System.out.println("Vergleichen:");
    t1.ausgabe();
    t2.ausgabe();
    if (Uhrzeit.entspricht(t1, t2))
      System.out.println("t1 entspricht t2");
    else
      System.out.println("t1 und t2 sind verschieden");

   t1.ausgabe();
   t4.ausgabe();
   if (Uhrzeit.entspricht(t1, t4))
      System.out.println("t1 entspricht t4");
    else
      System.out.println("t1 und t4 sind verschieden");
  }
}
