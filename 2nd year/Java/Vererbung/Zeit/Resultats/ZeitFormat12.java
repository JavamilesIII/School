package Vererbung.Tier.Resultats;

class ZeitFormat12 extends ZeitFormat
{
  ZeitFormat12()
  {
    this(0, 0);
  }
  ZeitFormat12(int stunde, int minute)
  {
    super(stunde, minute);
  }

  void ausgabe()
  {
    int s = getStunde();
    boolean pm = s >= 12;
    int m = getMinute();
    if (pm)
      s -= 12;
    if (s == 0)
      s = 12;
    int s1 = s / 10;
    int s2 = s % 10;
    int m1 = m / 10;
    int m2 = m % 10;

    if (pm)
      System.out.printf("Uhrzeit: %d%d:%d%d PM%n",
                      s1, s2, m1, m2);
    else
      System.out.printf("Uhrzeit: %d%d:%d%d AM%n",
                      s1, s2, m1, m2);
  }
}