package Vererbung.Tier.Resultats;

class ZeitFormat24 extends ZeitFormat
{
  ZeitFormat24()
  {
    this(0, 0);
  }
  ZeitFormat24(int stunde, int minute)
  {
    super(stunde, minute);
  }

  void ausgabe()
  {
    int m1 = getMinute() / 10;
    int m2 = getMinute() % 10;
    int s1 = getStunde() / 10;
    int s2 = getStunde() % 10;

    System.out.printf("Uhrzeit: %d%d:%d%d%n",
                      s1, s2, m1, m2);
  }
}