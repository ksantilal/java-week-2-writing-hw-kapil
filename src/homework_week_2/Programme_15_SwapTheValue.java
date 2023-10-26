package homework_week_2;


import java.util.Scanner;

/**
 * write a java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("Enter the first variable value : ");
        int second = scanner.nextInt();
        System.out.print("Enter the second variable value : ");
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        // closing the scanner object
        scanner.close();
    }

    //swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);

    }

}
