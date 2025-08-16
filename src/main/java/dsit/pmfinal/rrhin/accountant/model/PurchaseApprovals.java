package dsit.pmfinal.rrhin.accountant.model;

public class PurchaseApprovals {
    private int requestID;
    private String purchaseApproval;
    private String itemName;
    private String department;
    private double amount;
    private String status;

    public PurchaseApprovals(int requestID, String purchaseApproval, String itemName, String department, double amount, String status) {
        this.requestID = requestID;
        this.purchaseApproval = purchaseApproval;
        this.itemName = itemName;
        this.department = department;
        this.amount = amount;
        this.status = status;
    }

    public PurchaseApprovals(int requestID, String pending, String laptop, String it, double amount) {
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getPurchaseApproval() {
        return purchaseApproval;
    }

    public void setPurchaseApproval(String purchaseApproval) {
        this.purchaseApproval = purchaseApproval;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PurchaseApprovals{" +
                "requestID=" + requestID +
                ", purchaseApproval='" + purchaseApproval + '\'' +
                ", itemName='" + itemName + '\'' +
                ", department='" + department + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
