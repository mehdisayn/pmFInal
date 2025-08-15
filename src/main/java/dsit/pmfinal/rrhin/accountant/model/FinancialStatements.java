package dsit.pmfinal.rrhin.accountant.model;

public class FinancialStatements {
    private String period;
    private String statementType;

    public FinancialStatements(String period, String statementType) {
        this.period = period;
        this.statementType = statementType;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    @Override
    public String toString() {
        return "FinancialStatements{" +
                "period='" + period + '\'' +
                ", statementType='" + statementType + '\'' +
                '}';
    }
}
