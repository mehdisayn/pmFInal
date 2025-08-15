package dsit.pmfinal.rrhin.customer.model;

import java.io.Serializable;
import java.time.LocalDate;

public class PlaceOrder implements Serializable {
    private LocalDate deliveryDate;
    private String productType;
    private String size;
    private int quantity;
    private String deliveryAddress;

    public PlaceOrder(LocalDate deliveryDate, String productType, String size, int quantity, String deliveryAddress) {
        this.deliveryDate = deliveryDate;
        this.productType = productType;
        this.size = size;
        this.quantity = quantity;
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "deliveryDate=" + deliveryDate +
                ", productType='" + productType + '\'' +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
