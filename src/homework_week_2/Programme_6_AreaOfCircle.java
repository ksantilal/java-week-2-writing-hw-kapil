package homework_week_2;


import java.util.Scanner;

/**
 * write a java program to enter any radius value of the circle and find out the area.(Formula of area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scanner.nextInt();
        areaOfCircle(radius);
        // closing the scanner object
        scanner.close();
    }

    //Calculating the area of circle
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);
    }
}
