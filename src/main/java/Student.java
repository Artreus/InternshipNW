package Homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person {
    // Fields
    private String clas;
    private String numberInClass;
    private ArrayList<Subjects> subjects;
    private double grade;

    // Constructor
    public Student(String aName, String aGender, String aID, String aClas, String aNumberInClass, ArrayList<Subjects> aSubjects, double aGrade) {
        super(aName, aGender, aID);

        this.clas = aClas;
        this.numberInClass = aNumberInClass;
        this.subjects = aSubjects;
        this.grade = aGrade;
    }

    // Getters
    public String getClas() {
        return clas;
    }

    public String getNumberInClass() {
        return numberInClass;
    }

    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setClas(String value) {
        this.clas = value;
    }


    public void setNumberInClass(String value) {
        this.numberInClass = value;
    }

    public void setSubjects(ArrayList<Subjects> value) {
        this.subjects = value;
    }

    public void setGrade(double value) {
        this.grade = value;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nGender: " + this.getGender() + "\nID: " + this.getID() +
                "\nClass: " + this.getClas() + "\nClass number: " + this.getNumberInClass() +
                "\nSubjects: " + this.getSubjects(); /* + "Grades:"this.getGrade(); */
    }
}
