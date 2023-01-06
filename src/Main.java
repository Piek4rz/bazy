import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    static Connection dane;
    static Statement daneStatement;
    static ResultSet haslaSet, loginSet;

    public static void main(String[] args)
    {
        zaloguj();
    }

    public static void zaloguj()
    {
        String url = "jdbc:mysql://localhost:3306/szpital";
        String username = "danelogowania";
        String password = "admin";


        int wybor=0;
        String login, haslo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję: \n 1. Lekarz\n 2. Pielegniarka\n 3. Pracownik izby przyjec");
        wybor= Integer.parseInt(scanner.nextLine());
        while(wybor>3 && wybor<1)
        {
            System.out.println("Podano zla lilczbe, wpisz jeszcze raz");
            wybor = scanner.nextInt();
        }
        switch (wybor) {
            case 1:
                System.out.println("Podaj login: ");
                login = scanner.nextLine();
                System.out.println("Podaj haslo: ");
                haslo = scanner.nextLine();

                try {
                    dane = DriverManager.getConnection(url,username,password);
                    daneStatement = dane.createStatement();
                    haslaSet = daneStatement.executeQuery("select haslo from pracownik_szpitala where id_pracownika = "+ login);

                    String test = "";
                    while(haslaSet.next())
                    {
                        test = haslaSet.getString(1);
                        break;
                    }
                    
                    if(haslo.equals(test))
                    {
                        lekarz();
                    }
                    else{
                        System.out.println("dupa");
                    }

                }catch (Exception e)
                {
                    e.printStackTrace();
                }

                //if()
                //lekarz();
                break;
            case 2:
                pielegniarka();
                System.out.println("Podaj login: ");
                login = scanner.nextLine();
                System.out.println("Podaj haslo: ");
                haslo = scanner.nextLine();
                break;
            case 3:
                pracownik();
                System.out.println("Podaj login: ");
                login = scanner.nextLine();
                System.out.println("Podaj haslo: ");
                haslo = scanner.nextLine();
                break;

        }

    }

    public static void lekarz()
    {
        System.out.println("Zalogowano jako lekarz");

    }

    public static void pielegniarka()
    {
        System.out.println("Zalogowano jako pielegniarka");

    }

    public static void pracownik()
    {
        System.out.println("Zalogowano jako pracownik izby przyjec");

    }
}