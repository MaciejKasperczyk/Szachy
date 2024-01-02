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