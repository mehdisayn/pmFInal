package dsit.pmfinal.rrhin.accountant.model;

import java.time.LocalDate;

public class Expenses {
    private LocalDate date;
    private int amount;
    private String category;

    public Expenses(LocalDate date, int amount, String category) {
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "date=" + date +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}
