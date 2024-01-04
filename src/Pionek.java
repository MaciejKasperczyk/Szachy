import java.util.Scanner;

class Pionek extends Figura {

    Scanner wybor = new Scanner(System.in);
    int wyborNowejFigury;


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
        int ostatniRzad;
        if (this.gracz == 1) {
            ruch = -1;
            podwojnyRuch = -2;
            ostatniRzad = 0;


        } else {
            ruch = 1;
            podwojnyRuch = 2;
            ostatniRzad =7;

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

    public void zmianaPionka(int x, int y) {
        System.out.println("Wybierz figure, na jaką chcesz zmienić Pionka: \n 1) Skoczek \n 2) Goniec \n 3) Wieza \n 4) Hetman");
        wyborNowejFigury = wybor.nextInt();

        // Usuń pionka z planszy

        Figura nowaFigura = null; // Dodajemy deklarację zmiennej


        // Tworzenie nowej figury w zależności od wyboru
        switch (wyborNowejFigury) {
            case 1:
                new Skoczek(szachownica, x, y, this.zwrocKolor(), this.zwrocGracza());
                break;
            case 2:
                new Goniec(szachownica, x, y, this.zwrocKolor(), this.zwrocGracza());
                break;
            case 3:
                new Wieza(szachownica, x, y, this.zwrocKolor(), this.zwrocGracza());
                break;
            case 4:
                new Hetman(szachownica, x, y, this.zwrocKolor(), this.zwrocGracza());
                break;
            default:
                // Opcjonalnie: obsługa nieprawidłowego wyboru
        }
        // Usuń pionka z planszy
        szachownica.usunPionkaZPlanszy(this);

        // Dodaj nową figurę na planszy
        if (nowaFigura != null) {
            szachownica.szachownicaUmiescFigure(nowaFigura, x, y);
            System.out.println(nowaFigura.zwrocX());
        }

        // Umieść nową figurę na planszy na właściwym miejscu



    }
    public boolean czyZmianaPionka()
    {
        if ((this.gracz == 1 && this.wspolrzedneX == 0) || (this.gracz == 0 && this.wspolrzedneX == 7)) {
            return true;
        }
        return false;

    }
}