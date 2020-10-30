import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        double studentGPA = 3.45;
        String studentFirstName = "Jap";
        String studentLastName = "Ignacio";
        System.out.println(studentFirstName.charAt(0) + " " + studentLastName + " has a GPA of " + studentGPA);

        System.out.println("Do you want to update the GPA?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of " + studentGPA);
    }
}
