public class PracownikIzbyPrzyjec extends PracownikSzpitala{

    int IDPracownika;

    PracownikIzbyPrzyjec(int IDPracownika, String haslo, int IDOddzialu, int IDOsoby, int IDDyzuru)
    {
        super(haslo, IDOddzialu,IDOsoby,IDDyzuru);
        this.IDPracownika = super.IDPracownika;
    }

    void zarejestrowaniePacjenta()
    {

    }

    void sprawdzanieWolnychlozek()
    {

    }

    void edytowaniePacjenta()
    {

    }

    void wgladWKadre()
    {

    }

    void przypisaniePacjentaDoOddzialu()
    {

    }


}
