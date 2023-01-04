public class Adres {

    int IDPacjenta, nrBudynku;
    String kodPocztowy, miasto, ulica, nrLokalu;
    public Adres(int IDPacjenta, String kodPocztowy, String miasto, String ulica, int nrBudynku, String nrLokalu)
    {
        this.IDPacjenta = IDPacjenta;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
        this.nrLokalu = nrLokalu;
    }

    public void setNrBudynku(int nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNrLokalu(String nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    public int getNrBudynku() {
        return nrBudynku;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNrLokalu() {
        return nrLokalu;
    }
}
