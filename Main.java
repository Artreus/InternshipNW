package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner cin = new Scanner(System.in);

    public static void line(int n) {
        for(int i = 0; i <= n; i++) {
            System.out.print("\n");
        }
    }

    public static int[] arrayInit() {
        int arrLimit;
        int[] arr;

        System.out.print("Enter the array's length: "); arrLimit = cin.nextInt();

        if(arrLimit <= 0) { System.out.println("Invalid Input!"); arrayInit(); }

        arr = new int[arrLimit];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter an element: "); arr[i] = cin.nextInt();
        }

        return arr;
    }

    public static void wordAChecker() {
        String[] wordList = {"алфа", "аватар", "беда", "бреза", "салон"};

        for(int i = 0; i < wordList.length; i++) {
            if(wordList[i].toLowerCase().startsWith("а") || wordList[i].toLowerCase().startsWith("a")) {
                System.out.println(wordList[i]);
            }
        }

        cin.next();
        line(100);
        menu();
    }

    public static void sumArray(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum is: " + sum);

        cin.next();
        line(100);
        menu();
    }

    public static void wordListChecker() {
        String word = "";
        ArrayList<String> wordList = new ArrayList<>();

        while(!(String.valueOf(word)).equals("#")) {
            for(int i = 0; i < 4; i++) {
                System.out.print("Enter a word: "); word = cin.next();

                if(word.equals("#")) break;
                else wordList.add(word);

                if(wordList.get(i).length() < 4) {
                    wordList.set(i, "");
                }
            }

            System.out.println("Word list: ");

            for(int k = 0; k < wordList.size(); k++) {
                System.out.println(wordList.get(k));
            }
        }

        cin.next();
        line(100);
        menu();
    }

    public static void menu() {
        int choice;

        System.out.println("List\n----");

        System.out.println("1. A-words checker");
        System.out.println("2. Sum of an array");
        System.out.println("3. Word list checker");

        System.out.print("\n>>> "); choice = cin.nextInt();

        switch (choice) {
            case 1: wordAChecker(); break;
            case 2: sumArray(arrayInit()); break;
            case 3: wordListChecker(); break;
            default: { System.out.println("invalid Input!"); line(100); menu(); break; }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}