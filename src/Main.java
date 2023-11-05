// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int X = 8;
        int Y = 8;

        int[][] Szachownica = new int[X][Y];
        Szachownica(Szachownica);
    }

    public static void Szachownica(int[][] Szachownica) {

        char znak = 72;
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            System.out.print(' ');

                for (int j = 1; j < 18; j++)
                {
                    if ((j==1 && i!=0 && i!=9))
                    {
                        System.out.print(i);
                        System.out.print('|');
                    }
                    else if (j==1)
                    {
                        System.out.print(" |");
                    }
                    else if ((j % 2 == 0 && i == 0) || (j % 2 == 0 &&  i==9))
                    {
                        System.out.print(znak);
                        znak--;
                    }
                    else if (j%2==0)
                        {
                            System.out.print(' ');
                        }
                        else
                    {
                        System.out.print('|');
                    }
                    if ((j==17 && i!=0 && i!=9))
                    {
                        System.out.print(i);
                    }
                }
                znak = 72;
                System.out.println();
        }
    }
}
