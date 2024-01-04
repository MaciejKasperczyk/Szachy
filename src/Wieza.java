class Wieza extends Figura {


    public Wieza(Szachownica szachownica, int wspolrzedneX, int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica, wspolrzedneX, wspolrzedneY, kolor, gracz);


    }

    public boolean mozliwyRuch(int wspolrzedneXRuchu, int wspolrzedneYRuchu) {
        int wspolrzedneX = this.zwrocX();
        int wspolrzedneY = this.zwrocY();



        // pionowo
        if (wspolrzedneY == wspolrzedneYRuchu) {
            int start, koniec;


                // Określ początkową i końcową współrzędną X w zależności od kierunku ruchu
                if (wspolrzedneXRuchu > wspolrzedneX) {
                    start = wspolrzedneX + 1;
                    koniec = wspolrzedneXRuchu;
                } else {
                    start = wspolrzedneXRuchu + 1;
                    koniec = wspolrzedneX;
                }

                // Sprawdź, czy na drodze wieży nie ma żadnych innych figur
                for (int i = start; i < koniec; i++) {
                    if (szachownica.sprawdzFigure(i, wspolrzedneY) != null) {

                        return false;
                    }
                }
            Figura figuraNaDocelowychWspolrzednych = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);

            if (figuraNaDocelowychWspolrzednych != null) {
                boolean czyRuchNaKrola = figuraNaDocelowychWspolrzednych.czyJestemKrolem();

                if (czyRuchNaKrola) {
                    System.out.println("Backlog: Wieza szachuje krola");
                    return true;
                } else if (this.gracz != figuraNaDocelowychWspolrzednych.gracz) {
                    System.out.println("Backlog: Wieza bije figure!: ");
                    return true;
                } else {
                    return false;
                }
            }
            else if(figuraNaDocelowychWspolrzednych == null)
            {
                System.out.println("Backlog: Figura przemieszcza sie: ");
                return true;
            }


                else return false;



        }


        //poziomo
        if (wspolrzedneX == wspolrzedneXRuchu){
            int start, koniec;

            // Określ początkową i końcową współrzędną Y w zależności od kierunku ruchu
            if (wspolrzedneYRuchu > wspolrzedneY) {
                start = wspolrzedneY + 1;
                koniec = wspolrzedneYRuchu;
            } else {
                start = wspolrzedneYRuchu + 1;
                koniec = wspolrzedneY;
            }

            // Sprawdź, czy na drodze wieży nie ma żadnych innych figur
            for (int i = start; i < koniec; i++) {
                if (szachownica.sprawdzFigure(wspolrzedneX, i) != null) {
                    System.out.println("Backlog: na drodze stoi Figura: ");
                    return false;
                }
            }

            Figura figuraNaDocelowychWspolrzednych = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);

            if (figuraNaDocelowychWspolrzednych != null) {
                boolean czyRuchNaKrola = figuraNaDocelowychWspolrzednych.czyJestemKrolem();

                if (czyRuchNaKrola) {
                    System.out.println("Backlog: Wieza szachuje krola");
                    return true;
                } else if (this.gracz != figuraNaDocelowychWspolrzednych.gracz) {
                    return true;
                } else {
                    return false;
                }
            }
            else if(figuraNaDocelowychWspolrzednych == null) return true;


            else return false;


        }

        return false; // Ruch nie jest ani pionowy, ani poziomy
    }
    public String toString()
    {
        return "Wieza";
    }



}