
import java.util.Scanner;
import static java.lang.System.in;

public class Gra {


        boolean statusGry = true;
    public Gra(Szachownica szachownica1) {

            //Stworzenie Szachownicy


// Deklaracja wszystkich figur, po kolei (na tym etapie optymalizacji wszystkie figury recznie)
            Pionek pio1 = new Pionek(szachownica1, 1, 0, "czarny", true,0);
            Pionek pio2 = new Pionek(szachownica1, 1, 1, "czarny", true,0);
            Pionek pio3 = new Pionek(szachownica1, 1, 2, "czarny", true,0);
            Pionek pio4 = new Pionek(szachownica1, 1, 3, "czarny", true,0);
            Pionek pio5 = new Pionek(szachownica1, 1, 4, "czarny", true,0);
            Pionek pio6 = new Pionek(szachownica1, 1, 5, "czarny", true,0);
            Pionek pio7 = new Pionek(szachownica1, 1, 6, "czarny", true,0);
            Pionek pio8 = new Pionek(szachownica1, 1, 7, "czarny", true,0);
            Pionek pio9 = new Pionek(szachownica1, 6, 0, "bialy", true,1);
            Pionek pio10 = new Pionek(szachownica1, 6, 1, "bialy", true,1);
            Pionek pio11 = new Pionek(szachownica1, 6, 2, "bialy", true,1);
            Pionek pio12 = new Pionek(szachownica1, 6, 3, "bialy", true,1);
            Pionek pio13 = new Pionek(szachownica1, 6, 4, "bialy", true,1);
            Pionek pio14 = new Pionek(szachownica1, 6, 5, "bialy", true,1);
            Pionek pio15 = new Pionek(szachownica1, 6, 6, "bialy", true,1);
            Pionek pio16 = new Pionek(szachownica1, 6, 7, "bialy", true,1);
            Wieza wieza1 = new Wieza(szachownica1,0, 0, "czarny", true,0);
            Wieza wieza2 = new Wieza(szachownica1,0, 7, "czarny", true,0);
            Wieza wieza3 = new Wieza(szachownica1,7, 0, "bialy", true,1);
            Wieza wieza4 = new Wieza(szachownica1,7, 7, "bialy", true,1);
            Skoczek skoczek1 = new Skoczek(szachownica1,0, 1, "czarny", true,0);
            Skoczek skoczek2 = new Skoczek(szachownica1,0, 6, "czarny", true,0);
            Skoczek skoczek3 = new Skoczek(szachownica1,7, 1, "bialy", true,1);
            Skoczek skoczek4 = new Skoczek(szachownica1,7, 6, "bialy", true,1);
            Goniec goniec1 = new Goniec(szachownica1,0, 2, "czarny", true,0);
            Goniec goniec2 = new Goniec(szachownica1,0, 5, "czarny", true,0);
            Goniec goniec3 = new Goniec(szachownica1,7, 2, "bialy", true,1);
            Goniec goniec4 = new Goniec(szachownica1,7, 5, "bialy", true,1);
            Hetman hetman1 = new Hetman(szachownica1,0, 3, "czarny", true,0);
            Hetman hetman2 = new Hetman(szachownica1,7, 3, "bialy", true,1);
            Krol krol1 = new Krol(szachownica1,0, 4, "czarny", true,0);
            Krol krol2 = new Krol(szachownica1,7, 4, "bialy", true,1);


            // Reczne rozstawienie pionkow na podstawie ich współrzednych
            Szachownica.szachownicaUmiescFigure(pio1.wspolrzedneX, pio1.wspolrzedneY, pio1.litera);
            Szachownica.szachownicaUmiescFigure(pio2.wspolrzedneX, pio2.wspolrzedneY, pio2.litera);
            Szachownica.szachownicaUmiescFigure(pio3.wspolrzedneX, pio3.wspolrzedneY, pio3.litera);
            Szachownica.szachownicaUmiescFigure(pio4.wspolrzedneX, pio4.wspolrzedneY, pio4.litera);
            Szachownica.szachownicaUmiescFigure(pio5.wspolrzedneX, pio5.wspolrzedneY, pio5.litera);
            Szachownica.szachownicaUmiescFigure(pio6.wspolrzedneX, pio6.wspolrzedneY, pio6.litera);
            Szachownica.szachownicaUmiescFigure(pio7.wspolrzedneX, pio7.wspolrzedneY, pio7.litera);
            Szachownica.szachownicaUmiescFigure(pio8.wspolrzedneX, pio8.wspolrzedneY, pio8.litera);
            Szachownica.szachownicaUmiescFigure(pio9.wspolrzedneX, pio9.wspolrzedneY, pio9.litera);
            Szachownica.szachownicaUmiescFigure(pio10.wspolrzedneX, pio10.wspolrzedneY, pio10.litera);
            Szachownica.szachownicaUmiescFigure(pio11.wspolrzedneX, pio11.wspolrzedneY, pio11.litera);
            Szachownica.szachownicaUmiescFigure(pio12.wspolrzedneX, pio12.wspolrzedneY, pio12.litera);
            Szachownica.szachownicaUmiescFigure(pio13.wspolrzedneX, pio13.wspolrzedneY, pio13.litera);
            Szachownica.szachownicaUmiescFigure(pio14.wspolrzedneX, pio14.wspolrzedneY, pio14.litera);
            Szachownica.szachownicaUmiescFigure(pio15.wspolrzedneX, pio15.wspolrzedneY, pio15.litera);
            Szachownica.szachownicaUmiescFigure(pio16.wspolrzedneX, pio16.wspolrzedneY, pio16.litera);
            Szachownica.szachownicaUmiescFigure(wieza1.wspolrzedneX, wieza1.wspolrzedneY, wieza1.litera);
            Szachownica.szachownicaUmiescFigure(wieza2.wspolrzedneX, wieza2.wspolrzedneY, wieza2.litera);
            Szachownica.szachownicaUmiescFigure(wieza3.wspolrzedneX, wieza3.wspolrzedneY, wieza3.litera);
            Szachownica.szachownicaUmiescFigure(wieza4.wspolrzedneX, wieza4.wspolrzedneY, wieza4.litera);
            Szachownica.szachownicaUmiescFigure(skoczek1.wspolrzedneX, skoczek1.wspolrzedneY, skoczek1.litera);
            Szachownica.szachownicaUmiescFigure(skoczek2.wspolrzedneX, skoczek2.wspolrzedneY, skoczek2.litera);
            Szachownica.szachownicaUmiescFigure(skoczek3.wspolrzedneX, skoczek3.wspolrzedneY, skoczek3.litera);
            Szachownica.szachownicaUmiescFigure(skoczek4.wspolrzedneX, skoczek4.wspolrzedneY, skoczek4.litera);
            Szachownica.szachownicaUmiescFigure(goniec1.wspolrzedneX, goniec1.wspolrzedneY, goniec1.litera);
            Szachownica.szachownicaUmiescFigure(goniec2.wspolrzedneX, goniec2.wspolrzedneY, goniec2.litera);
            Szachownica.szachownicaUmiescFigure(goniec3.wspolrzedneX, goniec3.wspolrzedneY, goniec3.litera);
            Szachownica.szachownicaUmiescFigure(goniec4.wspolrzedneX, goniec4.wspolrzedneY, goniec4.litera);
            Szachownica.szachownicaUmiescFigure(hetman1.wspolrzedneX, hetman1.wspolrzedneY, hetman1.litera);
            Szachownica.szachownicaUmiescFigure(hetman2.wspolrzedneX, hetman2.wspolrzedneY, hetman2.litera);
            Szachownica.szachownicaUmiescFigure(krol1.wspolrzedneX, krol1.wspolrzedneY, krol1.litera);
            Szachownica.szachownicaUmiescFigure(krol2.wspolrzedneX, krol2.wspolrzedneY, krol2.litera);

            // ruchGracza(szachownica1);
    }








