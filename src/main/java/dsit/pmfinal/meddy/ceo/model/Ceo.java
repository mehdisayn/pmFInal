package dsit.pmfinal.meddy.ceo.model;

import dsit.pmfinal.model.User;

import java.util.List;
import java.util.Map;

public class Ceo extends User {

    // Constructor

    public Ceo(String name, String phone, String email, String password) {
        super(name, phone, email, password);
        this.setId(this.generateId());
    }


    @Override
    public String generateId() {
        String id = "ceo";

        return id;
    }

    public Budget budgetApproval(Budget budget, String status) {
        budget.setStatus(status);
        return budget;

    }


}
