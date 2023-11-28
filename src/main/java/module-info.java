module com.felipehamerski.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.felipehamerski.login to javafx.fxml;
    exports com.felipehamerski.login;
}
