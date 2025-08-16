package dsit.pmfinal.rrhin.accountant.model;

public class TaxAudit {
    private double amount;
    private String status;
    private String taxType;

    // Constructor
    public TaxAudit(double amount, String status, String taxType) {
        this.amount = amount;
        this.status = status;
        this.taxType = taxType;
    }

    // Getters and Setters
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTaxType() { return taxType; }
    public void setTaxType(String taxType) { this.taxType = taxType; }

    @Override
    public String toString() {
        return "TaxAudit{" +
                "amount=" + amount +
                ", status='" + status + '\'' +
                ", taxType='" + taxType + '\'' +
                '}';
    }
}
