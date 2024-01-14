
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
                        if(aktualnyGracz==1)System.out.println(ruchBiałych + " Wpisz X a nastepnie Y figury ktorą chcesz ruszyć: ");
                        else System.out.println(ruchCzarnych+" Wpisz X a nastepnie Y figury ktorą chcesz ruszyć: ");


                        int wybranaWspolrzednaX = wybor.nextInt()-1;
                        int wybranaWspolrzednaY = wybor.nextInt()-1;

                        Figura wybranaFigura = szachownica.sprawdzFigure(wybranaWspolrzednaX, wybranaWspolrzednaY);



                        if (wybranaFigura != null && wybranaFigura.zwrocGracza() == aktualnyGracz) {

                                System.out.println("Wybrales: "+ wybranaFigura.toString() );
                                System.out.println("Wpisz X a nastepnie Y pola, na które chcesz ruszyć figura: ");
                                int nastepnyRuchX = wybor.nextInt()-1;
                                int nastepnyRuchY = wybor.nextInt()-1;
                                Figura kukla = szachownica.sprawdzFigure(nastepnyRuchX,nastepnyRuchY);
                                int gracz = wybranaFigura.gracz;

                                if(wybranaFigura instanceof Krol && kukla instanceof Wieza)
                                {
                                        // Obliczenia
                                        int stareWspolrzedneXKrola = wybranaFigura.zwrocX();
                                        int stareWspolrzedneYKrola = wybranaFigura.zwrocY();
                                        int stareWspolrzedneXWiezy = kukla.zwrocX();
                                        int stareWspolrzedneYWiezy = kukla.zwrocY();
                                        boolean czyWiezaSieRuszyla = kukla.pierwszyRuch;
                                        boolean czyKrolSieRuszyl = wybranaFigura.pierwszyRuch;
                                        Kolor kolor = wybranaFigura.zwrocKolor();

                                        int noweWspolrzedneWiezyY,noweWspolrzedneKrolaY;
                                        System.out.println("1");
                                        if(!czyKrolSieRuszyl && !czyWiezaSieRuszyla){

                                        if(stareWspolrzedneYWiezy ==0)
                                        {
                                                noweWspolrzedneWiezyY = 2;
                                                noweWspolrzedneKrolaY = 1;
                                                System.out.println("2");
                                        }
                                        else
                                        {
                                                noweWspolrzedneKrolaY =6;
                                                noweWspolrzedneWiezyY =5;
                                                System.out.println("3");
                                        }

                                        //
                                        System.out.println("4");
                                        wybranaFigura.usunPionek();
                                        kukla.usunPionek();
                                        System.out.println("5");
                                        new Krol(szachownica, stareWspolrzedneXKrola, noweWspolrzedneKrolaY, kolor, gracz);
                                        new Wieza(szachownica, stareWspolrzedneXWiezy, noweWspolrzedneWiezyY, kolor, gracz);
                                                Figura kukla2 = szachownica.sprawdzFigure(stareWspolrzedneXKrola,noweWspolrzedneKrolaY);
                                                Figura kukla3 = szachownica.sprawdzFigure(stareWspolrzedneXWiezy,noweWspolrzedneWiezyY);
                                                kukla2.pierwszyRuch = true;
                                                kukla3.pierwszyRuch = true;
                                        System.out.println("Roszada");


                                        switch (aktualnyGracz){
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

                                }

                                else if (wybranaFigura.zwrocX() ==  nastepnyRuchX && wybranaFigura.zwrocY() == nastepnyRuchY)
                                {
                                        System.out.println("Nie mozesz poruszyc sie w miejscu!");
                                }

                                else if(wybranaFigura instanceof Krol && czyPoleJestSzachowane(nastepnyRuchX, nastepnyRuchY, przeciwnyGracz(aktualnyGracz))) {
                                        System.out.println("Nie możesz przenieść króla na szachowane pole.");
                                        continue;
                                }




                                // sprawdzenie czy Figura moze wykonac ruch
                                else if (wybranaFigura.mozliwyRuch(nastepnyRuchX, nastepnyRuchY)) {


                                        if (wybranaFigura instanceof Pionek && nastepnyRuchX ==0)
                                       {
                                               wybranaFigura.usunPionek();
                                               System.out.println("Wybierz figure, na jaką chcesz zmienić Pionka: \n 1) Skoczek \n 2) Goniec \n 3) Wieza \n 4) Hetman");
                                               int wybor1 = wybor.nextInt(); //
                                               switch (wybor1) {
                                                       case 1:
                                                               new Skoczek(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.BIALY, 1);
                                                               break;
                                                       case 2: new Goniec(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.BIALY, 1);
                                                               break;
                                                       case 3: new Wieza(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.BIALY, 1);
                                                               break;
                                                       case 4: new Hetman(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.BIALY, 1);
                                                               break;
                                                       default:
                                                               break;}





                                               aktualnyGracz = 0;



                                                }
                                        else if(wybranaFigura instanceof Pionek && nastepnyRuchX ==7)
                                        {
                                                wybranaFigura.usunPionek();
                                                System.out.println("Wybierz figure, na jaką chcesz zmienić Pionka: \n 1) Skoczek \n 2) Goniec \n 3) Wieza \n 4) Hetman");
                                                int wybor1 = wybor.nextInt(); //
                                                switch (wybor1) {
                                                        case 1:
                                                                new Skoczek(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.CZARNY, 0);
                                                                break;
                                                        case 2: new Goniec(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.CZARNY, 0);
                                                                break;
                                                        case 3: new Wieza(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.CZARNY, 0);
                                                                break;
                                                        case 4: new Hetman(szachownica, nastepnyRuchX, nastepnyRuchY, Kolor.CZARNY, 0);
                                                                break;
                                                        default:
                                                                break;}
                                                aktualnyGracz = 1;

                                        }

                                       else{
                                        // wykonanie ruchu
                                        wybranaFigura.ruchFigura(nastepnyRuchX, nastepnyRuchY);
                                        System.out.println("10");

                                                // zamiana gracza
                                        switch (aktualnyGracz){
                                                case 1:
                                                        aktualnyGracz = 0;
                                                        break;
                                                case 0:
                                                        aktualnyGracz = 1;
                                                        break;
                                                default:
                                                        break;
                                        }

                                        boolean bialyKrolWSzachu = false;
                                        boolean czarnyKrolWSzachu = false;
                                                System.out.println("11");
                                        for (Figura figura : szachownica.getFigury()) {
                                                if (figura instanceof Krol) {
                                                        System.out.println("12");
                                                        if (figura.zwrocKolor() == Kolor.BIALY && figura.czySzach()) {
                                                                System.out.println("13");
                                                                bialyKrolWSzachu = true;
                                                        } else if (figura.zwrocKolor() == Kolor.CZARNY && figura.czySzach()) {
                                                                System.out.println("14");
                                                                czarnyKrolWSzachu = true;
                                                        }
                                                }
                                        }
                                                System.out.println("15");
                                        if (bialyKrolWSzachu) {
                                                System.out.println("Biały król jest w szachu!");
                                                if (czySzachMat(aktualnyGracz)) {
                                                        System.out.println("16");
                                                        System.out.println("Szach-mat! Gracz " + (aktualnyGracz == 1 ? "czarnych" : "białych") + " wygrywa.");
                                                        koniecGry = true;
                                                }
                                        }
                                        if (czarnyKrolWSzachu) {
                                                System.out.println("Czarny król jest w szachu!");
                                                if (czySzachMat(aktualnyGracz)) {
                                                        System.out.println("19");
                                                        System.out.println("Szach-mat! Gracz " + (aktualnyGracz == 1 ? "czarnych" : "białych") + " wygrywa.");
                                                        koniecGry = true;
                                                }
                                                System.out.println("18");

                                        }}

                                        System.out.println("17");




                                } else {
                                        System.out.println("Nieprawidlowy ruch, sprobuj ponownie!");
                                }
                        } else {
                                System.out.println("Wybrane pole jest puste lub próbujesz ruszyć figure gracza!");
                        }
                }
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
                                                        System.out.println("6");

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
                                                        System.out.println("8");

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
                                        System.out.println("9");


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
                System.out.println("Sprawdzam pole szachowane");
                for (Figura figura : szachownica.getFigury()) {
                        if (figura != null && figura.zwrocGracza() == graczPrzeciwnika) {
                                // Sprawdź, czy figura może zaatakować dane pole
                                if (figura.mozliwyRuch(x, y)) {
                                        // Dodatkowa weryfikacja dla hetmana, aby upewnić się, że nie "przeskakuje" przez inne figury
                                        if (figura instanceof Hetman) {
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
                                        } else {
                                                return true; // Inna figura szachuje pole
                                        }
                                }
                        }
                }
                return false; // Pole nie jest szachowane
        }

        private int przeciwnyGracz(int aktualnyGracz) {
                return (aktualnyGracz == 1) ? 0 : 1;
        }



        }
