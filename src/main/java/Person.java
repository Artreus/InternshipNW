package Homework;

public abstract class Person {
    private String name;
    private String gender;

    private String ID;

    public Person(String aName, String aGender, String aID) {
        this.name = aName;
        this.gender = aGender;
        this.ID = aID;
    }

    public abstract String toString();

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setGender(String value) {
        this.gender = value;
    }

    public void setID(String value) {
        this.ID = value;
    }
}
