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
		
		describePalindrome(151);
		describePalindrome(152);
		describePalindrome(484);
		describePalindrome(78987);
		describePalindrome(161);
		describePalindrome(34543);
		describePalindrome(110);
		
		System.out.println("----------Using padlindrome logic version 2-----------");
	
		describePalindrome2("Anna");
		describePalindrome2("Civic");
		
		describePalindrome2("Annan");
		describePalindrome2("Civics");
		
		describePalindrome2(151);
		describePalindrome2(152);
		describePalindrome2(484);
		describePalindrome2(78987);
		describePalindrome2(161);
		describePalindrome2(34543);
		describePalindrome2(110);
		
		describePalindrome2(1);
		describePalindrome2(0);
		
		describePalindrome2("A");
		
		describePalindrome2("Amma");
		
		describePalindrome2(22.22);
		
		describePalindrome2("12/1/21");
		
		describePalindrome2(99.12);
		
		describePalindrome2(323.323);	
		
		System.out.println("----------Using padlindrome logic version 3-----------");
		
		describePalindrome3("Anna");
		describePalindrome3("Civic");
		
		describePalindrome3("Annan");
		describePalindrome3("Civics");
		
		describePalindrome3(151);
		describePalindrome3(152);
		describePalindrome3(484);
		describePalindrome3(78987);
		describePalindrome3(161);
		describePalindrome3(34543);
		describePalindrome3(110);
		
		describePalindrome3(1);
		describePalindrome3(0);
		
		describePalindrome3("A");
		
		describePalindrome3("Amma");
		
		describePalindrome3(22.22);
		
		describePalindrome3("12/1/21");
		
		describePalindrome3(99.12);
		
		describePalindrome3(323.323);	
		
		
		
		
		System.out.println("\n=================================== End ===Palindrome========================\n");

	}

	
	//----2----------------
	public static void describePalindrome(int i) {
		
		String s = String.valueOf(i);
		describePalindrome(s);
	}
	
	
	//----2a----------------
	public static void describePalindrome2(int i) {
		
		String s = String.valueOf(i);
		describePalindrome2(s);
	}	
	
	//----2b----------------
	public static void describePalindrome3(int i) {
		
		String s = String.valueOf(i);
		describePalindrome3(s);
	}	
	
	//----3----------------
	public static void describePalindrome(double d) {
		
		String s = String.valueOf(d);
		describePalindrome(s);
	}


	//----3a----------------
	public static void describePalindrome2(double d) {
		
		String s = String.valueOf(d);
		describePalindrome2(s);
	}	
	
	//----3b----------------
	public static void describePalindrome3(double d) {
		
		String s = String.valueOf(d);
		describePalindrome3(s);
	}
	
	
	//----4----------------
	public static void describePalindrome(String s) {	
		
		if (isPalindrome(s, false)) {
			
			System.out.println("|" + s + "|  is a palindrome\n");  
			
		} else {
			
			System.out.println("|" + s + "|  is NOT a palindrome\n");
			
		}
		
	}
	
	
	//----4a----------------
	public static void describePalindrome2(String s) {	
		
		if (isPalindrome2(s, false)) {
			
			System.out.println("|" + s + "|  is a palindrome\n");  
			
		} else {
			
			System.out.println("|" + s + "|  is NOT a palindrome\n");
			
		}
		
	}	
	
	//----4b----------------
	public static void describePalindrome3(String s) {	
		
		if (isPalindrome3(s, false)) {
			
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
		
		if (N == 0) return true;
		
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
	
	//----5a----------------
	public static boolean isPalindrome2(String s, boolean print) {
			
		s = s.toLowerCase();
			
		StringBuffer x = new StringBuffer(s);
	    x.reverse();
	        
	    String r = x.toString();
			
		if (print) { System.out.println("s = " + s + "\n" + "r = " + r + "\n" ); }
			
		if (s.equals(r)) { return true; }
			
		return false;
			
	}	
	
	
	//----5c----------------
	public static boolean isPalindrome3(String s, boolean print) {
			
		s = s.toLowerCase();
	        
	    String r = getReverse(s, false);
			
		if (print) { System.out.println("s = " + s + "\n" + "r = " + r + "\n" ); }
			
		if (s.equals(r)) { return true; }
			
		return false;
			
	}		

	//----6----------------
	public static String getReverse(String s, boolean print) {
		
		String r = "";
		
		int N = s.length();
		
		for (int i=N-1; i >= 0; i--) {
			
			r +=  s.charAt(i);
		}
		
		if (print) { System.out.println("s = " + s + "\n" + "r = " + r + "\n" ); }
		
		return r;
	}
	
	
	//----7----------------
	public static void printProblemStatement() {
		
		String x = "..........Definition........... " + "\n\n" 
				 + "Palindromes are words or phrases that read the same backward and forward," + "\n"
		         + "letter for letter, number for number, or word for word." + "\n"
		         + "Examples: " + "\n"
				 + " (a) Anna, Civic, Racecar, Radar, Refer, Repaper" + "\n"
		         + " (b) A nut for a jar of tuna " + "\n"
				 + " (c) 12021, 91419, 1202021" + "\n"
		         + "..........Question........... " + "\n\n" 
		         + "Find the if a given number or phrase or word is a palindrome or not ." + "\n"
				 + "................................ " + "\n";
		
		System.out.println(x + "\n");
		
	}
	
	//---------------------
}
