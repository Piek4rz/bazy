public class Pacjent {

    private static int counter = 1;
    int IDOsoby, IDGrupyKrwi, IDPacjenta;

    Adres adres;

    public Pacjent(int IDOsoby, int IDGrupyKrwi, String kodPocztowy, String miasto, String ulica, int nrBudynku, String nrLokalu){
        this.IDOsoby = IDOsoby;
        this.IDGrupyKrwi = IDGrupyKrwi;
        this.IDPacjenta = counter;
        counter++;
        adres = new Adres(IDPacjenta, kodPocztowy, miasto, ulica, nrBudynku, nrLokalu);
    }

    public void setIDGrupyKrwi(int IDGrupyKrwi) {
        this.IDGrupyKrwi = IDGrupyKrwi;
    }

    public int getIDOsoby() {
        return IDOsoby;
    }

    public int getIDGrupyKrwi() {
        return IDGrupyKrwi;
    }

    public int getIDPacjenta() {
        return IDPacjenta;
    }


}
