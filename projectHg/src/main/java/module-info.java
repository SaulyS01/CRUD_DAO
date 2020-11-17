module org.community.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.community.poo to javafx.fxml;
    exports org.community.poo.model;
}
