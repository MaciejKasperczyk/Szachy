class Hetman extends Figura{


    public Hetman(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }



    public boolean mozliwyRuch(int wspolrzedneXRuchu, int wspolrzedneYRuchu) {
        int wspolrzedneX = this.zwrocX();
        int wspolrzedneY = this.zwrocY();

        // Sprawdź, czy ruch jest pionowy, poziomy lub po skosie
        if (wspolrzedneX == wspolrzedneXRuchu || wspolrzedneY == wspolrzedneYRuchu ||
                Math.abs(wspolrzedneXRuchu - wspolrzedneX) == Math.abs(wspolrzedneYRuchu - wspolrzedneY)) {

            int deltaX = Integer.compare(wspolrzedneXRuchu, wspolrzedneX);
            int deltaY = Integer.compare(wspolrzedneYRuchu, wspolrzedneY);

            int x = wspolrzedneX + deltaX;
            int y = wspolrzedneY + deltaY;

            // Sprawdź, czy na drodze hetmana nie ma żadnych innych figur
            while (x != wspolrzedneXRuchu || y != wspolrzedneYRuchu) {
                if (szachownica.sprawdzFigure(x, y) != null) {
                    return false;
                }
                x += deltaX;
                y += deltaY;
            }

            // Ruch jest możliwy, jeśli pole docelowe jest puste lub zajęte przez figurę przeciwnika
            Figura figuraNaDocelowychWspolrzednych = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);
            return figuraNaDocelowychWspolrzednych == null || figuraNaDocelowychWspolrzednych.zwrocGracza() != this.gracz;
        }

        return false; // Ruch nie jest możliwy
    }


    public String toString(){
        return "Hetman";
    }



}


