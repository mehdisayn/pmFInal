package dsit.pmfinal.rrhin.accountant.model;

public class PurchaseApprovals {
    private String purchaseApproval;

    public PurchaseApprovals(String purchaseApproval) {
        this.purchaseApproval = purchaseApproval;
    }

    public String getPurchaseApproval() {
        return purchaseApproval;
    }

    public void setPurchaseApproval(String purchaseApproval) {
        this.purchaseApproval = purchaseApproval;
    }

    @Override
    public String toString() {
        return "PurchaseApprovals{" +
                "purchaseApproval='" + purchaseApproval + '\'' +
                '}';
    }
}
