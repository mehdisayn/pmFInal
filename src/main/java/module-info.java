module dsit.pmfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens dsit.pmfinal to javafx.fxml;
    exports dsit.pmfinal;
}