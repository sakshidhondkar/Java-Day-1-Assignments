package Day1_Question_6;

public class Palindrome {

	class Check {
		  
	    // Function to reverse a string
	    public static int isPalindrome(String str)
	    {
	        int n = str.length();
	  
	        
	        for (int i = 0; i < n / 2; i++)
	            if (str.charAt(i) != str.charAt(n - i - 1))
	  
	                 
	                return 0;
	  
	        
	        return 1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length > 0) {
			  
	             
	            int res = isPalindrome(args[0]);
	   
	            if (res == 0)
	                 
	                System.out.println("No\n");
	            else
	                
	                System.out.println("Yes\n");
	        }
	        else
	            System.out.println("No command line "+ "arguments found.");
	    }

	}

}
