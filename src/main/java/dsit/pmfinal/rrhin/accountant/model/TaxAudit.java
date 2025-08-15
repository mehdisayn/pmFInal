package dsit.pmfinal.rrhin.accountant.model;

public class TaxAudit {
    private String taxAndAudit;

    public TaxAudit(String taxAndAudit) {
        this.taxAndAudit = taxAndAudit;
    }

    public String getTaxAndAudit() {
        return taxAndAudit;
    }

    public void setTaxAndAudit(String taxAndAudit) {
        this.taxAndAudit = taxAndAudit;
    }

    @Override
    public String toString() {
        return "TaxAudit{" +
                "taxAndAudit='" + taxAndAudit + '\'' +
                '}';
    }
}
