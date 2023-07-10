package Homework;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public static Scanner cin = new Scanner(System.in);

    public Person[] initStudent(Person[] people, int studentLength) {
        for (int i = 0; i < studentLength; i++) {
            System.out.println("Student #" + i);
            System.out.println("-----------");

            System.out.print("\n");

            System.out.print("Enter a name: ");
            people[i].setName(cin.next());

            System.out.println("Enter a gender: ");
            people[i].setGender(cin.next());

            System.out.print("Enter an ID: ");
            people[i].setID(cin.next());

            System.out.print("Enter a class: ");
            ((Student) people[i]).setClas(cin.next());

            System.out.print("Enter a number in class: ");
            ((Student) people[i]).setNumberInClass(cin.next());
        }

        return people;
    }

    public Person[] intiTeacher(Person[] people, int studentLength) {
        for (int k = studentLength; k < studentLength; k++) {
            System.out.println("Teacher #" + k);
            System.out.println("-----------");

            System.out.print("\n");

            System.out.print("Enter a name: ");
            people[k].setName(cin.next());

            System.out.println("Enter a gender: ");
            people[k].setGender(cin.next());

            System.out.print("Enter an ID: ");
            people[k].setID(cin.next());

            System.out.print("Enter a school: ");
            ((Teacher) people[k]).setSchool(cin.next());

            System.out.print("Enter a salary: ");
            ((Teacher) people[k]).setSalary(cin.next());
        }

        return people;
    }

    public Person[] initPeople(int choice) {
        Person[] people;

        int[] amountOfPeople = new int[2];

        System.out.print("Enter the number of students: ");
        amountOfPeople[0] = cin.nextInt();

        System.out.print("Enter the number of teachers: ");
        amountOfPeople[1] = cin.nextInt();

        if (amountOfPeople[0] <= 0 || amountOfPeople[1] <= 0) {
            System.out.println("Invalid Input! You must enter at least one student and one teacher.");
            initPeople(0);
        }

        people = new Person[amountOfPeople[0] + amountOfPeople[1]];

        Person[] students = initStudent(people, amountOfPeople[0]);
        Person[] teachers = intiTeacher(people, amountOfPeople[1]);

        switch (choice) {
            case 1:
                return students;

            case 2:
                return teachers;

            default: return null;
        }
    }

    public Person lookUpStudent() {
        Person[] students = initPeople(1);
        Person student = null;
        String studentID;
        double studentMinGrade = 0d;

        System.out.print("Enter a student's ID: ");
        studentID = cin.next();

        for(int i = 0; i < students.length; i++) {
            if(students[i].getID().equals(studentID)) {
                student = students[i];
                break;
            }
        }

        return student;
    }

    public void getStudentInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    public void getTeacherInfo(Teacher[] teachers) {
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i].toString());
        }
    }

    public void menu(Person[] per) {
        int choice;

        System.out.println("1. Print student's information");
        System.out.println("2. Print teacher's information");
        System.out.println("3. Print highest student's grade for given subject");
        System.out.println("4. Print lowest student's grade for given subject");
        System.out.println("5. Print highest teacher's salary");
        System.out.println("6. Print average student's grade for all subjects");
        System.out.println("7. Print average class' grade for all subjects");
        System.out.println("8. Print the highest grade for a given subject");
        System.out.println("9. Print the highest marking teacher for all subjects");

        System.out.println(">>> ");
        choice = cin.nextInt();

        switch (choice) {
            case 1:
                getStudentInfo((Student[]) initPeople(1));
                break;
            case 2:
                getTeacherInfo((Teacher[]) initPeople(2));
                break;
        }
    }

    public double studentHighestGrade() {
        Person student = lookUpStudent();
        double studentMaxGrade = 0d;

        for(int k = 0; k < ((Student)student).getSubjects().size(); k++) {
            if(((Student) student).getSubjects().get(k).subjectGrade > studentMaxGrade) {
                studentMaxGrade = ((Student) student).getSubjects().get(k).subjectGrade;
            }
        }

        return studentMaxGrade;
    }

    public double studentLowestGrade() {
        Person student = lookUpStudent();
        double studentMinGrade = 0d;

        for(int k = 0; k < ((Student)student).getSubjects().size(); k++) {
            if(((Student) student).getSubjects().get(k).subjectGrade < studentMinGrade) {
                studentMinGrade = ((Student) student).getSubjects().get(k).subjectGrade;
            }
        }

        return studentMinGrade;
    }

    public double teacherAverageSalary() {
        Person[] teachers = initPeople(2);
        double averageSalary = 0d;

        for(int i = 0; i < teachers.length; i++) {
            averageSalary += Double.parseDouble(((Teacher) teachers[i]).getSalary());
        }

        averageSalary /= teachers.length;

        return averageSalary;
    }

    public void studentAverageGrade() {
        Person student = lookUpStudent();



    }

    public void studentFunc(int choice) {
        switch (choice) {
            case 1:
        }
    }

    public void assignGrades(Person[] people) {
    }
}
