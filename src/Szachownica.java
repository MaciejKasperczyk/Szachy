//Klasa szachownica
public class Szachownica {




    //Najważniejsza tablica w całym programie, przechowuje zawartość szachownicy (czyli gry)
     static String[][] szachownicaTablica = new String[8][8];

     //Na tym etapie kodu nie widze by szachownica miala przyjmować jakieś parametry (do sprawdzenia)
     public Szachownica()
    {


    }

    //Metoda która wstawia figury (korzysta z klasy figur)
    public static void szachownicaUmiescFigure(int x,int y,String znak)
    {
        szachownicaTablica[x][y] = znak;

    }


    // Metoda wyswietlajaca szachownice, dla pustych wartosci zamiast wyswietlac null, wyswietla spacje " "
    public static void szachownicaWyswietl()
        {
            for (int i =0;i<8;i++)
            {
                for (int j=0;j<8;j++) {
                    if(j==0) System.out.print(" | ");
                    if(szachownicaTablica[i][j] != null)
                    {
                     System.out.print(szachownicaTablica[i][j] + " | ");
                    }
                    else System.out.print(" " +" | ");
                }
                System.out.println();
            }

        }

    public String sprawdzFigure(int poleFiguryX,int poleFiguryY)
    {
        String figuraRuszana = szachownicaTablica[poleFiguryX][poleFiguryY];
        return figuraRuszana;

    }

    public void ruch(int poleFiguryX,int poleFiguryY, int ruchX, int ruchY)
    {
        String figuraRuszana = szachownicaTablica[poleFiguryX][poleFiguryY];
        szachownicaTablica[ruchX][ruchY] = figuraRuszana;
        szachownicaTablica[poleFiguryX][poleFiguryY] = null;


    }





}


