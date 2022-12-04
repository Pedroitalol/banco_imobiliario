module application {
    requires javafx.graphics;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens br.ufc.trabalhofinalpds to javafx.fxml;
    exports br.ufc.trabalhofinalpds;
}