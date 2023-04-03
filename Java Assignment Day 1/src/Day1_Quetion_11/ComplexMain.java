package Day1_Quetion_11;
import java.util.Scanner;
public class ComplexMain {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(0, 0);
        int choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Display");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter real and imaginary parts of first complex number:");
                    c1 = new Complex(input.nextDouble(), input.nextDouble());

                    System.out.println("Enter real and imaginary parts of second complex number:");
                    c2 = new Complex(input.nextDouble(), input.nextDouble());

                    c1.add(c2);
                    System.out.print("Sum of ");
                    c1.display();
                    System.out.print(" & ");
                    c2.display();
                    System.out.print(" is: ");
                    c1.display();
                    break;

                case 2:
                    System.out.println("Enter real and imaginary parts of first complex number:");
                    c1 = new Complex(input.nextDouble(), input.nextDouble());

                    System.out.println("Enter real and imaginary parts of second complex number:");
                    c2 = new Complex(input.nextDouble(), input.nextDouble());

                    c1.subtract(c2);
                    System.out.print("Difference between ");
                    c1.display();
                    System.out.print(" & ");
                    c2.display();
                    System.out.print(" is: ");
                    c1.display();
                    break;

                case 3:
                    System.out.println("Complex number 1:");
                    c1.display();

                    System.out.println("Complex number 2:");
                    c2.display();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice <4);

        input.close();
    }

}
