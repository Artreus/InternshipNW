package org.example;

import internship_day2.User;
import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);

    public static void line(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("\n");
        }
    }

    public static void weekDayChecker() {
        int dayChoice;
        String[] weekDay = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        while (!(cin.next().equals("#"))) {
            System.out.print("Enter the number of the day: ");
            dayChoice = cin.nextInt();

            if (dayChoice <= 0 || dayChoice >= 8) {
                System.out.println("Invalid Input!");

                weekDayChecker();
            } else {
                System.out.println(weekDay[dayChoice] + "\n");

                System.out.println("Enter # to exit.");

                System.out.println("\n");
            }
        }

        line(100);
        menu();
    }

    public static void accountCreation() {
        String name;
        int password;
        int accAmount;

        while (true) {
            System.out.println("How many accounts do you want to create: ");

            try {
                accAmount = cin.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!");
                cin.next();
            }
        }

        User[] users = new User[accAmount];

        for (int i = 0; i < users.length; i++) {
            System.out.println("Enter user #" + i + "'s name: ");
            name = cin.next();

            System.out.println("Enter user #" + i + "'s password: ");
            password = cin.nextInt();

            users[i] = new User(name, password, i);
        }

        boolean hasLoggedSuccessfully = false;

        while (!cin.next().equals("#")) {
            System.out.println("Enter a name: ");
            name = cin.next();
            System.out.println("Enter a password: ");
            password = cin.nextInt();

            for (int i = 0; i < users.length; i++) {
                User user = users[i];

                if (user.getName().equals(name) && user.getPassword() == password) {
                    System.out.println("Successful login! Welcome " + user.getName());
                    hasLoggedSuccessfully = true;
                }
            }

            if (!hasLoggedSuccessfully) {
                System.out.println("ERROR! Login has not been successful!");

                System.out.println("Enter a name: ");
                name = cin.next();

                System.out.println("Enter a password: ");
                password = cin.nextInt();
            }

            System.out.println("Enter # to exit.");
        }

        line(100);
        menu();
    }

    public static void wordSplit() {
        String word = "";

        while (!cin.next().equals("#")) {
            System.out.print("Enter a word: ");

            try {
                word = cin.next();
            } catch (Exception e) {
                System.out.println("Invalid Input! Please try again!");

                cin.next();
            }

            System.out.println(String.join("\n", word.split("")) + "\n");

            System.out.println("Enter # to exit.");

            System.out.println("\n");
        }

        line(100);
        menu();
    }

    public static void weightChecker() {
        float weight;
        String type = "";

        while (!cin.next().equals("#")) {
            System.out.print("Enter your weight: ");

            weight = cin.nextFloat();

            if (weight <= 0) {
                System.out.println("Invalid Input!");

                cin.nextFloat();
            } else {
                if (weight >= 50 && weight <= 70) {
                    type = "skinny";
                } else if (weight >= 71 && weight <= 90) {
                    type = "skinny fat";
                } else if (weight >= 90 && weight <= 110) {
                    type = "obese";
                } else if (weight >= 111) {
                    type = "extra obese";
                } else {
                    type = "extra skinny";
                }
            }

            System.out.println("You are " + type + ".\n");

            System.out.println("Enter # to exit.");

            System.out.println("\n");
        }

        line(100);
        menu();
    }

    public static void weekDayOutput() {
        String[] weekDay = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        while (!cin.next().equals("#")) {
            for (int i = 0; i < weekDay.length; i++) {
                System.out.println(weekDay[i]);
            }

            System.out.println("Enter # to exit.");

            System.out.println("\n");
        }

        line(100);
        menu();
    }

    public static void menu() {
        int choice;

        System.out.println("List\n----");
        System.out.println("1. Week day checker");
        System.out.println("2. Account creation");
        System.out.println("3. Word split");
        System.out.println("4. Weight checker");
        System.out.println("5. Week day output");

        System.out.print("\n>>> ");
        choice = cin.nextInt();

        switch (choice) {
            case 1: {
                weekDayChecker();
                break;
            }
            case 2: {
                accountCreation();
                break;
            }
            case 3: {
                wordSplit();
                break;
            }
            case 4: {
                weightChecker();
                break;
            }
            case 5: {
                weekDayOutput();
                break;
            }
            default: {
                System.out.println("Invalid Input!\n");

                line(100);
                menu();
                break;
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}