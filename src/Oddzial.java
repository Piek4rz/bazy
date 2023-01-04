import java.util.ArrayList;

public class Oddzial {
    private static int counter = 1;
    int IDOddzialu, iloscPokoi, iloscLekarzy;
    String nazwaOddzialu;

    ArrayList<Integer> numeryPokoi = new ArrayList<>();

    public Oddzial(int iloscLekarzy, int iloscPokoi, String nazwaOddzialu)
    {
        this.iloscLekarzy = iloscLekarzy;
        this.iloscPokoi = iloscPokoi;
        this.nazwaOddzialu = nazwaOddzialu;
        IDOddzialu = counter;
        counter++;
    }

    void dodajPokoj()
    {

    }

}
