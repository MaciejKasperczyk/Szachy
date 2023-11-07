//Klasa szachownica
public class Szachownica {

    int X;
    int y;
    /*
    public Szachownica(int x, int y)
    {
        this.szachownica = szachownica;
    }

    */
     */
    public static void szchownicaWyswietl()
        {

        }
    // Metoda rozstawiajaca szachownice - na poczatku kazdej nowej gry.
    // W pozniejszej implementacji trzeba zamienic pionki na elementy klasy figury a nie czyste liczby
    // To do:
    // 1. Przerobic for inty by fory wypelnily tymi wartosciami
    public static void szachownicaRozstaw() {
        char znak = 65;
        System.out.println();
        for (int i = 9; i >= 0; i--) {
            if (i == 8 || i == 0) {
                System.out.println();
            }
            System.out.print(' ');
            for (int j = 1; j < 18; j++) {


                if ((j == 1 && i != 9 && i != 0)) {
                    System.out.print(i);
                    System.out.print("   |");
                } else if (j == 1) {
                    System.out.print("    |");
                } else if ((j % 2 == 0 && i == 9) || (j % 2 == 0 && i == 0)) {
                    System.out.print(znak);
                    znak++;
                } else if (j % 2 == 0 && i == 7 || j % 2 == 0 && i == 1) {
                    System.out.print('P');
                } else if (j == 2 && i == 8 || j == 16 && i == 8 || j == 2 && i == 2 || j == 16 && i == 2) {
                    System.out.print('W');
                } else if (j == 4 && i == 8 || j == 14 && i == 8 || j == 4 && i == 2 || j == 14 && i == 2) {
                    System.out.print('S');
                } else if (j == 6 && i == 8 || j == 12 && i == 8 || j == 6 && i == 2 || j == 12 && i == 2) {
                    System.out.print('G');
                } else if (j == 8 && i == 8 || j == 8 && i == 2) {
                    System.out.print('H');
                } else if (j == 10 && i == 8 || j == 10 && i == 2) {
                    System.out.print('K');
                } else if (j % 2 == 0) {
                    System.out.print(' ');
                } else {
                    System.out.print('|');
                }
                if ((j == 17 && i != 9 && i != 0)) {
                    System.out.print("   ");
                    System.out.print(i);
                }

            }
            znak = 65;
            System.out.println();
        }
    }
}


