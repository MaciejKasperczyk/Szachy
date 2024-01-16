
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gra {
        private Szachownica szachownica;
        private int aktualnyGracz;

        Scanner wybor = new Scanner(System.in);



        public Gra() {
                this.szachownica = new Szachownica(8, 8);



                Pionek bialyPionek1 = new Pionek(szachownica, 6, 0, Kolor.BIALY, 1);
                Pionek bialyPionek2 = new Pionek(szachownica, 6, 1, Kolor.BIALY,  1);
                Pionek bialyPionek3 = new Pionek(szachownica, 6, 2, Kolor.BIALY,  1);
                Pionek bialyPionek4 = new Pionek(szachownica, 6, 3, Kolor.BIALY,  1);
                Pionek bialyPionek5 = new Pionek(szachownica, 6, 4, Kolor.BIALY,  1);
                Pionek bialyPionek6 = new Pionek(szachownica, 6, 5, Kolor.BIALY,  1);
                Pionek bialyPionek7 = new Pionek(szachownica, 6, 6, Kolor.BIALY, 1);
                Pionek bialyPionek8 = new Pionek(szachownica, 6, 7, Kolor.BIALY, 1);
                Skoczek bialySkoczek1= new Skoczek(szachownica,7,1,Kolor.BIALY,1);
                Skoczek bialySkoczek2= new Skoczek(szachownica,7,6,Kolor.BIALY,1);
                Goniec bialyGoniec1 = new Goniec(szachownica,7,2,Kolor.BIALY,1);
                Goniec bialyGoniec2 = new Goniec(szachownica,7,5,Kolor.BIALY,1);
                Wieza bialaWieza1 = new Wieza(szachownica,7,0,Kolor.BIALY,1);
                Wieza bialaWieza2 = new Wieza(szachownica,7,7,Kolor.BIALY,1);
                Krol bialyKrol = new Krol(szachownica,7,4,Kolor.BIALY,1);
                Hetman bialyHetman = new Hetman(szachownica,7,3,Kolor.CZARNY,1);


                Pionek czarnyPionek1 = new Pionek(szachownica, 1, 0, Kolor.CZARNY, 0);
                Pionek czarnyPionek2 = new Pionek(szachownica, 1, 1, Kolor.CZARNY, 0);
                Pionek czarnyPionek3 = new Pionek(szachownica, 1, 2, Kolor.CZARNY, 0);
                Pionek czarnyPionek4 = new Pionek(szachownica, 1, 3, Kolor.CZARNY, 0);
                Pionek czarnyPionek5 = new Pionek(szachownica, 1, 4, Kolor.CZARNY, 0);
                Pionek czarnyPionek6 = new Pionek(szachownica, 1, 5, Kolor.CZARNY, 0);
                Pionek czarnyPionek7 = new Pionek(szachownica, 1, 6, Kolor.CZARNY, 0);
                Pionek czarnyPionek8 = new Pionek(szachownica, 1, 7, Kolor.CZARNY, 0);
                Skoczek czarnySkoczek1= new Skoczek(szachownica,0,1,Kolor.CZARNY,0);
                Skoczek czarnySkoczek2= new Skoczek(szachownica,0,6,Kolor.CZARNY,0);
                Goniec czarnyGoniec1 = new Goniec(szachownica,0,2,Kolor.CZARNY,0);
                Goniec czarnyGoniec2 = new Goniec(szachownica,0,5,Kolor.CZARNY,0);
                Wieza czarnaWieza1 = new Wieza(szachownica,0,0,Kolor.CZARNY,0);
                Wieza czarnaWieza2 = new Wieza(szachownica,0,7,Kolor.CZARNY,0);
                Hetman czarnyHetman = new Hetman(szachownica,0,3,Kolor.CZARNY,0);
                Krol czarnyKrol = new Krol(szachownica,0,4,Kolor.CZARNY,0);




        }



        public void rozgrywka() {
                boolean koniecGry = false;


                aktualnyGracz = 1;
                String ruchBiałych = "Ruch gracza białych figur, ";
                String ruchCzarnych = "Ruch gracza czarnych figur, ";



                while (!koniecGry) {
                        szachownica.szachownicaWyswietl();
                        // ---- PAT ----
                        if(czyPat(0) && czyPat(1) ) System.out.println("Pat, koniec gry!");

                        else {
                        if(aktualnyGracz==1)System.out.println(ruchBiałych + "Wpisz [A-H] a nastepnie [1-8] pola, na które chcesz ruszyć figura: ");
                        else System.out.println(ruchCzarnych+"Wpisz [A-H] a nastepnie [1-8] pola, na które chcesz ruszyć figura: ");

                        try{
                                String wybranaWspolrzednaYZnak = wybor.next();
                                int wybranaWspolrzednaX = wybor.nextInt()-1;


                        int wybranaWspolrzednaY;
                        // dorobic by nie mozna bylo zbic krola xd

                        switch (wybranaWspolrzednaYZnak) {
                                case "A":
                                        wybranaWspolrzednaY = 0;
                                        break;
                                case "B":
                                        wybranaWspolrzednaY = 1;
                                        break;
                                case "C":
                                        wybranaWspolrzednaY = 2;
                                        break;
                                case "D":
                                        wybranaWspolrzednaY = 3;
                                        break;
                                case "E":
                                        wybranaWspolrzednaY = 4;
                                        break;
                                case "F":
                                        wybranaWspolrzednaY = 5;
                                        break;
                                case "G":
                                        wybranaWspolrzednaY = 6;
                                        break;
                                case "H":
                                        wybranaWspolrzednaY = 7;
                                        break;
                                default:
                                        wybranaWspolrzednaY = 0;
                                        break;
                        }





                        Figura wybranaFigura = szachownica.sprawdzFigure(wybranaWspolrzednaX, wybranaWspolrzednaY);



                        if (wybranaFigura != null && wybranaFigura.zwrocGracza() == aktualnyGracz) {

                                System.out.println("Wybrales: "+ wybranaFigura.toString() );
                                System.out.println("Wpisz [A-H] a nastepnie [1-8] pola, na które chcesz ruszyć figura: ");
                                int nastepnyRuchY;


                                String nastepnyRuchYZnak = wybor.next();
                                switch (nastepnyRuchYZnak) {
                                        case "A":
                                                nastepnyRuchY = 0;
                                                break;
                                        case "B":
                                                nastepnyRuchY = 1;
                                                break;
                                        case "C":
                                                nastepnyRuchY =2;
                                                break;
                                        case "D":
                                                nastepnyRuchY = 3;
                                                break;
                                        case "E":
                                                nastepnyRuchY = 4;
                                                break;
                                        case "F":
                                                nastepnyRuchY = 5;
                                                break;
                                        case "G":
                                                nastepnyRuchY = 6;
                                                break;
                                        case "H":
                                                nastepnyRuchY =7;
                                                break;
                                        default:
                                                nastepnyRuchY = 0;
                                                break;
                                }
                                        int nastepnyRuchX = wybor.nextInt() - 1;


                                int gracz = wybranaFigura.gracz;

                                // Sprawdzenie
                                Figura kukla = szachownica.sprawdzFigure(nastepnyRuchX,nastepnyRuchY);


                                if(!(kukla instanceof Krol) || kukla == null) {


                                        // ---- ROSZADA ----
                                        if (wybranaFigura instanceof Krol && kukla instanceof Wieza) {
                                                roszada(wybranaFigura, kukla, szachownica, gracz);
                                                // zamiana gracza
                                                switch (aktualnyGracz) {
                                                        case 1:
                                                                aktualnyGracz = 0;
                                                                break;
                                                        case 0:
                                                                aktualnyGracz = 1;
                                                                break;
                                                        default:
                                                                break;
                                                }

                                        }

                                        // ---- RUCH W MIEJSCU ----
                                        else if (wybranaFigura.zwrocX() == nastepnyRuchX && wybranaFigura.zwrocY() == nastepnyRuchY)
                                                System.out.println("Nie mozesz poruszyc sie w miejscu!");


                                                // ----  KRÓL NA SZACHOWANE POLE ----
                                        else if (wybranaFigura instanceof Krol && czyPoleJestSzachowane(nastepnyRuchX, nastepnyRuchY, przeciwnyGracz(aktualnyGracz)))
                                                System.out.println("Nie możesz przenieść króla na szachowane pole.");


                                                // ----  FIGURA JEST W STANIE WYKONAĆ RUCH ----
                                        else if (wybranaFigura.mozliwyRuch(nastepnyRuchX, nastepnyRuchY)) {

                                                // ---- PIONEK MOZE ZMIENIC SIE W INNA FIGURE ----
                                                if (wybranaFigura instanceof Pionek && (nastepnyRuchX == 0 || nastepnyRuchX == 7)) {
                                                        zmienPionkaNaInnaFigure(wybranaFigura, szachownica, nastepnyRuchX, nastepnyRuchY, wybor);
                                                        // zamiana gracza
                                                        switch (aktualnyGracz) {
                                                                case 1:
                                                                        aktualnyGracz = 0;
                                                                        break;
                                                                case 0:
                                                                        aktualnyGracz = 1;
                                                                        break;
                                                                default:
                                                                        break;
                                                        }
                                                }


                                                // ---- ZADNE Z POWYZSZYCH A RUCH MOZLIWY ----
                                                else {
                                                        boolean bialyKrolWSzachu = false;
                                                        boolean czarnyKrolWSzachu = false;

                                                        wybranaFigura.zapiszRuchDoPliku(wybranaWspolrzednaX,wybranaWspolrzednaYZnak,nastepnyRuchX,nastepnyRuchYZnak,1);
                                                        wybranaFigura.ruchFigura(nastepnyRuchX, nastepnyRuchY);


                                                        // zamiana gracza
                                                        switch (aktualnyGracz) {
                                                                case 1:
                                                                        aktualnyGracz = 0;
                                                                        break;
                                                                case 0:
                                                                        aktualnyGracz = 1;
                                                                        break;
                                                                default:
                                                                        break;
                                                        }


                                                        // SPRAWDZENIE SZACHU
                                                        for (Figura figura : szachownica.getFigury()) {
                                                                if (figura instanceof Krol) {
                                                                        if (figura.zwrocKolor() == Kolor.BIALY && figura.czySzach()) {
                                                                                bialyKrolWSzachu = true;
                                                                        } else if (figura.zwrocKolor() == Kolor.CZARNY && figura.czySzach()) {
                                                                                czarnyKrolWSzachu = true;
                                                                        }
                                                                }
                                                        }
                                                        if (bialyKrolWSzachu) {
                                                                System.out.println("Biały król jest w szachu!");
                                                                if (czySzachMat(aktualnyGracz)) {
                                                                        System.out.println("Szach-mat! Gracz " + (aktualnyGracz == 1 ? "czarnych" : "białych") + " wygrywa.");
                                                                        koniecGry = true;
                                                                }
                                                        }
                                                        if (czarnyKrolWSzachu) {
                                                                System.out.println("Czarny król jest w szachu!");
                                                                if (czySzachMat(aktualnyGracz)) {
                                                                        System.out.println("Szach-mat! Gracz " + (aktualnyGracz == 1 ? "czarnych" : "białych") + " wygrywa.");
                                                                        koniecGry = true;
                                                                }


                                                        }
                                                }


                                        }
                                }


                                else {
                                        System.out.println("Nieprawidlowy ruch, sprobuj ponownie!");
                                }
                        } else {
                                System.out.println("Wybrane pole jest puste lub próbujesz ruszyć figure gracza!");
                        }}
                        // ---- WYJATKI ----
                        catch (InputMismatchException e) {
                                System.out.println("Wprowadzono nieprawidłowe dane. Proszę wpisać liczby całkowite.");
                                wybor.next(); // Czyści błędne dane wejściowe
                        } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Wprowadzono współrzędne poza zakresem. Proszę spróbować ponownie.");
                        } catch (Exception e) {
                                System.out.println("Wystąpił błąd: " + e.getMessage());
                        }
                }
                                }
        }





        public void roszada(Figura wybranaFigura, Figura kukla, Szachownica szachownica, int aktualnyGracz) {
                // Obliczenia

                int stareWspolrzedneXKrola = wybranaFigura.zwrocX();
                int stareWspolrzedneXWiezy = kukla.zwrocX();
                int stareWspolrzedneYWiezy = kukla.zwrocY();
                boolean czyWiezaSieRuszyla = kukla.pierwszyRuch;
                boolean czyKrolSieRuszyl = wybranaFigura.pierwszyRuch;
                Kolor kolor = wybranaFigura.zwrocKolor();

                int noweWspolrzedneWiezyY, noweWspolrzedneKrolaY;
                if (!czyKrolSieRuszyl && !czyWiezaSieRuszyla) {
                        if (stareWspolrzedneYWiezy == 0) {
                                noweWspolrzedneWiezyY = 2;
                                noweWspolrzedneKrolaY = 1;
                        } else {
                                noweWspolrzedneKrolaY = 6;
                                noweWspolrzedneWiezyY = 5;
                        }

                        // Usuwanie starych pionków
                        wybranaFigura.usunPionek();
                        kukla.usunPionek();
                        new Krol(szachownica, stareWspolrzedneXKrola, noweWspolrzedneKrolaY, kolor, aktualnyGracz);
                        new Wieza(szachownica, stareWspolrzedneXWiezy, noweWspolrzedneWiezyY, kolor,aktualnyGracz);
                        Figura kukla2 = szachownica.sprawdzFigure(stareWspolrzedneXKrola, noweWspolrzedneKrolaY);
                        Figura kukla3 = szachownica.sprawdzFigure(stareWspolrzedneXWiezy, noweWspolrzedneWiezyY);
                        kukla2.pierwszyRuch = true;
                        kukla3.pierwszyRuch = true;
                        System.out.println("Roszada");


                }
        }


        public void zmienPionkaNaInnaFigure(Figura wybranaFigura, Szachownica szachownica, int nastepnyRuchX, int nastepnyRuchY, Scanner wybor) {
                        int staryGracz = wybranaFigura.gracz;

                        wybranaFigura.usunPionek();
                        System.out.println("Wybierz figure, na jaką chcesz zmienić Pionka: \n 1) Skoczek \n 2) Goniec \n 3) Wieza \n 4) Hetman");
                        int wybor1 = wybor.nextInt();
                        Kolor kolor = (nastepnyRuchX == 0) ? Kolor.BIALY : Kolor.CZARNY;

                        switch (wybor1) {
                                case 1:
                                        new Skoczek(szachownica, nastepnyRuchX, nastepnyRuchY, kolor, staryGracz);
                                        break;
                                case 2:
                                        new Goniec(szachownica, nastepnyRuchX, nastepnyRuchY, kolor, staryGracz);
                                        break;
                                case 3:
                                        new Wieza(szachownica, nastepnyRuchX, nastepnyRuchY, kolor, staryGracz);
                                        break;
                                case 4:
                                        new Hetman(szachownica, nastepnyRuchX, nastepnyRuchY, kolor, staryGracz);
                                        break;
                                default:
                                        break;
                        }






        }
        public boolean czyPat(int gracz)
        {
                if(czySzach(gracz)) return false;
                for (Figura figura : szachownica.getFigury()) {
                        if (figura != null && figura.zwrocGracza() == gracz) {
                                for (int x = 0; x < szachownica.zwrocDlugoscX(); x++) {
                                        for (int y = 0; y < szachownica.zwrocDlugoscY(); y++) {
                                                if (figura.mozliwyRuch(x, y)) {
                                                        // Sprawdź, czy ruch nie spowoduje szachu dla własnego króla
                                                        if (!czyRuchPowodujeSzach(figura, x, y, gracz)) {

                                                                return false; // Istnieje legalny ruch, nie ma pata.
                                                        }
                                                }
                                        }
                                }
                        }
                }

                return true; // Żaden ruch nie jest możliwy, jest pat.


                
        }
        private boolean czyRuchPowodujeSzach(Figura figura, int noweX, int noweY, int gracz) {
                // Zapisz stan szachownicy
                Figura temp = szachownica.sprawdzFigure(noweX, noweY);
                int stareX = figura.zwrocX();
                int stareY = figura.zwrocY();

                // Wykonaj tymczasowy ruch
                szachownica.szachownicaUmiescFigure(null, stareX, stareY);
                szachownica.szachownicaUmiescFigure(figura, noweX, noweY);
                // Sprawdź, czy po tym ruchu król aktualnego gracza jest w szachu
                boolean wynik = czySzach(gracz);

// Cofnij ruch
                szachownica.szachownicaUmiescFigure(figura, stareX, stareY);
                szachownica.szachownicaUmiescFigure(temp, noweX, noweY);

                return wynik;
        }






                public boolean czySzachMat(int gracz) {
                if (!czySzach(gracz)) {
                        return false; // Jeśli nie ma szachu, na pewno nie ma szach-matu.

                }

                // Sprawdź wszystkie figury gracza, czy którykolwiek ruch jest możliwy.
                for (Figura figura : szachownica.getFigury()) {
                        if (figura.zwrocGracza() == gracz) {
                                for (int x = 0; x < szachownica.zwrocDlugoscX(); x++) {
                                        for (int y = 0; y < szachownica.zwrocDlugoscY(); y++) {
                                                if (figura.mozliwyRuch(x, y)) {

                                                        // Spróbuj wykonać ruch i sprawdź, czy nadal jest szach.
                                                        Figura temp = szachownica.sprawdzFigure(x, y); // Zapisz figurę, która może być zbiciem.
                                                        int orgX = figura.zwrocX();
                                                        int orgY = figura.zwrocY();
                                                        szachownica.szachownicaUmiescFigure(null, orgX, orgY); // Usuń figurę z jej obecnej pozycji.
                                                        szachownica.szachownicaUmiescFigure(figura, x, y); // Umieść figurę na nowej pozycji.

                                                        if (!czySzach(gracz)) {


                                                                // Cofnij ruch.
                                                                szachownica.szachownicaUmiescFigure(figura, orgX, orgY);
                                                                szachownica.szachownicaUmiescFigure(temp, x, y);
                                                                return false; // Jest legalny ruch, który zapobiega szach-matowi.
                                                        }

                                                        // Cofnij ruch.

                                                        szachownica.szachownicaUmiescFigure(figura, orgX, orgY);
                                                        szachownica.szachownicaUmiescFigure(temp, x, y);
                                                }
                                        }
                                }
                        }
                }

                return true;
        }
        public boolean czySzach(int gracz) {

                // Znajdź pozycję króla gracza
                int krolX = -1, krolY = -1;
                for (int x = 0; x < szachownica.zwrocDlugoscX(); x++) {
                        for (int y = 0; y < szachownica.zwrocDlugoscY(); y++) {
                                Figura figura = szachownica.sprawdzFigure(x, y);
                                if (figura != null && figura instanceof Krol && figura.zwrocGracza() == gracz) {
                                        krolX = x;
                                        krolY = y;


                                }
                        }
                }

                // Sprawdź, czy którykolwiek z pionków przeciwnika może zaatakować króla
                for (int x = 0; x < szachownica.zwrocDlugoscX(); x++) {
                        for (int y = 0; y < szachownica.zwrocDlugoscY(); y++) {
                                Figura atakujacaFigura = szachownica.sprawdzFigure(x, y);
                                if (atakujacaFigura != null && atakujacaFigura.zwrocGracza() != gracz) {
                                        if (atakujacaFigura.mozliwyRuch(krolX, krolY)) {


                                                return true; // Król jest w szachu

                                        }
                                }
                        }
                }

                return false; // Król nie jest w szachu
        }
        private boolean czyPoleJestSzachowane(int x, int y, int graczPrzeciwnika) {
                for (Figura figura : szachownica.getFigury()) {
                        if (figura != null && figura.zwrocGracza() == graczPrzeciwnika) {
                                // Sprawdź, czy figura może zaatakować dane pole
                                if (figura.mozliwyRuch(x, y)) {
                                        // Dodatkowa weryfikacja dla hetmana, aby upewnić się, że nie "przeskakuje" przez inne figury
                                        if (figura instanceof Hetman)
                                        {
                                                int deltaX = Integer.compare(x, figura.zwrocX());
                                                int deltaY = Integer.compare(y, figura.zwrocY());
                                                int testX = figura.zwrocX() + deltaX;
                                                int testY = figura.zwrocY() + deltaY;
                                                while (testX != x || testY != y) {
                                                        if (szachownica.sprawdzFigure(testX, testY) != null) {
                                                                break; // Jest inna figura na drodze hetmana
                                                        }
                                                        testX += deltaX;
                                                        testY += deltaY;
                                                }
                                                if (testX == x && testY == y) {
                                                        return true; // Hetman szachuje pole
                                                }
                                        }


                                        else {
                                                return true; // Inna figura szachuje pole
                                        }
                                }
                        }
                }
                return false; // Pole nie jest szachowane
        }

        public int przeciwnyGracz(int aktualnyGracz) {
                return (aktualnyGracz == 1) ? 0 : 1;
        }



        }
