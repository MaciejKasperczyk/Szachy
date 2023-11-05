// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int X =8;
        int Y =8;

        int[][] Szachownica = new int[X][Y];
        Szachownica(Szachownica);
        }
        public static void Szachownica(int[][] Szachownica) {


            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 16; j++) {
                    if (j%2==0)
                    {
                        char znak = 65;
                        System.out.print(znak);
                    }
                    else
                    {
                        System.out.print('+');
                    }

                }
                System.out.println('-');
            }
        }
    }
