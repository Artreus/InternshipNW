package Homework;

import java.util.Scanner;

public class Homework_Day3 {

    public static Scanner cin = new Scanner(System.in);

    public static void line(int n) {
        for(int i = 0; i <= n; i++) {
            System.out.print("\n");
        }
    }

    public static void clear() {
        cin.nextLine();
        line(100);
        menu();
    }

    public static void minNum (int numOne, int numTwo, int numThree) {
        int min = 0;

        if(numOne < numTwo && numOne < numThree) min = numOne;
        else if(numTwo < numOne && numTwo < numThree) min = numTwo;
        else if(numThree < numOne && numThree < numTwo) min = numThree;
        else min = numOne;

        System.out.println("Minimal number: " + min);

        clear();
    }

    public static boolean numCheck(int num) {
        return num % 2 == 0;
    }

    public static void numCin(int choice) {
        int num1, num2, num3;

        switch (choice) {
            case 1: {
                System.out.print("Enter the first number: "); num1 = cin.nextInt();
                System.out.print("Enter the second number: "); num2 = cin.nextInt();
                System.out.print("Enter the third number: "); num3 = cin.nextInt();

                minNum(num1, num2, num3);

                break;
            }

            case 2: {
                System.out.println("Enter a number: "); num1 = cin.nextInt();

                numCheck(num1);

                break;
            }
        }
    }


    public static void menu() {
        int choice;

        System.out.println("List\n----");

        System.out.println("1. Minimal number");
        System.out.println("2. Number check");

        System.out.print("\n>>> "); choice = cin.nextInt();

        switch (choice) {
            case 1: numCin(1); break;
            case 2: numCin(2); break;
            default: { System.out.println("Invalid Input!"); clear(); break; }
        }
    }

    public static void main (String[] args) {
        menu();
    }
}
