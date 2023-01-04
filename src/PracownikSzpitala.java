public class PracownikSzpitala{

    private static int counter = 1;
    int IDPracownika, IDOddzialu, IDOsoby, IDDyzuru;
    String haslo;

    PracownikSzpitala(String haslo, int IDOddzialu, int IDOsoby, int IDDyzuru)
    {
        this.haslo = haslo;
        this.IDOddzialu = IDOddzialu;
        this.IDOsoby = IDOsoby;
        this.IDDyzuru = IDDyzuru;
        IDPracownika = counter;
        counter++;
    }

    public static void setCounter(int counter) {
        PracownikSzpitala.counter = counter;
    }

    public void setIDOddzialu(int IDOddzialu) {
        this.IDOddzialu = IDOddzialu;
    }

    public void setIDOsoby(int IDOsoby) {
        this.IDOsoby = IDOsoby;
    }

    public void setIDDyzuru(int IDDyzuru) {
        this.IDDyzuru = IDDyzuru;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public int getCounter() {
        return counter;
    }

    public int getIDPracownika() {
        return IDPracownika;
    }

    public int getIDOddzialu() {
        return IDOddzialu;
    }

    public int getIDOsoby() {
        return IDOsoby;
    }

    public int getIDDyzuru() {
        return IDDyzuru;
    }

    public String getHaslo() {
        return haslo;
    }
}
