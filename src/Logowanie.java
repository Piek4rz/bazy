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
    public static void lekarz()
    {
        System.out.println("Zalogowano jako lekarz");

    }

    public static void pielegniarka()
    {
        System.out.println("Zalogowano jako pielegniarka");

    }

    public static void pracownik_izby_przyjec()
    {
        System.out.println("Zalogowano jako pracownik izby przyjec");

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
                Method method = Logowanie.class.getDeclaredMethod(pracownik[wybor]);
                method.invoke(logowanie);
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
