package Set1;

import java.util.ArrayList;

public class PrimeNumber {

	//----1----------------	
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===PrimeNumber========================\n");
		
		printProblemStatement();
		
		System.out.println("\n... Part (a) ....\n");
		
		isPrime(-11, true);
		isPrime(-3, true);
		isPrime(-1, true);
		
		isPrime(0, true);
		isPrime(1, true);
		isPrime(2, true);
		isPrime(3, true);		
		isPrime(4, true);

		isPrime(10, true);
		isPrime(11, true);
		isPrime(17, true);
		
		System.out.println("\n... Part (b) ....\n");
		
		
		getPrimes(-10, true);
		getPrimes(1, true);
		getPrimes(2, true);
		getPrimes(3, true);
		getPrimes(7, true);
		getPrimes(10, true);
		getPrimes(13, true);
		getPrimes(20, true);
		getPrimes(100, true);
		
		System.out.println("\n=================================== End ===PrimeNumber========================\n");
		


	}
	
	//----2----------------
	public static void getPrimes(int N, boolean print) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for (int i=1; i <= N; i++ ) {
			
			if (isPrime(i, false)) { 
				Integer I = Integer.valueOf(i);
				A.add(I);
			}
		}	
		
		if (print) {
			System.out.println("Given number is " + N + ". The prime number series up to  " + N + " is " + A.toString() + "\n");
		}
		
	}
	

	//----3----------------
	public static boolean isPrime(int x, boolean print) {
		
		boolean r;
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A = findFactors(x,print);	

		if (A.size() == 2) { r = true; }
		else { r = false;}
		
		if (print) {
			if(r) { System.out.println("Number " + x + " is a PRIME NUMBER! \n"); }
			else { System.out.println("Number " + x + " is NOT a prime number. \n"); }
		}
		
		return r;
		
	}	
	
	
	//----4----------------
	public static ArrayList<Integer> findFactors(int x, boolean print) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for (int i=1; i <= x; i++ ) {
			
			if ((x % i) == 0) {
				Integer I = Integer.valueOf(i);
				A.add(I);
			}
		}
		
		if (print) {
			System.out.print("Given number is " + x + ". The factors are " + A.toString() + " --- ");
		}
		
		return A;
		
	}
	
	
	//----5----------------
	public static void printProblemStatement() {
		
		String x = "..........Definition........... " + "\n\n" 
		         + "Prime numbers are numbers that have only 2 factors: 1 and themselves. " + "\n"
				 + "For example, the first 5 prime numbers are 2, 3, 5, 7, and 11. " + "\n"
				 + "By contrast, numbers with more than 2 factors are call composite numbers. " + "\n\n"
				 + "The first 25 prime numbers (all the prime numbers less than 100) are: " + "\n"
				 + "     2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97" + "\n\n"
		         + "..........Question........... " + "\n\n" 
		         + " (a) Find the prime numbers." + "\n"
		         + " (b) Find all the prime numbers less than a given number N." + "\n"
				 + "................................ " + "\n";
				
		
		System.out.println(x + "\n");
		
	}
	
	//---------------------

}
