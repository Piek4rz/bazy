module grupa.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens grupa.javafx to javafx.fxml;
    exports grupa.javafx;
}