class Goniec extends Figura{


    public Goniec(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor,  int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }


    public boolean mozliwyRuch(int wspolrzedneXRuchu, int wspolrzedneYRuchu) {
        int wspolrzedneX = this.zwrocX();
        int wspolrzedneY = this.zwrocY();
        Figura figuraNaDocelowychWspolrzednych = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);
        // Sprawdź, czy ruch jest po skosie (tak samo w górę jak i w dół)
        if (Math.abs(wspolrzedneXRuchu - wspolrzedneX) == Math.abs(wspolrzedneYRuchu - wspolrzedneY)) {
            int deltaX = (wspolrzedneXRuchu - wspolrzedneX > 0) ? 1 : -1;
            int deltaY = (wspolrzedneYRuchu - wspolrzedneY > 0) ? 1 : -1;

            int x = wspolrzedneX + deltaX;
            int y = wspolrzedneY + deltaY;

            // Sprawdź, czy na docelowych współrzędnych jest król przeciwnika


            if (figuraNaDocelowychWspolrzednych != null && figuraNaDocelowychWspolrzednych.czyJestemKrolem() && this.gracz != figuraNaDocelowychWspolrzednych.gracz) {
                return true; // Dozwolone szachowanie króla
            }

            // Sprawdź, czy na drodze gońca nie ma żadnych innych figur
            while (x != wspolrzedneXRuchu && y != wspolrzedneYRuchu) {
                if (szachownica.sprawdzFigure(x, y) != null) {

                    return false;
                }
                x += deltaX;
                y += deltaY;
            }



            if (figuraNaDocelowychWspolrzednych != null) {
                if (this.gracz != figuraNaDocelowychWspolrzednych.gracz) {
                    return true; // Dozwolone bicie przeciwnika
                } else {
                    return false;
                }
            } else {
                return true; // Dozwolony pusty ruch
            }
        } else {

            return false;
        }
    }

    public String toString()
    {
        return "Goniec";
    }
}