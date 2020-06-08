package opational;

public class User {
    private String name;
    private int ages;
    private String address;

    public User() {
    }

    public User(String name, int ages, String address) {
        this.name = name;
        this.ages = ages;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