            public static void rozgrywka(Szachownica szachownica1)
            {
                    boolean koniecGry = false;
                    while(!koniecGry)
                    {
                            Szachownica.szachownicaWyswietl();
                            Scanner scan = new Scanner(System.in);
                            try{
                                    System.out.println("Podaj wspolrzedna X figury, ktora chcesz ruszyc");
                                    int wyborXGracza = scan.nextInt();
                                    System.out.println("Podaj wspolrzedna Y figury, ktora chcesz ruszyc");
                                    int wyborYGracza = scan.nextInt();
                                    System.out.println("Podaj wspolrzedna X,na ktrora chcesz poruszyc figure");
                                    int ruchXGracza = scan.nextInt();
                                    System.out.println("Podaj wspolrzedna Y figury,na ktrora chcesz poruszyc figure");
                                    int ruchYGracza = scan.nextInt();



                                    String figuraWybranaPrzezGracza= szachownica1.sprawdzFigure(wyborXGracza, wyborYGracza);
                                    System.out.println(figuraWybranaPrzezGracza);

                                    szachownica1.ruch(wyborXGracza,wyborYGracza,ruchXGracza,ruchYGracza);


                            }
                            catch (ArrayIndexOutOfBoundsException e)
                            {
                                    System.out.println("Blad!!! , \n Podaj wartosci z zakresu od 0-7")    ;
                            }



                            Szachownica.szachownicaWyswietl();
                    }

            }





    /*
    public static void ruchGracza(Szachownica szachownica)
    {
            int figuraX = Integer.parseInt(in.nextLine());
            int figuraY = Integer.parseInt(in.nextLine());
            int ruchX   = Integer.parseInt(in.nextLine());
            int ruchY   = Integer.parseInt(in.nextLine());
            szachownica.ruch(figuraX,figuraY,ruchX,ruchY);

    }
    */






        }