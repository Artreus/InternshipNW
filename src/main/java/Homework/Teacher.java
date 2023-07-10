package Homework;

import java.util.ArrayList;

public class Teacher extends Person {
    // Fields
    private String school;
    private ArrayList<Subjects> subjects;
    private String salary;

    // Constructor
    public Teacher(String aName, String aGender, String aID, String aSchool, ArrayList<Subjects> aSubjects, String aSalary) {
        super(aName, aGender, aID);

        this.school = aSchool;
        this.subjects = aSubjects;
        this.salary = aSalary;
    }

    // Getters
    public String getSchool() {
        return school;
    }

    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }

    public String getSalary() {
        return salary;
    }

    // Setters
    public void setSchool(String value) {
        this.school = value;
    }

    public void setSubjects(ArrayList<Subjects> value) {
        this.subjects = value;
    }

    public void setSalary(String value) {
        this.salary = value;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nGender: " + this.getGender() + "\nID: " + this.getID() +
                "\nSalary: " + this.getSalary();
    }
}
