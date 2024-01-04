
import java.util.LinkedList;


public class Szachownica {


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

    public void szachownicaWyswietl(){
         for (int i = 0; i<8;i++)System.out.print("| "+i+" |");
        System.out.println();
        for (int szachownicaX = 0; szachownicaX < zwrocDlugoscX(); szachownicaX++){
            for (int szachownicaY = 0; szachownicaY < zwrocDlugoscY(); szachownicaY++){
                if (szachownica[szachownicaX][szachownicaY] == null)
                    System.out.print("     ");
                else{
                    if (szachownica[szachownicaX][szachownicaY] instanceof Pionek)
                        System.out.print("| P |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Skoczek)
                        System.out.print("| S |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Hetman)
                        System.out.print("| D |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Krol)
                        System.out.print("| K |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Wieza)
                        System.out.print("| W |");
                    else if (szachownica[szachownicaX][szachownicaY] instanceof Goniec)
                        System.out.print("| G |");
                    else
                        System.out.print("x");
                }
            }
            System.out.println();

        }
        for (int i = 0; i<8;i++)System.out.print("| "+i+" |");

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
        return szachownica[x][y];
    }






}


