 class Figura {
public int wspolrzedneX;
public int wspolrzedneY;

private Kolor kolor;
public boolean pierwszyRuch;
protected Szachownica szachownica;
public int gracz;




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

}

public void usunPionek()
{
    szachownica.usunPionkaZPlanszy(this);
    wspolrzedneX = -1;
    wspolrzedneY = -1;


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
public Szachownica zwrocSzachownice()
{
    return  szachownica;
}



public Kolor zwrocKolor()
{
    return kolor;
}

public void moveTo(int xPosition, int yPosition){
         if (szachownica.sprawdzFigure(wspolrzedneX, wspolrzedneY) == this)
             szachownica.usunPionkaZPlanszy(this);
         this.wspolrzedneX = xPosition;
         this.wspolrzedneY = yPosition;

         Figura target = szachownica.sprawdzFigure(xPosition, yPosition);
         if (target != null){
             this.capturePiece(target);
         }


         szachownica.szachownicaUmiescFigure(this, xPosition, yPosition);

     }

     public void capturePiece(Figura capturedPiece){
         capturedPiece.usunPionek();
     }
     public boolean mozliwyRuch(int wspolrzedneX,int wspolrzedneY)
     {


         return false;
     }



}


















