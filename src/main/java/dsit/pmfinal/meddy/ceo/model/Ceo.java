package dsit.pmfinal.meddy.ceo.model;

import dsit.pmfinal.model.User;

public class Ceo extends User {

    public Ceo(String name, String phone, String email, String password) {
        super(name, phone, email, password);

        this.setId(this.generateId());

    }

    @Override
    public String generateId() {
        String id = "ceoo";

        return id;
    }
}
