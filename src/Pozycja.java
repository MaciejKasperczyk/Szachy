public class Pozycja {
    private int kolumna;
    private int wiersz;

    public Pozycja(int kolumna, int wiersz)
    {
        this.kolumna = kolumna;
        this.wiersz = wiersz;
    }
    public int zwrocKolumne()
    {
        return kolumna;
    }
    public int zwrocWiersz()
    {
        return  wiersz;
    }
}
