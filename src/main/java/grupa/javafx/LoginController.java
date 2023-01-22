package grupa.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField textFieldLogin;
    @FXML
    private PasswordField passwordFieldHaslo;
    @FXML
    private ComboBox<String> comboBoxRole;

    private String[] values = {"Pracownik izby przyjęć", "Pielęgniarka", "Lekarz"};

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws Exception {
        System.out.println("Zalogowano!");
        String opcja = comboBoxRole.getValue();
        System.out.println(opcja);
        String login = textFieldLogin.getText();
        String haslo = passwordFieldHaslo.getText();
        FXMLLoader loader = new FXMLLoader();
        if(opcja == "Lekarz")
        {
            loader = new FXMLLoader(getClass().getResource("lekarzView.fxml"));
        }
        if(opcja == "Pielęgniarka")
        {
            loader = new FXMLLoader(getClass().getResource("pielegniarkaView.fxml"));
        }
        if(opcja == "Pracownik izby przyjęć")
        {
            loader = new FXMLLoader(getClass().getResource("pracownikIzbyPrzyjecView.fxml"));
        }
        Parent root = loader.load();

        SceneSwitching.sceneSwitch(loader, event, root);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBoxRole.getItems().addAll(values);
    }
}