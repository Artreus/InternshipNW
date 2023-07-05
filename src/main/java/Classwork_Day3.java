import org.example.Main.*;
import internship_day2.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Classwork_Day3 {

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

    public static void arrayNumCheck() {
        int[] arr = {10, 2, -1, 1, 5, 9, 7, 6, 5, -5};
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) System.out.println(arr[i]);
            if(arr[i] < 0) System.out.println(arr[i]);
            if(arr[i] % 2 != 0) System.out.println(arr[i]);
            if(arr[i] % 2 == 0) System.out.println(arr[i]);
            if(arr[i] == 5) cnt++;
        }

        clear();
    }

    public static void stringRemove(String str1, String str2) {
        str1 = str1.replace(str2, " ");

        System.out.println(str1);

        clear();
    }

    public static void stringReverse() {
        String sentence;
        String[] sentenceReverse = new String[100];

        System.out.print("Enter a sentence: "); sentence = cin.nextLine();

        sentenceReverse = sentence.split(" ");

        for(int k = sentenceReverse.length - 1; k >= 0; k--) {
            System.out.println(sentenceReverse[k]);
        }

        clear();
    }

    public static void initialOut (String name) {
        String initial = "";

        initial = "" + name.split(" ")[0].charAt(0) + name.split(" ")[1].charAt(0);

        System.out.println(initial);

        clear();
    }

    public static void stringSwap() {
        ArrayList<String> arrList = new ArrayList<>();
        String temp;

        for(int i = 0; i < 3; i++) {
            arrList.add(" ");
        }

        for(int k = 0; k < arrList.size(); k++) {
            System.out.println("Enter a word: "); arrList.set(k, cin.nextLine());
        }

        temp = arrList.get(0);

        arrList.set(0, arrList.get(arrList.size() - 1));
        arrList.set(arrList.size() - 1, temp);

        for(int v = 0; v < arrList.size(); v++) {
            System.out.println(arrList.get(v));
        }

        clear();
    }

    public static void stringCin(int choice) {
        String str1, str2;

        switch (choice) {
            case 1: {
                System.out.print("Enter a name: "); str1 = cin.nextLine();

                initialOut(str1);

                break;
            }

            case 2: {
                System.out.print("Enter the first word: "); str1 = cin.nextLine();
                System.out.print("Enter the second word: "); str2 = cin.nextLine();

                stringRemove(str1, str2);

                break;
            }
        }
    }

    public static void menu() {
        int choice;

        System.out.println("List\n----");

        System.out.println("1. Array number checker");
        System.out.println("2. String removal");
        System.out.println("3. String reverse");
        System.out.println("4. Initials checker");
        System.out.println("5. String swap");

        System.out.println("\n>>> "); choice = cin.nextInt();

        switch (choice) {
            case 1: arrayNumCheck(); break;
            case 2: stringCin(2); break;
            case 3: stringReverse(); break;
            case 4: stringCin(1); break;
            case 5: stringSwap(); break;
            default: { System.out.println("Invalid Input!"); clear(); break; }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
