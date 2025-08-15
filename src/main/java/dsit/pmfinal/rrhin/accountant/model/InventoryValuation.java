package dsit.pmfinal.rrhin.accountant.model;

public class InventoryValuation {
    private String inventoryValuation;

    public InventoryValuation(String inventoryValuation) {
        this.inventoryValuation = inventoryValuation;
    }

    public String getInventoryValuation() {
        return inventoryValuation;
    }

    public void setInventoryValuation(String inventoryValuation) {
        this.inventoryValuation = inventoryValuation;
    }

    @Override
    public String toString() {
        return "InventoryValuation{" +
                "inventoryValuation='" + inventoryValuation + '\'' +
                '}';
    }
}
