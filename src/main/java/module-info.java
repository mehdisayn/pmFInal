module dsit.pmfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens dsit.pmfinal.rrhin.Controller to javafx.fxml;
    //chtgpt sugg
    opens dsit.pmfinal to javafx.graphics;
    //opens dsit.pmfinal.rrhin.Controller to javafx.graphics , javafx.fxml;

    exports dsit.pmfinal;
    exports dsit.pmfinal.rrhin.Controller;
}