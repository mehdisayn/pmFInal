package dsit.pmfinal.meddy.factoryManager.model;

import dsit.pmfinal.model.User;

public class FactoryManager extends User {
    public FactoryManager(String name, String phone, String email, String password) {
        super(name, phone, email, password);
        this.setId(this.generateId());
    }



    @Override
    public String generateId() {
        return "facman";

    }
}
