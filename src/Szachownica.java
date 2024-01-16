
import java.util.LinkedList;


public class Szachownica {

    public static final String ANSI_GRAY = "\u001B[37m";

    public static final String ANSI_RESET = "\u001B[0m";
    private Figura[][] szachownica;



     public Szachownica(int wielkoscX,int wielkoscY)
    {
        szachownica = new Figura[wielkoscX][wielkoscY];

    }



    //Metoda która wstawia figury (korzysta z klasy figur)
    public void szachownicaUmiescFigure(Figura figura,int x,int y)
    {
        szachownica[x][y] = figura;

    }
    public LinkedList<Figura> getFigury() {
        return Figura.zwrocWszystkieFigury();
    }

    public void szachownicaWyswietl() {



        System.out.print("     "); // Dodatkowa przestrzeń dla nagłówków kolumn
        for (int i = 65; i < 73; i++) {
            System.out.print("| " + (char)i + " |"); // Nagłówki kolumn
        }
        System.out.println();

        for (int szachownicaX = 0; szachownicaX < zwrocDlugoscX(); szachownicaX++) {
            System.out.print("| " + (szachownicaX+1) + " |"); // Wyświetlanie numeru wiersza na początku każdego wiersza

            for (int szachownicaY = 0; szachownicaY < zwrocDlugoscY(); szachownicaY++) {
                if (szachownica[szachownicaX][szachownicaY] == null) {
                    System.out.print("     ");
                } else {
                    if (szachownica[szachownicaX][szachownicaY] instanceof Pionek  && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 0)
                        System.out.print(ANSI_GRAY + "| "+(char)80+" |" + ANSI_RESET);
                    else if(szachownica[szachownicaX][szachownicaY] instanceof Pionek && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 1)
                        System.out.print("| "+(char)80+" |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Skoczek && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 0 )
                        System.out.print(ANSI_GRAY + "| "+(char)83+" |" + ANSI_RESET);
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Skoczek && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 1)
                        System.out.print("| "+(char)83+" |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Hetman && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 0)
                        System.out.print(ANSI_GRAY + "| "+(char)68+" |"+ ANSI_RESET);
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Hetman && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 1)
                        System.out.print("| "+(char)68+" |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Krol && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 0)
                        System.out.print(ANSI_GRAY + "| "+(char)75+" |" + ANSI_RESET);
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Krol && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 1)
                        System.out.print("| "+(char)75+" |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Wieza && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 0)
                        System.out.print(ANSI_GRAY +  "| "+(char)87+" |" + ANSI_RESET);
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Wieza && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 1)
                        System.out.print("| "+(char)87+" |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Goniec && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 0)
                        System.out.print( ANSI_GRAY + "| "+(char)71+" |" + ANSI_RESET);
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Goniec && szachownica[szachownicaX][szachownicaY].zwrocGracza() == 1)
                        System.out.print("| "+(char)71+" |");
                    else
                        System.out.print("x");
                }
            }

            System.out.print("| " + (szachownicaX+1) + " |"); // Wyświetlanie numeru wiersza na końcu każdego wiersza
            System.out.println();
        }

        System.out.print("     "); // Dodatkowa przestrzeń dla stopki kolumn
        for (int i = 65; i < 73; i++) {
            System.out.print("| " + (char)i + " |"); // Nagłówki kolumn
        }
        System.out.println();
    }

        public int zwrocDlugoscX(){
            return szachownica[0].length;
        }

        public int zwrocDlugoscY(){
            return szachownica.length;
        }
        public Figura[][] zwrocSzachownica()
        {
            return szachownica;
        }




    public void usunPionkaZPlanszy(Figura figura)
    {
        int wspolrzedneXPrzedUsunieciem = figura.zwrocX();
        int wspolrzedneYPrzedUsunieciem = figura.zwrocY();
        szachownica[wspolrzedneXPrzedUsunieciem][wspolrzedneYPrzedUsunieciem] = null;

    }
    public Figura sprawdzFigure(int x, int y)
    {
        if (x < 0 || x >= zwrocDlugoscX() || y < 0 || y >= zwrocDlugoscY()) {
            return null; // Zwraca null, jeśli współrzędne są poza zakresem
        }
        return szachownica[x][y];
    }






}


