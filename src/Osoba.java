import java.awt.dnd.InvalidDnDOperationException;
import java.util.Scanner;

public class Osoba {
    private static int counter = 1;
    int IDOsoby;
    String imie, nazwisko, PESEL;
    boolean plec;

    public Osoba(String imie, String nazwisko, boolean plec, String PESEL)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.PESEL = PESEL;
        this.IDOsoby = counter;
        counter++;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public int getIDOsoby() {
        return IDOsoby;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPESEL() {
        return PESEL;
    }

    public boolean getPlec() {
        return plec;
    }
}
