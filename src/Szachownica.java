//Klasa szachownica


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

    public void szachownicaWyswietl(){
         for (int i = 0; i<8;i++)System.out.print(i);
        System.out.println();
        for (int xBoard = 0; xBoard < getXDimension(); xBoard++){
            for (int yBoard = 0; yBoard < getYDimension(); yBoard++){
                if (szachownica[xBoard][yBoard] == null)
                    System.out.print(" ");
                else{
                    if (szachownica[xBoard][yBoard] instanceof Pionek)
                        System.out.print("P");
                    else if (szachownica[xBoard][yBoard] instanceof Skoczek)
                        System.out.print("S");
                    else if (szachownica[xBoard][yBoard] instanceof Hetman)
                        System.out.print("D");
                    else if (szachownica[xBoard][yBoard] instanceof Krol)
                        System.out.print("K");
                    else if (szachownica[xBoard][yBoard] instanceof Wieza)
                        System.out.print("W");
                    else if (szachownica[xBoard][yBoard] instanceof Goniec)
                        System.out.print("G");
                    else
                        System.out.print("x");
                }
            }
            System.out.println();

        }
        for (int i = 0; i<8;i++)System.out.print(i);
        System.out.println();
     }

        public int getXDimension(){
            return szachownica[0].length;
        }

        public int getYDimension(){
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


