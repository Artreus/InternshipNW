package org.example;

import internship_day2.User;


import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("");
    }

    public static void main(String[] args) {

        /*
        // Задача 5
        Scanner cin = new Scanner(System.in);

        int dayChoice;
        String[] weekDay = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        while(true) {
            System.out.print("Enter the number of the day: "); dayChoice = cin.nextInt();

            if(dayChoice <= 0 || dayChoice >= 8) {
                System.out.println("Invalid Input!");

                cin.next();
            }
            else {
                System.out.println(weekDay[dayChoice] + "\n");
            }
        }

         */
















        /*
        // Задача 4
        Scanner cin = new Scanner(System.in);

        float weight;
        String type = "";

        while(true) {
            System.out.print("Enter your weight: ");

            weight = cin.nextFloat();

            if(weight <= 0) {
                System.out.println("Invalid Input!");

                cin.nextFloat();
            }
            else {
                if(weight >= 50 && weight <= 70) type = "skinny";
                else if(weight >= 71 && weight <= 90) type = "skinny fat";
                else if(weight >= 90 && weight <= 110) type = "obese";
                else if(weight >= 111) type = "extra obese";
                else type = "extra skinny";
            }

            System.out.println("You are " + type + ".\n");
        }
        */













        /*
        // Задача 3

        Scanner cin = new Scanner(System.in);

        String word = "";

        while(true) {
            
            System.out.print("Enter a word: ");

            try {
                word = cin.next();

            } 
            catch (Exception e) {
                System.out.println("Invalid Input! Please try again!");

                cin.next();
            }

            System.out.println(String.join("\n", word.split("")));

            System.out.print("\n");
        }
*/















        /*
        // Задача 2
        Scanner cin = new Scanner(System.in);

        String name;
        int password;
        int accAmount;

        while(true) {
            System.out.println("How many accounts do you want to create: ");

            try {
                accAmount = cin.nextInt();
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid Input!");
                cin.next();
            }
        }

        User[] users = new User[accAmount];

        for(int i = 0; i < users.length; i++) {
            System.out.println("Enter user #" + i + "'s name: ");
            name = cin.next();

            System.out.println("Enter user #" + i + "'s password: ");
            password = cin.nextInt();

            users[i] = new User(name, password, i);
        }

        boolean hasLoggedSuccessfully = false;

        while(true){
            System.out.println("Enter a name: "); name = cin.next();
            System.out.println("Enter a password: "); password = cin.nextInt();

            for(int i = 0; i < users.length; i++) {

                User user = users[i];
                if(user.getName().equals(name) && user.getPassword() == password) {
                    System.out.println("Successful login! Welcome " + user.getName());
                    hasLoggedSuccessfully = true;
                }
            }

            if(!hasLoggedSuccessfully) {
                System.out.println("ERROR! Login has not been successful!");

                System.out.println("Enter a name: "); name = cin.next();
                System.out.println("Enter a password: "); password = cin.nextInt();
            }
        }

         */
    }
}