package internship_day2;

public class User {
    private String name;
    private int password;

    private int ID;

    public String getName() {
        return this.name;
    }

    public void setName(String sName) {
        this.name = sName;
    }

    public int getPassword() {
        return this.password;
    }

    public void setPassword(int sPassword) {
        this.password = sPassword;
    }

    public void setID (int aID) {
        this.ID = aID;
    }

    public int getID () {
        return this.ID;
    }

    public User(String aName, int aPassword, int aID) {
        setName(aName);
        setPassword(aPassword);
        setID(aID);
    }

}
