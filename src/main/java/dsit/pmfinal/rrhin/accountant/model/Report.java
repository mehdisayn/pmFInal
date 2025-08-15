package dsit.pmfinal.rrhin.accountant.model;

public class Report {
    private String year;
    private String month;
    private String summary;

    public Report(String year, String month, String summary) {
        this.year = year;
        this.month = month;
        this.summary = summary;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Report{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
