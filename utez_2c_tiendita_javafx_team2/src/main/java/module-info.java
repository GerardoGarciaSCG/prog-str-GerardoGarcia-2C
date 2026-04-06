module com.example.utez_2c_tiendita_javafx_team2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.utez_2c_tiendita_javafx_team2 to javafx.fxml;
    exports com.example.utez_2c_tiendita_javafx_team2;
}