import java.sql.ResultSet;
import java.util.Scanner;

public class PracownikSzpitala{

    static ResultSet pracownikSet;

    public PracownikSzpitala(int IDPracownika) {

    }

    void danePracownika(int IDPracownika)
    {
        try
        {
            int IDOsoby = 0;
            String imie = "", nazwisko = "";

            pracownikSet = DBConnector.daneStatement.executeQuery("SELECT id_osoby FROM pracownik_szpitala where id_pracownika = " + IDPracownika);

            if(pracownikSet.next())
                IDOsoby = pracownikSet.getInt("id_osoby");

            pracownikSet = DBConnector.daneStatement.executeQuery("SELECT imie, nazwisko FROM osoba where id_osoby = " + IDOsoby);
            if (pracownikSet.next())
            {
                imie = pracownikSet.getString("imie");
                nazwisko = pracownikSet.getString("nazwisko");
            }
            System.out.println(imie + " " + nazwisko);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    void danePacjenta()
    {

    }

    void iluPacjentow()
    {
        int iloscPacjentow = 0;
        try {
            pracownikSet = DBConnector.daneStatement.executeQuery("SELECT COUNT(*) FROM pacjenci_lezacy");
            if(pracownikSet.next())
                iloscPacjentow = pracownikSet.getInt(1);

            System.out.println("Obecnie w szpitalu jest " + iloscPacjentow + " pacjentow");
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    void iluPacjentowOddzial()
    {

    }


}
