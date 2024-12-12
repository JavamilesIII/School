package Vererbung.Tier.Resultats;

final class Uhrzeit
{
  static boolean entspricht(Zeit t1, Zeit t2)
  {
    return ((t1.getStunde() == t2.getStunde())
         && (t2.getMinute() == t2.getMinute()));
  }
}