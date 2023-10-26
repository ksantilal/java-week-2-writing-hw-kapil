package homework_week_2;


import java.util.Scanner;

/**
 * write a java program to convert a given string into lowercase.
 * Sample Input : THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //Convert string to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("\the Lowercase of the string is = " + str.toLowerCase());
    }
}
