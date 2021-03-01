module JavaFx.Contacts {
    requires  javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens sample.datamodel;
    opens sample;
}