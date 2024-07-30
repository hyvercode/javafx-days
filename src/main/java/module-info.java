module com.hyvercode.fxdays {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.hyvercode.fxdays to javafx.fxml;
    exports com.hyvercode.fxdays;
    exports com.hyvercode.fxdays.controller;
    opens com.hyvercode.fxdays.controller to javafx.fxml;
}