package Day1_Quetion_3;
import java.util.Scanner;
public class BookManager {

	Scanner sc=new Scanner(System.in);
	public Book[] create(int n)
	{
		Book barr[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Book Name:");
			String bName=sc.next();
			System.out.println("Enter Book Price:");
			float bprice=sc.nextFloat();
			Book obj=new Book(bName,bprice);
			barr[i]=obj;
			
		}
		return barr;
		
	}
	
	public void display(Book barr[])
	{
		System.out.println("Book Name\tPrice");
		System.out.println("---------------------------");
		for(int i=0;i<barr.length;i++)
		{
			System.out.println(barr[i].getBookName()+"\t\t"+barr[i].getBookPrice());
		}
	}
	
	
}
