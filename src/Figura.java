import java.io.BufferedWriter;
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;
class Figura {
public int wspolrzedneX;
public int wspolrzedneY;

private Kolor kolor;
public boolean pierwszyRuch;
protected Szachownica szachownica;
public int gracz;


private static LinkedList<Figura> wszystkieFigury = new LinkedList<>();






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

        szachownica.szachownicaUmiescFigure(this, wspolrzedneXRuchu, wspolrzedneYRuchu);
    }

    public void zbijPionka(Figura zbityPionek) {
        if (!zbityPionek.czyJestemKrolem()) {
            zbityPionek.usunPionek();
            System.out.println("Zbicie figury: " + zbityPionek.getClass().getSimpleName());

        }
    }
     public boolean mozliwyRuch(int wspolrzedneX,int wspolrzedneY)
     {


         return false;
     }


    public void zapiszRuchDoPliku(int aktualnyGracz, Figura wybranaFigura,int wspolrzedneX,String wybranaWspolrzednaYZnak ,int koncoweX, String koncoweYZnak, int mode) {
        try {
            // ---- Tablica dziala na zakresie [0-7] dlatego trzeba dodac o jeden.
            wspolrzedneX++;
            koncoweX++;

            FileWriter writer = new FileWriter("Nowa_partia.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            if (aktualnyGracz==0){
                bufferedWriter.write(wybranaFigura.toString().charAt(0));
                bufferedWriter.write(wspolrzedneX+wybranaWspolrzednaYZnak);
                bufferedWriter.write(" - "+wybranaFigura.toString().charAt(0));
                bufferedWriter.write(koncoweX+koncoweYZnak+"\n");
            } else {
                bufferedWriter.write(wybranaFigura.toString().charAt(0));
                bufferedWriter.write(wspolrzedneX+wybranaWspolrzednaYZnak);
                bufferedWriter.write(" - "+wybranaFigura.toString().charAt(0));
                bufferedWriter.write(koncoweX+koncoweYZnak+"\t");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }


}


















