package dsit.pmfinal.rrhin.customer.model;

public class TrackOrder {
    private String orderDescription;

    public TrackOrder(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    @Override
    public String toString() {
        return "TrackOrder{" +
                "orderDescription='" + orderDescription + '\'' +
                '}';
    }
}
