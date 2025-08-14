package dsit.pmfinal.rrhin.customer.model;

import dsit.pmfinal.model.User;

import java.util.Random;

public class Customer extends User {

    private String address;
    private String username;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Customer(String name, String phone, String email, String password, String address, String username) {
        super(name, phone, email, password);
        this.setId(this.generateId());
        this.address = address;
        this.username = username;
    }


    @Override
    public boolean login() {
        return false;
    }

    @Override
    public String generateId() {
        String id = "";

        Random random = new Random();
        id = Integer.toString(random.nextInt(1, 9999));

        return id;
    }


}
