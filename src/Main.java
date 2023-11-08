// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Deklaracja wszystkich figur, po kolei (na tym etapie optymalizacji wszystkie figury recznie)
        Pionek pio1 = new Pionek(0,0,"bialy",true);
        //pio1.pokazCechy();
        Pionek pio2 = new Pionek(6,0,"czarny",true);
        //pio2.pokazCechy();

        //Stworzenie Szachownicy
        Szachownica szachownica1= new Szachownica();

        // Reczne rozstawienie pionkow na podstawie ich współrzednych
        szachownica1.szachownicaUmiescPionek(pio1.wspolrzedneX, pio2.wspolrzedneY, pio1.litera);
        szachownica1.szachownicaUmiescPionek(pio2.wspolrzedneX, pio2.wspolrzedneY, pio2.litera);

        //Sprawdzenie czy zostały dobrze rozstawione
        szachownica1.szachownicaWyswietl();



    }


    }
