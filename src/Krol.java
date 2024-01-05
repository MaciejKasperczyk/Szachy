import java.util.List;

class Krol extends Figura {


    public Krol(Szachownica szachownica, int wspolrzedneX,int wspolrzedneY, Kolor kolor, int gracz) {
        super(szachownica,wspolrzedneX,wspolrzedneY,kolor,gracz);

    }
    public boolean mozliwyRuch(int wspolrzedneXRuchu,int wspolrzedneYRuchu)
    {
        Figura kukla = szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu);
        if(szachownica.sprawdzFigure(wspolrzedneXRuchu,wspolrzedneYRuchu) == null || kukla.gracz != this.gracz)
        {
            int absX = Math.abs(wspolrzedneXRuchu-this.zwrocX());
            int absY = Math.abs(wspolrzedneYRuchu - this.zwrocY());

            if(absX <= 1 && absY <= 1){
                if(absX == 0 && absY == 0){
                    return false;
                }

                this.pierwszyRuch = true;
                return true;
            }


    }

        return false;
    }

    public boolean czySzach() {
        for (Figura figura : szachownica.getFigury()) {
            if (figura.zwrocGracza() != this.gracz) {
                if (figura.mozliwyRuch(this.zwrocX(), this.zwrocY())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        return "Krol, koloru:"+ zwrocKolor() + " " + "gracza: "+zwrocGracza();
    }


}
