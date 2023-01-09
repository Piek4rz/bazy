import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Logowanie {
    static Connection dane;
    static Statement daneStatement;
    static ResultSet haslaSet, loginSet;
    public static void lekarz(int IDPracownika)
    {
        try {
            Lekarz lekarz = new Lekarz(IDPracownika);
            Scanner scanner = new Scanner(System.in);
            int wybor = 0;
            boolean loop = true;

            System.out.println("Zalogowano jako lekarz\n");

            while (loop) {
                System.out.println("1 - wypisz pacjenta\n" +
                    "2 - wystaw akt zgonu\n" +
                    "3 - edytuj dokumentacje medyczna pacjenta\n" +
                    "4 - wyloguj\n\n");

                wybor = Integer.parseInt(scanner.nextLine());
                switch (wybor) {
                    case 1:
                        lekarz.wypisaniePacjenta();
                        break;
                    case 2:
                        lekarz.wystawienieAktuZgonu();
                        break;
                    case 3:
                        lekarz.edytowanieDokumentacji();
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        System.out.println("podaj poprawna liczbe");
                        break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void pielegniarka()
    {
        int wybor=0;

        System.out.println("Zalogowano jako pielegniarka\n");
        System.out.println("1 - Edytuj dokumentacje medyczna pacjenta\n");
        Scanner scanner = new Scanner(System.in);
        wybor= Integer.parseInt(scanner.nextLine());

        switch (wybor){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("podaj poprawna liczbe");
                break;
        }

    }

    public static void pracownik_izby_przyjec()
    {
        int wybor=0;

        System.out.println("Zalogowano jako pracownik izby przyjec\n");
        System.out.println("1 - zarejestruj pacjenta\n" +
                "2 - sprawdz wolne lozka\n" +
                "3 - edytuj dane pacjenta\n" +
                "4 - przypisz pacjenta do oddzialu" +
                "5 - zobacz kadre szpitala");
        Scanner scanner = new Scanner(System.in);
        wybor= Integer.parseInt(scanner.nextLine());
        switch (wybor){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("podaj poprawna liczbe");
                break;
        }

    }
    public static void logowanie()
    {
        int wybor=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję: \n 1. Lekarz\n 2. Pielegniarka\n 3. Pracownik izby przyjec");
        wybor= Integer.parseInt(scanner.nextLine());
        while(wybor>3 && wybor<1)
        {
            System.out.println("Podano zla lilczbe, wpisz jeszcze raz");
            wybor = scanner.nextInt();
        }
        String loginInput, hasloInput;
        String[] pracownik = {"0","lekarz","pielegniarka","pracownik_izby_przyjec"};

        System.out.println("Podaj login: ");
        loginInput = scanner.nextLine();
        System.out.println("Podaj haslo: ");
        hasloInput = scanner.nextLine();

        Logowanie logowanie = new Logowanie();

        try {
            dane = DBConnector.connect();
            daneStatement = dane.createStatement();
            haslaSet = daneStatement.executeQuery("select haslo from pracownik_szpitala where id_pracownika = "+ loginInput);

            String haslozBazy = "";
            haslaSet.next();
            haslozBazy = haslaSet.getString(1);

            loginSet = daneStatement.executeQuery("select id_pracownika from " + pracownik[wybor] + " where id_pracownika = " + loginInput);
            String loginzBazy = "";
            if(loginSet.next())
                loginzBazy = loginSet.getString("id_pracownika");

            if((hasloInput.equals(haslozBazy))&& loginInput.equals(loginzBazy))
            {
                Method method = Logowanie.class.getDeclaredMethod(pracownik[wybor], int.class);
                method.invoke(logowanie,Integer.parseInt(loginInput));
            }
            else{
                System.out.println("Niepoprawne dane logowania");
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
