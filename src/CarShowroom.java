public class CarShowroom {
    private String name;
    private String address;
    private int commission;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCommission() {
        return commission;
    }

    public CarShowroom(String name, String address, int commission) {
        this.name = name;
        this.address = address;
        this.commission = commission;

    }
}
