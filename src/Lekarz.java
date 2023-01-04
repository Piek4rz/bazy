public class Lekarz extends PracownikSzpitala{

    private static int counter = 1;
    int IDPracownika, IDLekarza;

    Lekarz(int IDPracownika, String haslo, int IDOddzialu, int IDOsoby, int IDDyzuru)
    {
        super(haslo, IDOddzialu,IDOsoby,IDDyzuru);
        this.IDPracownika = super.IDPracownika;
        IDLekarza = counter;
        counter++;
    }

    void wypisaniePacjenta()
    {

    }

    void wystawienieAktuZgonu()
    {

    }

    void edytowanieDokumentacji()
    {

    }

    public int getIDLekarza() {
        return IDLekarza;
    }
}
