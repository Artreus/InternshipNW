package Day7;

import Homework.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);

    public static void coutArr(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void error() {
        System.out.println("error");
    }

    public static void main(String[] args) {
        String mathEquation;

        List<String> mathEquationList = new ArrayList<String>();

        ArrayList<String> mathAllowed =new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "+", "plus", "-", "minus", ".", "*", "times", ":", "/", "divide by", ",", "(", ")", "="));

        System.out.print("Enter your equation: ");
        mathEquation = cin.nextLine();

        mathEquationList = Arrays.asList(mathEquation.split(" "));

        for(int i = 0; i < mathEquationList.size(); i++) {
            for(int j = 0; j < mathAllowed.size(); j++) {
                if(mathAllowed.contains(mathEquationList.get(j))) {
                    System.out.println("0");
                    break;
                }
                else {
                    error();
                    break;
                }
            }
        }

        double sideOne, sideTwo;

        // "1", "+", "2"

        for (int k = 0; k < mathEquationList.size(); k++) {

        }

    }
}
