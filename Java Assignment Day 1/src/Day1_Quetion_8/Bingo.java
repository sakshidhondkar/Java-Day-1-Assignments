package Day1_Quetion_8;

public class Bingo {
	public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int[] numbers = { 10, 20, 30, 40, 50 };
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) 
        {
            if (numbers[i] == num1 || numbers[i] == num2) 
            {
                found = true;
                break;
            }
        }

        if (found) 
        {
        	System.out.println("Your first no was:" + num1);
            System.out.println("Your second no was:" + num2);

            System.out.println("Its Bingo!");
            
        } 
        else 
        {
            System.out.println("Sorry, the numbers were not found.");
            System.out.println("The array was:");
            for(int i=0;i<numbers.length;i++)
            {
            	System.out.print("\t"+numbers[i]);
            }
        }
    }

}
