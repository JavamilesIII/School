package Vererbung.Tier.Resultats;

class Zeit
{
  private int stunde;
  private int minute;

  void setStunde(int stunde)
  {
    if (stunde>=0)
      this.stunde = stunde;
  }

  void setMinute(int minute)
  {
    if (minute>=0 && minute<60)
      this.minute = minute;
  }

  int getStunde()
  {
    return stunde;
  }

  int getMinute()
  {
    return minute;
  }

  Zeit()
  {
    this(0, 0);
  }

  Zeit(int stunde, int minute)
  {
    setStunde(stunde);
    setMinute(minute);
  }

  protected Object clone()
  {
    Zeit om = new Zeit(getStunde(), getMinute());
    return om;
  }

  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if ((obj == null) || (this.getClass() != obj.getClass()))
      return false;
    if (  (this.getStunde() == ((Zeit)obj).getStunde())
       && (this.getMinute() == ((Zeit)obj).getMinute()))
      return true;
    else
      return false;
  }
}