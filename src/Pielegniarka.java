public class Pielegniarka extends PracownikSzpitala{
    int IDPracownika;

    Pielegniarka(int IDPracownika, String haslo, int IDOddzialu, int IDOsoby, int IDDyzuru)
    {
        super( haslo, IDOddzialu,IDOsoby,IDDyzuru);
        this.IDPracownika = super.IDPracownika;
    }

    void edytowanieDokumentacji()
    {

    }
}
