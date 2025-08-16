package dsit.pmfinal.rrhin.accountant.model;

public class InventoryValuation {
    private String inventoryValuation;
    private String itemName;
    private int quantity;
    private double unitPrice;
    private double totalvalue;

    public InventoryValuation(String inventoryValuation) {
        this.itemName = itemName;
        this.inventoryValuation = inventoryValuation;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalvalue = totalvalue;
    }

    public InventoryValuation(String desk, int i, double v, double v1) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalvalue = totalvalue;
    }

    public String getInventoryValuation() {
        return inventoryValuation;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setInventoryValuation(String inventoryValuation) {
        this.inventoryValuation = inventoryValuation;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "InventoryValuation{" +
                "inventoryValuation='" + inventoryValuation + '\'' +
                '}';
    }

    public double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(double totalvalue) {
        this.totalvalue = totalvalue;
    }
}
