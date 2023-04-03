package Day1_Quetion_4;
import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Rectangle[] rectangles = new Rectangle[5];
	        
	        for (int i = 0; i < rectangles.length; i++) {
	            System.out.println("Rectangle :" + (i+1));
	            System.out.print("Enter length: ");
	            double length = sc.nextDouble();
	            System.out.print("Enter width: ");
	            double width =sc.nextDouble();
	            
	            rectangles[i] = new Rectangle(length, width);
	        }
	        System.out.println("\n---------------+ Output +-------------------");
	        for (int i = 0; i < rectangles.length; i++) {
	            System.out.println("Rectangle :" + (i+1));
	            rectangles[i].display();
	            System.out.println();
	        }

	}

}
