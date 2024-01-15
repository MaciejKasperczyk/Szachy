import java.util.Scanner;

class Pionek extends Figura {

    Scanner wybor = new Scanner(System.in);


    // Pionek dziedziczy
    public Pionek(Szachownica szachownica, int wspolrzedneX, int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica, wspolrzedneX, wspolrzedneY, kolor, gracz);
    }

    public String toString() {
        return "Pionek";
    }

    public boolean mozliwyRuch(int wspolrzedneXRuchu, int wspolrzedneYRuchu) {
        int ruch;
        int podwojnyRuch;
        if (this.gracz == 1) {
            ruch = -1;
            podwojnyRuch = -2;


        } else {
            ruch = 1;
            podwojnyRuch = 2;

        }


        Figura kukla = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);
        if (szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu) == null) {

            if (wspolrzedneXRuchu - wspolrzedneX == podwojnyRuch && wspolrzedneYRuchu == wspolrzedneY && !pierwszyRuch && szachownica.sprawdzFigure(wspolrzedneXRuchu - 1, wspolrzedneYRuchu) == null) {
                this.pierwszyRuch = true;
                return true;

            } else if (wspolrzedneXRuchu - wspolrzedneX == ruch && wspolrzedneYRuchu == wspolrzedneY) {

                this.pierwszyRuch = true;

                return true;
            }

        }
        // Zbicie innej figury, ruch do przodu o jedno pole
        else if (kukla.gracz != this.gracz && szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu) != null) {


            if (wspolrzedneXRuchu - wspolrzedneX == ruch && (wspolrzedneYRuchu - wspolrzedneY == 1 || wspolrzedneYRuchu - wspolrzedneY == -1) && kukla.gracz != this.gracz) {

                this.pierwszyRuch = true;

                return true;
            }


            return false;

        }

        return false;


    }



}