

class Pionek extends Figura {


public boolean czyEnPassant = false;
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
        Figura figuraObok = szachownica.sprawdzFigure(wspolrzedneX, wspolrzedneYRuchu);

        if (figuraObok instanceof Pionek && figuraObok.gracz != this.gracz && figuraObok.pierwszyRuch && wspolrzedneXRuchu - wspolrzedneX == ruch && Math.abs(wspolrzedneYRuchu - wspolrzedneY) == 1 && ((Pionek) figuraObok).czyEnPassant) {
            System.out.println("En passant");
            szachownica.usunPionkaZPlanszy(figuraObok);
            return true;
        } else {
            if (szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu) == null) {

                if (wspolrzedneXRuchu - wspolrzedneX == podwojnyRuch && wspolrzedneYRuchu == wspolrzedneY && !pierwszyRuch && szachownica.sprawdzFigure(wspolrzedneXRuchu - 1, wspolrzedneYRuchu) == null) {
                    this.pierwszyRuch = true;
                    this.czyEnPassant = true;
                    return true;

                } else if (wspolrzedneXRuchu - wspolrzedneX == ruch && wspolrzedneYRuchu == wspolrzedneY) {

                    this.pierwszyRuch = true;
                    this.czyEnPassant = false;
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


}