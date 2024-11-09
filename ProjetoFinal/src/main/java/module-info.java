module org.example.projetofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projetofinal to javafx.fxml;
    exports org.example.projetofinal;
}