abstract class Figury {

}
class Pionek
{

    // Koordynaty by wiedziec gdzie Pionek ma powstać
    int wspolrzedneX;
    int wspolrzedneY;
    String kolor;

    String litera = "P";
    public boolean czyZbity = false;


// Konstruktor klasy Pionek
    public Pionek(int wspolrzedneX, int wspolrzedneY, String kolor, boolean czyZbity)
    {
        this.wspolrzedneY = wspolrzedneY;
        this.wspolrzedneX = wspolrzedneX;
        this.kolor = kolor;
        this.czyZbity = czyZbity;

    }



    // Testowa metoda by sprawdzicz czy wszystko sie przypisuje
    public void pokazCechy()
    {
        System.out.println(wspolrzedneX);
        System.out.println(wspolrzedneY);
        System.out.println(kolor);
        System.out.println(czyZbity);

    }




}
