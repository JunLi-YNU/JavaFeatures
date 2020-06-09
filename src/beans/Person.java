package beans;

public class Person {
    private String name;
    private int ages;
    private String  gender;

    public Person() {
    }

    public Person(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }

    public Person(String name, int ages, String gender) {
        this.name = name;
        this.ages = ages;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
