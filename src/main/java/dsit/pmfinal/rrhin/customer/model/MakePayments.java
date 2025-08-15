package dsit.pmfinal.rrhin.customer.model;

public class MakePayments {
    private String transactionId;
    private String paymentMethod;

    public MakePayments(String transactionId, String paymentMethod) {
        this.transactionId = transactionId;
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "MakePayments{" +
                "transactionId='" + transactionId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
