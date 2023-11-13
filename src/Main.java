// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Deklaracja wszystkich figur, po kolei (na tym etapie optymalizacji wszystkie figury recznie)
        Pionek pio1 = new Pionek(1, 0, "czarny", true);
        Pionek pio2 = new Pionek(1, 1, "czarny", true);
        Pionek pio3 = new Pionek(1, 2, "czarny", true);
        Pionek pio4 = new Pionek(1, 3, "czarny", true);
        Pionek pio5 = new Pionek(1, 4, "czarny", true);
        Pionek pio6 = new Pionek(1, 5, "czarny", true);
        Pionek pio7 = new Pionek(1, 6, "czarny", true);
        Pionek pio8 = new Pionek(1, 7, "czarny", true);
        Pionek pio9 = new Pionek(6, 0, "bialy", true);
        Pionek pio10 = new Pionek(6, 1, "bialy", true);
        Pionek pio11 = new Pionek(6, 2, "bialy", true);
        Pionek pio12 = new Pionek(6, 3, "bialy", true);
        Pionek pio13 = new Pionek(6, 4, "bialy", true);
        Pionek pio14 = new Pionek(6, 5, "bialy", true);
        Pionek pio15 = new Pionek(6, 6, "bialy", true);
        Pionek pio16 = new Pionek(6, 7, "bialy", true);
        Wieza wieza1 = new Wieza(0, 0, "czarny", true);
        Wieza wieza2 = new Wieza(0, 7, "czarny", true);
        Wieza wieza3 = new Wieza(7, 0, "bialy", true);
        Wieza wieza4 = new Wieza(7, 7, "bialy", true);
        Skoczek skoczek1 = new Skoczek(0,1,"czarny",true);
        Skoczek skoczek2 = new Skoczek(0,6,"czarny",true);
        Skoczek skoczek3 = new Skoczek(7,1,"bialy",true);
        Skoczek skoczek4 = new Skoczek(7,6,"bialy",true);
        Goniec goniec1 = new Goniec( 0,2,"czarny",true);
        Goniec goniec2 = new Goniec( 0,5,"czarny",true);
        Goniec goniec3 = new Goniec( 7,2,"bialy",true);
        Goniec goniec4 = new Goniec( 7,5,"bialy",true);
        Hetman hetman1 = new Hetman(0,3,"czarny", true);
        Hetman hetman2 = new Hetman(7,3,"bialy", true);
        Krol krol1 = new Krol(0,4,"czarny",true);
        Krol krol2 = new Krol(7,4,"bialy",true);


        //Stworzenie Szachownicy
        Szachownica szachownica1 = new Szachownica();

        // Reczne rozstawienie pionkow na podstawie ich współrzednych
        szachownica1.szachownicaUmiescFigure(pio1.wspolrzedneX, pio1.wspolrzedneY, pio1.litera);
        szachownica1.szachownicaUmiescFigure(pio2.wspolrzedneX, pio2.wspolrzedneY, pio2.litera);
        szachownica1.szachownicaUmiescFigure(pio3.wspolrzedneX, pio3.wspolrzedneY, pio3.litera);
        szachownica1.szachownicaUmiescFigure(pio4.wspolrzedneX, pio4.wspolrzedneY, pio4.litera);
        szachownica1.szachownicaUmiescFigure(pio5.wspolrzedneX, pio5.wspolrzedneY, pio5.litera);
        szachownica1.szachownicaUmiescFigure(pio6.wspolrzedneX, pio6.wspolrzedneY, pio6.litera);
        szachownica1.szachownicaUmiescFigure(pio7.wspolrzedneX, pio7.wspolrzedneY, pio7.litera);
        szachownica1.szachownicaUmiescFigure(pio8.wspolrzedneX, pio8.wspolrzedneY, pio8.litera);
        szachownica1.szachownicaUmiescFigure(pio9.wspolrzedneX, pio9.wspolrzedneY, pio9.litera);
        szachownica1.szachownicaUmiescFigure(pio10.wspolrzedneX, pio10.wspolrzedneY, pio10.litera);
        szachownica1.szachownicaUmiescFigure(pio11.wspolrzedneX, pio11.wspolrzedneY, pio11.litera);
        szachownica1.szachownicaUmiescFigure(pio12.wspolrzedneX, pio12.wspolrzedneY, pio12.litera);
        szachownica1.szachownicaUmiescFigure(pio13.wspolrzedneX, pio13.wspolrzedneY, pio13.litera);
        szachownica1.szachownicaUmiescFigure(pio14.wspolrzedneX, pio14.wspolrzedneY, pio14.litera);
        szachownica1.szachownicaUmiescFigure(pio15.wspolrzedneX, pio15.wspolrzedneY, pio15.litera);
        szachownica1.szachownicaUmiescFigure(pio16.wspolrzedneX, pio16.wspolrzedneY, pio16.litera);
        szachownica1.szachownicaUmiescFigure(wieza1.wspolrzedneX, wieza1.wspolrzedneY, wieza1.litera);
        szachownica1.szachownicaUmiescFigure(wieza2.wspolrzedneX,wieza2.wspolrzedneY, wieza2.litera);
        szachownica1.szachownicaUmiescFigure(wieza3.wspolrzedneX,wieza3.wspolrzedneY, wieza3.litera);
        szachownica1.szachownicaUmiescFigure(wieza4.wspolrzedneX,wieza4.wspolrzedneY, wieza4.litera);
        szachownica1.szachownicaUmiescFigure(skoczek1.wspolrzedneX,skoczek1.wspolrzedneY, skoczek1.litera);
        szachownica1.szachownicaUmiescFigure(skoczek2.wspolrzedneX,skoczek2.wspolrzedneY, skoczek2.litera);
        szachownica1.szachownicaUmiescFigure(skoczek3.wspolrzedneX,skoczek3.wspolrzedneY, skoczek3.litera);
        szachownica1.szachownicaUmiescFigure(skoczek4.wspolrzedneX,skoczek4.wspolrzedneY, skoczek4.litera);
        szachownica1.szachownicaUmiescFigure(goniec1.wspolrzedneX, goniec1.wspolrzedneY, goniec1.litera);
        szachownica1.szachownicaUmiescFigure(goniec2.wspolrzedneX, goniec2.wspolrzedneY, goniec2.litera);
        szachownica1.szachownicaUmiescFigure(goniec3.wspolrzedneX, goniec3.wspolrzedneY, goniec3.litera);
        szachownica1.szachownicaUmiescFigure(goniec4.wspolrzedneX, goniec4.wspolrzedneY, goniec4.litera);
        szachownica1.szachownicaUmiescFigure(hetman1.wspolrzedneX, hetman1.wspolrzedneY, hetman1.litera);
        szachownica1.szachownicaUmiescFigure(hetman2.wspolrzedneX, hetman2.wspolrzedneY, hetman2.litera);
        szachownica1.szachownicaUmiescFigure(krol1.wspolrzedneX, krol1.wspolrzedneY, krol1.litera);
        szachownica1.szachownicaUmiescFigure(krol2.wspolrzedneX, krol2.wspolrzedneY, krol2.litera);




        //Sprawdzenie czy zostały dobrze rozstawione
        szachownica1.szachownicaWyswietl();


    }


    }
