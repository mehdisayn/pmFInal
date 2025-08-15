module dsit.pmfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.unsupported.desktop;


    opens dsit.pmfinal.rrhin.customer.Controller to javafx.fxml; // rahin's customer controllers
    opens dsit.pmfinal.rrhin.accountant.Controller to javafx.fxml; // rahin's accountant controllers
    //chtgpt sugg
    opens dsit.pmfinal.meddy.ceo.model to javafx.base, javafx.fxml;
    opens dsit.pmfinal.meddy.ceo.controller to javafx.fxml;  // Meddy's ceo controllers
    opens dsit.pmfinal.meddy.factoryManager to javafx.fxml, javafx.controls; // Meddy's factory manager controllers



    //opens dsit.pmfinal.rrhin.Controller to javafx.graphics , javafx.fxml;

    opens dsit.pmfinal to javafx.fxml, javafx.graphics;

    exports dsit.pmfinal;
    exports dsit.pmfinal.rrhin.customer.Controller;
    exports dsit.pmfinal.rrhin.accountant.Controller;
    exports dsit.pmfinal.meddy.ceo.controller;
    exports dsit.pmfinal.meddy.factoryManager;
    //package dsit.pmfinal.rrhin.accountant.Controller;

}