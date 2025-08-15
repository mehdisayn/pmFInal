package dsit.pmfinal.rrhin.customer.model;

public class SubmitComplaint {
    private String type;
    private String complaintDetails;
    private String order;

    public SubmitComplaint(String type, String complaintDetails, String order) {
        this.type = type;
        this.complaintDetails = complaintDetails;
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "SubmitComplaint{" +
                "type='" + type + '\'' +
                ", complaintDetails='" + complaintDetails + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
