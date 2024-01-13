import java.util.LinkedList;

class Figura {
public int wspolrzedneX;
public int wspolrzedneY;

private Kolor kolor;
public boolean pierwszyRuch;
protected Szachownica szachownica;
public int gracz;

private static LinkedList<Figura> wszystkieFigury = new LinkedList<>();


     public Figura(Szachownica szachownica, Kolor kolor){
         this.szachownica = szachownica;
         this.kolor = kolor;

         wspolrzedneX = -1;
         wspolrzedneY = -1;
     }



public Figura(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor,  int gracz)
{
    this.szachownica = szachownica;
    this.wspolrzedneX = wspolrzedneX;
    this.wspolrzedneY = wspolrzedneY;
    this.kolor = kolor;
    this.gracz = gracz;
    szachownica.szachownicaUmiescFigure(this,wspolrzedneX,wspolrzedneY);
    pierwszyRuch = false;
    wszystkieFigury.add(this);

}
    public static LinkedList<Figura> zwrocWszystkieFigury() {
        return wszystkieFigury;
    }

public void usunPionek()
{
    szachownica.usunPionkaZPlanszy(this);
    wspolrzedneX = -1;
    wspolrzedneY = -1;


}
    public boolean czyJestemKrolem() {
        return this instanceof Krol;
    }
    public boolean czySzach() {
        return false;
    }
public int zwrocX()
{
    return wspolrzedneX;
}
public boolean czyPierwszyRuch()
{
    return pierwszyRuch;
}
public int zwrocY()
{
         return wspolrzedneY;
}
public int zwrocGracza()
{
    return gracz;
}




public Kolor zwrocKolor()
{
    return kolor;
}

    public void ruchFigura(int wspolrzedneXRuchu, int wspolrzedneYRuchu) {
        if (szachownica.sprawdzFigure(wspolrzedneX, wspolrzedneY) == this) {
            if (wspolrzedneX >= 0 && wspolrzedneY >= 0) {
                szachownica.usunPionkaZPlanszy(this);
            }
        }

        this.wspolrzedneX = wspolrzedneXRuchu;
        this.wspolrzedneY = wspolrzedneYRuchu;

        Figura kukla = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);
        if (kukla != null) {
            this.zbijPionka(kukla);
        }
        System.out.println("Ruch: " + this.toString() + " z (" + zwrocX() + ", " + zwrocY() + ") na (" + wspolrzedneXRuchu + ", " + wspolrzedneYRuchu + ")");

        szachownica.szachownicaUmiescFigure(this, wspolrzedneXRuchu, wspolrzedneYRuchu);
    }

    public void zbijPionka(Figura zbityPionek) {
        if (!zbityPionek.czyJestemKrolem()) {
            zbityPionek.usunPionek();
            System.out.println("Zbicie figury: " + zbityPionek.getClass().getSimpleName() + " na (" + zbityPionek.zwrocX() + ", " + zbityPionek.zwrocY() + ")");
        }
    }
     public boolean mozliwyRuch(int wspolrzedneX,int wspolrzedneY)
     {


         return false;
     }



}


















