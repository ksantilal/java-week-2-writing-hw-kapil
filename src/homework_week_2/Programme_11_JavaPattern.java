package homework_week_2;

/* write a java program to display the following pattern.
sample Pattern :
j a v v a
j a a v v a a
j j aaaaa V V aaaaa
j j a a V a a
 */
public class Programme_11_JavaPattern {

    public static void main(String[] args) {
        Programme_11_JavaPattern t = new Programme_11_JavaPattern();
        System.out.println("---------------------------------------------");
        t.javaPattern();
    }

    // Printing the Java Pattern
    public void javaPattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}