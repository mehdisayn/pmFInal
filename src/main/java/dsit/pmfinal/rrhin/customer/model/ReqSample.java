package dsit.pmfinal.rrhin.customer.model;

public class ReqSample {
    private String address;
    private String quality;
    private String type;

    public ReqSample(String address, String quality, String type) {
        this.address = address;
        this.quality = quality;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ReqSample{" +
                "address='" + address + '\'' +
                ", quality='" + quality + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
