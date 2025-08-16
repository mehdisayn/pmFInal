package dsit.pmfinal.meddy.ceo.model;

public class Straregy {
    String quarter;
    String strategyName;
    String description;
    String status;
    String ceoId;


    public Straregy(String quarter, String strategyName, String description, String status, String ceoId) {
        this.quarter = quarter;
        this.strategyName = strategyName;
        this.description = description;
        this.status = status;
        this.ceoId = ceoId;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCeoId() {
        return ceoId;
    }

    public void setCeoId(String ceoId) {
        this.ceoId = ceoId;
    }

    @Override
    public String toString() {
        return "Straregy{" +
                "quarter='" + quarter + '\'' +
                ", strategyName='" + strategyName + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", ceoId='" + ceoId + '\'' +
                '}';
    }
}
