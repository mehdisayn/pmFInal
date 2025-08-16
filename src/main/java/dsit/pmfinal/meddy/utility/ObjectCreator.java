package dsit.pmfinal.meddy.utility;

import dsit.pmfinal.meddy.ceo.model.Ceo;

import java.sql.SQLOutput;

public class ObjectCreator {
    public static void main(String[] args) {
        // Create object of Users
        Ceo ceo = new Ceo("Shah Kabir", "0147457564", "skabir@ceo.pfpp.bd", "1234");
        System.out.println("Ceo Object Created: " + ceo.getName() + ", " + ceo.getPhone() + ", " + ceo.getEmail());
        System.out.println("Generated ID: " + ceo.getId());
        System.out.println("Password: " + ceo.getPassword());





    }
}
