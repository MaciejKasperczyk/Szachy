abstract class Figury {

}
class Pionek {

    // Koordynaty by wiedziec gdzie Pionek ma powstać
    int wspolrzedneX;
    int wspolrzedneY;
    String kolor;

    String litera = "P";
    public boolean czyZbity = false;


    // Konstruktor klasy Pionek
    public Pionek(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity) {
        this.wspolrzedneY = wspolrzedneY;
        this.wspolrzedneX = wspolrzedneX;
        this.kolor = kolor;
        this.czyZbity = czyZbity;

    }
}


    class Wieza {
        int wspolrzedneY;
        int wspolrzedneX;
        String kolor;
        String litera = "W";
        public boolean czyZbity = false;


        public Wieza(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity) {
            this.wspolrzedneY = wspolrzedneY;
            this.wspolrzedneX = wspolrzedneX;
            this.kolor = kolor;
            this.czyZbity = czyZbity;

        }

    }

class Skoczek {
    int wspolrzedneY;
    int wspolrzedneX;
    String kolor;
    String litera = "S";
    public boolean czyZbity = false;


    public Skoczek(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity) {
        this.wspolrzedneY = wspolrzedneY;
        this.wspolrzedneX = wspolrzedneX;
        this.kolor = kolor;
        this.czyZbity = czyZbity;

    }

}

class Goniec {
    int wspolrzedneY;
    int wspolrzedneX;
    String kolor;
    String litera = "G";
    public boolean czyZbity = false;


    public Goniec(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity) {
        this.wspolrzedneY = wspolrzedneY;
        this.wspolrzedneX = wspolrzedneX;
        this.kolor = kolor;
        this.czyZbity = czyZbity;

    }

}

class Hetman {
    int wspolrzedneY;
    int wspolrzedneX;
    String kolor;
    String litera = "H";
    public boolean czyZbity = false;


    public Hetman(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity) {
        this.wspolrzedneY = wspolrzedneY;
        this.wspolrzedneX = wspolrzedneX;
        this.kolor = kolor;
        this.czyZbity = czyZbity;

    }

}


class Krol {
    int wspolrzedneY;
    int wspolrzedneX;
    String kolor;
    String litera = "K";
    public boolean czyZbity = false;


    public Krol(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity) {
        this.wspolrzedneY = wspolrzedneY;
        this.wspolrzedneX = wspolrzedneX;
        this.kolor = kolor;
        this.czyZbity = czyZbity;

    }

}





    // Testowa metoda by sprawdzicz czy wszystko sie przypisuje
   /* public void pokazCechy()
    {
        System.out.println(wspolrzedneX);
        System.out.println(wspolrzedneY);
        System.out.println(kolor);
        System.out.println(czyZbity);

    }*/

