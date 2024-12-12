package Vererbung.Tier.Resultats;

abstract class ZeitFormat extends Zeit
{
  ZeitFormat()
  {
    this(0, 0);
  }
  ZeitFormat(int stunde, int minute)
  {
    super(stunde, minute);
  }

  abstract void ausgabe();
}