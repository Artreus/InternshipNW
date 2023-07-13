package Homework;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Service {
    public static Scanner cin = new Scanner(System.in);

    public Person[] initStudent(Person[] people, int studentLength) {
        ArrayList<Subjects> subjects = new ArrayList<>();

        subjects.set(0, new Subjects("Math", 0d, ""));
        subjects.set(1, new Subjects("English", 0d, ""));
        subjects.set(2, new Subjects("Chemistry", 0d, ""));
        subjects.set(3, new Subjects("Biology", 0d, ""));
        subjects.set(4, new Subjects("Physics", 0d, ""));

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

            ((Student) people[i]).setSubjects(subjects);
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
    } // Constructors for students and teachers (maybe)

    public Person lookUpStudent() {
        Person[] students = initPeople(1);
        Person student = null;
        String studentID;

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

    public void menu() {
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

    public double studentAverageGrade(Person student, int choice) {
        if(choice == 1) {
            student = lookUpStudent();
        }


        ArrayList<Subjects> subjects;

        double studentAverageGrade = 0d;
        int gradeSubjectCount, noGradeSubjectCount = 0;

        subjects = ((Student) student).getSubjects();

        for(int i = 0; i < ((Student)student).getSubjects().size(); i++) {
            if(subjects.get(i).subjectGrade == 0d) noGradeSubjectCount++;
        }

        if(noGradeSubjectCount >= 5) {
            System.out.print("Student ->" + student.getName() + ", " + student.getID() + " has no grades.");
        }
        else {
            for(int k = 0; k < ((Student)student).getSubjects().size(); k++) {
                studentAverageGrade += ((Student) student).getSubjects().get(k).subjectGrade;
            }

            gradeSubjectCount = ((Student) student).getSubjects().size() - noGradeSubjectCount;


            studentAverageGrade /= gradeSubjectCount;
        }

        return studentAverageGrade;
    }

    public double classAverageGrade() {
        Person[] students = initPeople(1);

        double classAverageGrade = 0d;
        int classStudentAmount = 0;

        String classChoice;

        System.out.print("Enter a class: ");
        classChoice = cin.next();

        for(int i = 0; i < students.length; i++) {
            if(((Student)students[i]).getClas().equals(classChoice)) {
                classStudentAmount++;
            }
        }

        if(classStudentAmount <= 0) {
            System.out.print("Invalid Input! No such class exists.");
            classAverageGrade();
        }

        for(int k = 0; k < students.length; k++) {
            if(((Student)students[k]).getClas().equals(classChoice)) {
                classAverageGrade += studentAverageGrade(students[k], 2);
            }
        }

        classAverageGrade /= classStudentAmount;

        return classAverageGrade;
    }

    public String highestGradeInSubject(int choice) {
        Person[] students = initPeople(1);

        double subjectMaxGrade = 0d;
        int subjectChoice;
        String subjectChoiceName = "";
        String subjectTeacherName = "";

        System.out.println("Choose a subject");
        System.out.println("----------------");

        System.out.print("\n");

        System.out.println("1. Math\n2. English\n3. Chemistry\n4. Biology\n 5. Physics");

        System.out.print("\n");

        System.out.print(">>> ");
        subjectChoice = cin.nextInt();

        if(subjectChoice <= 0 || subjectChoice >= 6) {
            System.out.println("Invalid Input! No such subject exists.");
            highestGradeInSubject(1);
        }

        for(int i = 0; i < students.length; i++) {
            if(subjectMaxGrade <= ((Student) students[i]).getSubjects().get(subjectChoice).subjectGrade) {
                subjectMaxGrade = ((Student) students[i]).getSubjects().get(subjectChoice).subjectGrade;
                subjectTeacherName = ((Student) students[i]).getSubjects().get(subjectChoice).subjectTeacher;
            }
        }

        for(int k = 0; k < students.length; k++) {
            subjectChoiceName = ((Student) students[k]).getSubjects().get(subjectChoice).subjectName;
        }

        if(choice == 1) {
            return String.valueOf(subjectMaxGrade);
        }
        else {
            return subjectTeacherName;
        }
    }

    public String highestGradeSigningTeacher() {
        return highestGradeInSubject(2);
    }

    public void studentMenu(int choice) {
        switch (choice) {
            case 1:
        }
    }

    public Person lookUpTeacher() {
        Person[] teachers = initPeople(1);
        Person teacher = null;
        String teacherID;

        System.out.print("Enter a student's ID: ");
        teacherID = cin.next();

        for(int i = 0; i < teachers.length; i++) {
            if(teachers[i].getID().equals(teacherID)) {
                teacher = teachers[i];
                break;
            }
        }

        return teacher;
    }

    public void assignGrade() {
        Person student = lookUpStudent();
        Person teacher = lookUpTeacher();

        ArrayList<Subjects> subjects;

        int subjectChoice;
        double grade;

        subjects = ((Student) student).getSubjects();

        System.out.println("Choose a subject");
        System.out.println("----------------");

        System.out.print("\n");

        for(int i = 0; i < subjects.size(); i++) {
           System.out.println(i++ + ". " + subjects.get(i));
        }

        System.out.print("\n");

        System.out.print(">>> ");
        subjectChoice = cin.nextInt();

        if(subjectChoice <= 0 || subjectChoice >= 6) {
           System.out.println("Invalid Input! No such subject exists.");
           assignGrade();
        }

        System.out.print("Enter a grade for the subject: ");
        grade = cin.nextDouble();

        if(grade <= 1 || grade >= 7) {
           System.out.println("Invalid Input! No such grade exists. Grade marks must be in the range of 2 to 6.");
           assignGrade();
        }

        subjects.set(subjectChoice, new Subjects(subjects.get(subjectChoice).subjectName, grade, teacher.getName()));

        ((Student) student).setSubjects(subjects);
    }
}
