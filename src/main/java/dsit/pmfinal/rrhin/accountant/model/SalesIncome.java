package dsit.pmfinal.rrhin.accountant.model;

import java.time.LocalDate;

public class SalesIncome {
    private LocalDate saleDate;
    private double amount;
    private String clientName;

    public SalesIncome(LocalDate saleDate, double amount, String clientName) {
        this.saleDate = saleDate;
        this.amount = amount;
        this.clientName = clientName;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "SalesIncome{" +
                "saleDate=" + saleDate +
                ", amount='" + amount + '\'' +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
