

import java.util.Scanner;

// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner tekst = new Scanner(System.in);
        Gra gra1 = new Gra();
        System.out.println("Witaj w grze w szachy");
        do {
            System.out.println("Wybierz:\n1 - zapoznanie się z gra\n2 - rozpocznij partię\n3 - zakończ program");
            byte x = tekst.nextByte();
            if (x==1){
                System.out.println("Gre rozpoczyna gracz Bialy, szachownica zamiast pol [A-H] korzysta z tablicy [1-8], wiecej informacji w pliku README.md");
                System.out.println(1);
            }
            else if (x==2) {
                gra1.rozgrywka();
            }
            else break;
        } while (true);
        System.out.println("Do zobaczenia!!!");
        tekst.close();
    }
    }
