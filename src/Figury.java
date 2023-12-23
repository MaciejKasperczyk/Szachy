 class Figura {
public  static final int kolorCzarny = 0;
public  static  final int kolorBialy = 1;

public int wspolrzedneX;
public int wspolrzedneY;

public boolean czyZbity;

private String kolor;

public Szachownica szachownica;
public int gracz;






public Figura(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz)
{
    this.szachownica = szachownica;
    this.wspolrzedneX = wspolrzedneX;
    this.wspolrzedneY = wspolrzedneY;
    this.kolor = kolor;
    this.czyZbity = czyZbity;
    this.gracz = gracz;





}























}
class Pionek extends Figura {


    String litera = "P";



    // Konstruktor klasy Pionek
    public Pionek(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,czyZbity,gracz);
    }
    public boolean mozliwyRuch(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz)
    {

        return true;
    }


}


    class Wieza extends Figura {
        String litera = "W";


        public Wieza(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz) {
            super(szachownica,wspolrzedneX,wspolrzedneY,kolor,czyZbity,gracz);


        }
    }

class Skoczek extends Figura {

    String litera = "S";


    public Skoczek(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,czyZbity,gracz);

}
}

class Goniec extends Figura{
    String litera = "G";


    public Goniec(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,czyZbity,gracz);

    }
}

class Hetman extends Figura{
    String litera = "H";


    public Hetman(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,czyZbity,gracz);

    }

}


class Krol extends Figura {

    String litera = "K";


    public Krol(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, String kolor, boolean czyZbity, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,czyZbity,gracz);

    }

}







