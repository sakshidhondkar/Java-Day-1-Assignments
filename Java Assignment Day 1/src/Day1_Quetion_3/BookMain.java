package Day1_Quetion_3;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Books:");
		int n=sc.nextInt();
		
		BookManager b1=new BookManager();
		Book barr[]=b1.create(n);
		b1.display(barr);

	}

}
