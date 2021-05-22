package Set1;

public class Palindrome {

	//----1----------------	
	public static void main(String[] args) {
		
		System.out.println("\n=================================== Begin ===Palindrome========================\n");
		
		printProblemStatement();
		
		describePalindrome("Anna");
		describePalindrome("Civic");
		
		describePalindrome("Annan");
		describePalindrome("Civics");
		
		describePalindrome("Racecar");
		describePalindrome("Radar");
		describePalindrome("Refer");
		describePalindrome("Repaper");
		
		describePalindrome("A nut for a jar of tuna");
		
		describePalindrome("Anutforajaroftuna");
		
		describePalindrome("German");
		describePalindrome("Palindromes are words or phrases");
		describePalindrome("Palindrome");
		
		describePalindrome(12021);
		describePalindrome(91419);
		describePalindrome(1202021);
		
		describePalindrome(123);
		describePalindrome(1111);
		describePalindrome(1);
		
		describePalindrome("A");
		
		describePalindrome("Amma");
		
		describePalindrome(22.22);
		
		describePalindrome("12/1/21");
		
		describePalindrome(99.12);
		
		describePalindrome(323.323);
		
		System.out.println("\n=================================== End ===Palindrome========================\n");

	}

	
	//----2----------------
	public static void describePalindrome(int i) {
		
		String s = String.valueOf(i);
		describePalindrome(s);
	}
	
	//----3----------------
	public static void describePalindrome(double d) {
		
		String s = String.valueOf(d);
		describePalindrome(s);
	}

	
	
	//----4----------------
	public static void describePalindrome(String s) {	
		
		if (isPalindrome(s, false)) {
			
			System.out.println("|" + s + "|  is a palindrome\n");  
			
		} else {
			
			System.out.println("|" + s + "|  is NOT a palindrome\n");
			
		}
		
	}
	
	//----5----------------
	public static boolean isPalindrome(String s, boolean print) {
		
		String part1, rpart2, part2;
		
		int N = s.length();
		
		if (N == 1) return true;
		
		if (N == 0) return false;
		
		int m = N/2;
		
		if ((N % 2) == 0) {
			part1 = s.substring(0, m);
			rpart2 = s.substring(m, N);
		} else {
			part1 = s.substring(0, m);
			rpart2 = s.substring(m+1, N);
		}
		
		part1 = part1.toLowerCase();
		rpart2 = rpart2.toLowerCase();
		
		
		StringBuffer x = new StringBuffer(rpart2);
        x.reverse();
        
        part2 = x.toString();
		
		if (print) { System.out.println("part1 = " + part1 + "\n" + "rpart2 = " + rpart2 + "\n" + "part2 = " + part2 ); }
		
		if (part1.equals(part2)) { return true; }
		
		return false;
		
	}
	
	
	//----6----------------
	public static void printProblemStatement() {
		
		String x = "..........Definition........... " + "\n\n" 
		
				 + "Palindromes are words or phrases that read the same backward and forward," + "\n"
		         + "letter for letter, number for number, or word for word." + "\n"
		         + "Examples: " + "\n"
				 + " (a) Anna, Civic, Racecar, Radar, Refer, Repaper" + "\n"
		         + " (b) A nut for a jar of tuna " + "\n"
				 + " (c) 12021, 91419, 1202021" + "\n"
		         + "..........Question........... " + "\n\n" 
		         + "Find the if a given number or phrase or word is a palindeome or not ." + "\n"
				 + "................................ " + "\n";
		
		System.out.println(x + "\n");
		
	}
	
	//---------------------
}
