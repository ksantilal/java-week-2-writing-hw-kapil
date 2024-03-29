package homework_week_2;

import java.util.Scanner;

/**
 * write a java programme that takes a number as input and prints its
 * multiplication up to 10
 * Test Data : Input a number : 8
 * Expected output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Programme_10_MultiplicationTable {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        multiplicationTableof(number);
        //closing the scanner object
        scanner.close();
    }

    //printing the multiplication table of entered number
    public static void multiplicationTableof(int number) {
        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number * 2));
        System.out.println(number + " x " + 3 + " = " + (number * 3));
        System.out.println(number + " x " + 4 + " = " + (number * 4));
        System.out.println(number + " x " + 5 + " = " + (number * 5));
        System.out.println(number + " x " + 6 + " = " + (number * 6));
        System.out.println(number + " x " + 7 + " = " + (number * 7));
        System.out.println(number + " x " + 8 + " = " + (number * 8));
        System.out.println(number + " x " + 9 + " = " + (number * 9));
        System.out.println(number + " x " + 10 + " = " + (number * 10));
    }
}
