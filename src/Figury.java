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
class Pionek extends Figura {





    // Konstruktor klasy Pionek
    public Pionek(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor,  int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);
    }

    public boolean mozliwyRuch(int wspolrzedneXRuchu,int wspolrzedneYRuchu)
    {   //Ruch do przodu
        // Kukla do sprawdzania pól
        Figura kukla = szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu);
        if(gracz ==1 && szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu) == null )
        {
            // Ruch o przodu o 2 pola, tylko gdy jest to pierwszy ruch, oraz przed figura nic nie stoi
            if(wspolrzedneXRuchu - wspolrzedneX == 2 && wspolrzedneYRuchu == wspolrzedneY && !pierwszyRuch && szachownica.sprawdzFigure(wspolrzedneXRuchu-1,wspolrzedneYRuchu) == null )
            {
                this.pierwszyRuch = true;
                return true;
            }
            // zwykly ruch do przodu
            else if(wspolrzedneXRuchu - wspolrzedneX == 1 && wspolrzedneYRuchu == wspolrzedneY)
            {

                this.pierwszyRuch = true;
                return true;
            }

        }
        // Zbicie innej figury, ruch do przodu o jedno pole
        else if (gracz ==1 && szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu) != null)
        {


            if ( wspolrzedneXRuchu - wspolrzedneX == 1 && (wspolrzedneYRuchu-wspolrzedneY== 1  || wspolrzedneYRuchu-wspolrzedneY== -1 ) && kukla.gracz ==0)
            {

                this.pierwszyRuch = true;
                return true;
            }

        }
        // Ruch figurami bialymi

        if(gracz ==0 && szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu) == null )
        {
            // Ruch o przodu o 2 pola, tylko gdy jest to pierwszy ruch, oraz przed figura nic nie stoi
            if(wspolrzedneXRuchu - wspolrzedneX == -2 && wspolrzedneYRuchu == wspolrzedneY && !pierwszyRuch && szachownica.sprawdzFigure(wspolrzedneXRuchu-1,wspolrzedneYRuchu) == null )
            {
                this.pierwszyRuch = true;
                return true;
            }
            // zwykly ruch do przodu
            else if(wspolrzedneXRuchu - wspolrzedneX == -1 && wspolrzedneYRuchu == wspolrzedneY)
            {

                this.pierwszyRuch = true;
                return true;
            }

        }
        // Zbicie innej figury, ruch do przodu o jedno pole
        else if (gracz ==0 && szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu) != null)
        {


            if ( wspolrzedneXRuchu - wspolrzedneX == -1 && (wspolrzedneYRuchu-wspolrzedneY== 1  || wspolrzedneYRuchu-wspolrzedneY== -1 ) && kukla.gracz ==1)
            {

                this.pierwszyRuch = true;
                return true;
            }

        }

        return false;
    }



}


    class Wieza extends Figura {



        public Wieza(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
            super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);


        }
    }

class Skoczek extends Figura {



    public Skoczek(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

}
}

class Goniec extends Figura{


    public Goniec(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor,  int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }
}

class Hetman extends Figura{


    public Hetman(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }

}


class Krol extends Figura {


    public Krol(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }

}







