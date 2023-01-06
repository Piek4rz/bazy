import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnector {

    static String url = "jdbc:mysql://localhost:3306/szpital";
    static String username = "root";
    static String password = "admin";


    public static void connect()
    {
        try {

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from osoba");

            while (resultSet.next())
            {
                System.out.println(resultSet.getString("imie"));
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}