package Set1;

public class FactorialQuestion {
   
	//----1----------------
	public static void main(String[] args) {

		System.out.println("\n=================================== Begin ===FactorialQuestion========================\n");
		
		printProblemStatement();

		System.out.println("----------Using factorial version 1 (non-recursive function)-----------");
		factorial1(0);
		factorial1(1);
		factorial1(5);
		factorial1(9);
		factorial1(10);
		factorial1(-10);

		System.out.println("\n----------Using factorial version 2 (recursive function)-----------");

		System.out.println("0! = " + factorial2(0));
		System.out.println("1! = " + factorial2(1));
		System.out.println("5! = " + factorial2(5));
		System.out.println("9! = " + factorial2(9));
		System.out.println("10! = " + factorial2(10));
		System.out.println( factorial2(-10));
		
		
		System.out.println("\n=================================== End ===FactorialQuestion==========================\n");

	}
	

	
	
	//----2----------------
	public static void factorial1(int n) {
		
		int p = 1;
		
		if (n < 0) {
			System.out.println("Factorial is not defined negative numbers. Given number is " + n + "\n");
			return;
		}
		
		if (n == 0) {
			System.out.println("0! = 1" + "\n");
			return;
		}
		
		String x = "";
		
		for (int i = n; i >= 1; i--) {
			
			p *= i;
			
			if (i == 1) x += i; 
			else x += i + " x "; 
		}
		
		System.out.println( n + "! = " + x + " = " + p + "\n");
		
	}
	
	
	//----2----------------
	public static int factorial2(int n) {
		int r = 1;
		
		if (n <= 0) {
			System.out.println("Factorial is not defined negative numbers. Given number is " + n + "\n");
 			return -1; 
 		
		} else if (n == 0) {

 			return 1; 
 		
		} else if (n == 1) {
			
			r = 1;
		
		} else {
			
		   r = n * factorial2(n-1);	
		}
		
		return r;
	}

	//----3----------------
	public static void printProblemStatement() {
		
		String x = "..........Definition........... " + "\n\n" 
		         + "The factorial of a non-negative integer n, denoted by n!, " + "\n"
				 + "is the product of all positive integers less than or equal to n: " + "\n\n"
				 + "	n! = n x (n-1) x (n-2) x .... x 3 x 2 x 1 " + "\n\n"
				 + "Example: " + "\n"
				 + "   5! = 5 x 4 x 3 x 2 x 1 = 120 " + "\n"
				 + "   The value of 0! is 1." + "\n\n"
		         + "..........Question........... " + "\n\n" 
		         + "  Find the factorial, given a positive integer." + "\n"
		         + "................................ " + "\n";
				
		    
		System.out.println(x + "\n");
		
	}
	
	//---------------------	


}
