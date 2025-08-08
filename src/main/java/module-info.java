module dsit.pmfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens dsit.pmfinal.rrhin.Controller to javafx.fxml; // rahim's controllers
    //chtgpt sugg
    opens dsit.pmfinal.meddy.ceo.controller to javafx.fxml;  // Meddy's controllers

    //opens dsit.pmfinal.rrhin.Controller to javafx.graphics , javafx.fxml;

    opens dsit.pmfinal to javafx.fxml, javafx.graphics;

    exports dsit.pmfinal;
    exports dsit.pmfinal.rrhin.Controller;
    exports dsit.pmfinal.meddy.ceo.controller;

}