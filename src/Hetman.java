class Hetman extends Figura{


    public Hetman(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }



    public boolean mozliwyRuch(int wspolrzedneXRuchu, int wspolrzedneYRuchu) {
        int wspolrzedneX = this.zwrocX();
        int wspolrzedneY = this.zwrocY();


        // Sprawdź, czy ruch jest pionowy, poziomy lub po skosie
        if (wspolrzedneX == wspolrzedneXRuchu || wspolrzedneY == wspolrzedneYRuchu || Math.abs(wspolrzedneXRuchu - wspolrzedneX) == Math.abs(wspolrzedneYRuchu - wspolrzedneY)) {
            int deltaX = (wspolrzedneXRuchu - wspolrzedneX > 0) ? 1 : (wspolrzedneXRuchu - wspolrzedneX < 0) ? -1 : 0;
            int deltaY = (wspolrzedneYRuchu - wspolrzedneY > 0) ? 1 : (wspolrzedneYRuchu - wspolrzedneY < 0) ? -1 : 0;

            int x = wspolrzedneX + deltaX;
            int y = wspolrzedneY + deltaY;

            // Sprawdź, czy na drodze hetmana nie ma żadnych innych figur
            while ((x != wspolrzedneXRuchu || y != wspolrzedneYRuchu) && (x != wspolrzedneXRuchu || y != wspolrzedneYRuchu)) {
                if (szachownica.sprawdzFigure(x, y) != null) {

                    return false;
                }
                x += deltaX;
                y += deltaY;
            }

            // Sprawdź, czy na docelowych współrzędnych jest figura przeciwnika
            Figura figuraNaDocelowychWspolrzednych = szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);

           if(figuraNaDocelowychWspolrzednych != null && this.gracz != figuraNaDocelowychWspolrzednych.gracz){
               return true;

            } else {
                return true; // Dozwolony pusty ruch
            }
        } else {

            return false;
        }
    }


    public String toString(){
        return "Hetman";
    }



}


