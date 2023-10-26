package homework_week_2;


import java.util.Scanner;

/**
 * write program to convert the upper case to lower case
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertuppercaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //Conversation of Uppercase to Lower case method
    public void convertuppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }
}
