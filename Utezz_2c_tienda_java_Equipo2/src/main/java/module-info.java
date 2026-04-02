module com.example.utezz_2c_tienda_java_equipo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.utezz_2c_tienda_java_equipo2 to javafx.fxml;
    exports com.example.utezz_2c_tienda_java_equipo2;
}