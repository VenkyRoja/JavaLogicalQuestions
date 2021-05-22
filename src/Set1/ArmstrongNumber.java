package Set1;

import java.util.ArrayList;

public class ArmstrongNumber {

	//----1----------------
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===ArmstrongNumber========================\n");
		
		printProblemStatement();
		
		isArmstrong(256, true);
		isArmstrong(153, true);
		isArmstrong(370, true);
		
		isArmstrong(1634, true);
		isArmstrong(8208, true);
		isArmstrong(9474, true);
		
		isArmstrong(0, true);
		isArmstrong(1, true);
		isArmstrong(3, true);
		
		getArmstrong(1, 999);
		getArmstrong(0, 10);
		getArmstrong(99, 9999);
		getArmstrong(99, 9999);
		getArmstrong(400, 5000);
			
		System.out.println("\n=================================== End ===ArmstrongNumber==========================\n");

	}


	//----2----------------
	public static void getArmstrong(int a, int b) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for (int i = a; i <= b; i++) {
			
			int sum = getPowerSum(i, false);
			
			if (i == sum) {
				Integer I = Integer.valueOf(i);
				A.add(I);
			}
		}
		
		System.out.println("Armstrong numbers between " + a + " and " + b + " are  " + A.toString() + "\n");
	}
	
	//----3----------------
	public static void isArmstrong(int x, boolean print) {
		
		boolean r = false;
		
		int sum = getPowerSum(x, true);
		
		if (x == sum) r = true;
		
		
		if (print) {
			if(r) { System.out.println("Number " + x + " is an ARMSTRONG NUMBERR! \n\n"); }
			else { System.out.println("Number " + x + " is NOT an armstrong number. \n\n"); }
		}
		
	}	
		
	
	
	//----4----------------
	public static int getPowerSum(int x, boolean print) {
		
		int sum = 0;
		
		String s = String.valueOf(x);
		int N = s.length();
		
		if (print)  System.out.print("x = " + x + " N = " + N +  " ... "); 	

		for (int i=0; i < N; i++) {
			
			char c = s.charAt(i);
			
			int k = Integer.parseInt(String.valueOf(c));
			
			int p = 1;
			
			for (int j=0; j < N; j++) p *= k;
			
			sum += p;
					
			if (print)  System.out.print(k + " " + p +  " -- "); 
		}
		
		if (print)  System.out.println("sum = " + sum); 
			
		return sum;
		
	}	
		
	
	//----5----------------
	public static void printProblemStatement() {
		
		String x = "..........Definition........... " + "\n\n" 
		         + "An Armstrong number is a number such that the sum of the n-th power of " + "\n"
				 + "its digits is equal to the number itself, " + "\n"
				 + "where n is the number of digits in the number (Given that it is a positive integer). " + "\n\n"
				 + "Examples: " + "\n"
				 + "(a) 4-digit Armstrong numbers; 1634, 8208, 9474 " + "\n"
				 + "(b) 3-digit Armstrong numbers; 153, 370" + "\n\n"
		         + "..........Question........... " + "\n\n" 
		         + " (a) Find if given number is an Armstrong number or not." + "\n"
		         + " (b) Find all the Armstrong numbers between 1 and 999." + "\n"
				 + "................................ " + "\n";
				
		
		System.out.println(x + "\n");
		
	}
	
	//---------------------	
	
	
}
