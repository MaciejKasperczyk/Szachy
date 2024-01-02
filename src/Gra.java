
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.in;

public class Gra {
        private Szachownica szachownica;
        private LinkedList<Figura> bialeFigury;
        Scanner userInput = new Scanner(System.in);



        public Gra() {
                this.szachownica = new Szachownica(8, 8);



                Pionek bialyPionek1 = new Pionek(szachownica, 1, 0, Kolor.CZARNY, 1);
                Pionek bialyPionek2 = new Pionek(szachownica, 1, 1, Kolor.CZARNY,  1);
                Pionek bialyPionek3 = new Pionek(szachownica, 1, 2, Kolor.CZARNY,  1);
                Pionek bialyPionek4 = new Pionek(szachownica, 1, 3, Kolor.CZARNY,  1);
                Pionek bialyPionek5 = new Pionek(szachownica, 1, 4, Kolor.CZARNY,  1);
                Pionek bialyPionek6 = new Pionek(szachownica, 1, 5, Kolor.CZARNY,  1);
                Pionek bialyPionek7 = new Pionek(szachownica, 1, 6, Kolor.CZARNY, 1);
                Pionek bialyPionek8 = new Pionek(szachownica, 1, 7, Kolor.CZARNY, 1);


                Pionek czarnyPionek1 = new Pionek(szachownica, 6, 0, Kolor.CZARNY, 0);
                Pionek czarnyPionek2 = new Pionek(szachownica, 6, 1, Kolor.CZARNY, 0);
                Pionek czarnyPionek3 = new Pionek(szachownica, 6, 2, Kolor.CZARNY, 0);
                Pionek czarnyPionek4 = new Pionek(szachownica, 6, 3, Kolor.CZARNY, 0);
                Pionek czarnyPionek5 = new Pionek(szachownica, 6, 4, Kolor.CZARNY, 0);
                Pionek czarnyPionek6 = new Pionek(szachownica, 6, 5, Kolor.CZARNY, 0);
                Pionek czarnyPionek7 = new Pionek(szachownica, 6, 6, Kolor.CZARNY, 0);
                Pionek czarnyPionek8 = new Pionek(szachownica, 6, 7, Kolor.CZARNY, 0);




        }



                public void rozgrywka(){
                        boolean koniecGry = false;

                        while (!koniecGry) {
                                szachownica.szachownicaWyswietl();
                                System.out.println("Wpisz X a nastepnie Y figury ktorą chcesz ruszyć: ");
                                int wybranaWspolrzednaX = userInput.nextInt();
                                int wybranaWspolrzednaY = userInput.nextInt();
                                Figura wybranaFigura = szachownica.sprawdzFigure(wybranaWspolrzednaX,wybranaWspolrzednaY);
                                if(wybranaFigura != null) {
                                        System.out.println("Wpisz X a nastepnie Y pola, na które chcesz ruszyć pionkiem: ");
                                        int nastepnyRuchX = userInput.nextInt();
                                        int nastepnyRuchY = userInput.nextInt();
                                        if (wybranaFigura.mozliwyRuch(nastepnyRuchX, nastepnyRuchY))
                                                wybranaFigura.moveTo(nastepnyRuchX, nastepnyRuchY);
                                        else System.out.println("Nieprawidlowy ruch, sprobuj ponownie!");
                                }
                                else System.out.println("Wybrane pole jest puste, sprobuj ponownie");







                        }

                }




        }
