class Skoczek extends Figura {


// Dziedziczenie klasy Figura
    public Skoczek(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }

    public boolean mozliwyRuch(int wspolrzedneXRuchu,int wspolrzedneYRuchu)
    {
        // Skoczek moze poruszac sie tylko L albo o 2 wertykalnie i 1 horyzontalnie, albo 1 wertykalnie i 2 horyzontalnie, abs by zniwelowac minusowe
        int ruchX = Math.abs(wspolrzedneXRuchu - this.zwrocX());
        int ruchY = Math.abs(wspolrzedneYRuchu - this.zwrocY());
        boolean jestRuchemSkoczka = (ruchX == 2 && ruchY == 1) || (ruchX == 1 && ruchY == 2);

        // Jezeli nie jest ruchem skoczka, zwroc false
        if (!jestRuchemSkoczka) {

            return false;
        }

        // Kukla ktora sprawdza czy na polu znajduje sie figura wroga czy nasza
        Figura kukla= szachownica.sprawdzFigure(wspolrzedneXRuchu, wspolrzedneYRuchu);
        if (kukla != null && kukla.zwrocGracza() == this.zwrocGracza()) {
            return false;
        }

        return true;






    }

    public String toString()
    {
        return "Skoczek";
    }
}