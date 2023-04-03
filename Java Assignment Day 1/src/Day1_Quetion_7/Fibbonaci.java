package Day1_Quetion_7;

public class Fibbonaci {
	public static void main(String[] args) {
	    if (args.length < 2) {
	        System.out.println("Please provide two numbers as command line arguments.");
	        return;
	    }

	    int num1 = Integer.parseInt(args[0]);
	    int num2 = Integer.parseInt(args[1]);

	    System.out.println("First number: " + num1);
	    System.out.println("Second number: " + num2);

	    System.out.println("\t------Final Fibbonaci Series-------");
	    System.out.print("" + num1);
	    System.out.print("\t" + num2);
	    int sum = 0;
	    for (int i = 1; i <= 13; i++) {
	        sum = num1 + num2;
	        System.out.print("\t" + sum);
	        num1 = num2;
	        num2 = sum;
	    }
	}

}
