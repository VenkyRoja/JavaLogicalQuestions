package Set1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class duplicateWords {

	//----1----------------
	public static void main(String[] args) {
	
		System.out.println("\n=================================== Begin ===duplicateWords========================\n");
		
		printProblemStatement();

		
		countDuplicates("Big black bug bit a big black dog on his big black nose", true);
		
		countDuplicates("Remove duplicate words from String in Java example shows how to remove duplicate words from String in Java . The example also shows various approaches to do the same .", true);

		
		System.out.println("\n=================================== End ===duplicateWords==========================\n");	

	}

	
	//----2----------------
	public static void countDuplicates(String sentence, boolean print) {
		
		
		System.out.println("\n------------------\n");
		
		HashMap<String, Integer> H = new HashMap<String, Integer>();
		HashMap<String, Integer> D = new HashMap<String, Integer>();
		HashMap<String, Integer> N = new HashMap<String, Integer>();
		
		String s = sentence.toLowerCase();
		
		String words[] = s.split(" ");
		
		if (print) {	
			System.out.println("\n===Original statement======\n");
			System.out.println(s);
			System.out.println("\n");
			System.out.println(Arrays.toString(words));
			System.out.println("\n");
		}
		
		
		for (String x : words) {
			
			int i = getCount(words, x);
			
			Integer I = Integer.valueOf(i);
			
			if (!(H.containsKey(x))) {
				H.put(x, I);
			}
		}

		//.....
		H.forEach((k, v) -> {
	        if (v >= 2) {
	        	D.put(k,v);
	        } else {
	        	N.put(k,v);
	        }
	     });
		//.....
		
		
		System.out.println("\nCount of words:");
		System.out.println(H.toString()); 
		
		System.out.println("\nCount of duplicate words:");
		System.out.println(D.toString()); 

		System.out.println("\nCount of unique words:");
		System.out.println(N.toString());	
		
		Set<String> SH = H.keySet();
		Set<String> SD = D.keySet();
		Set<String> SN = N.keySet();
		
		System.out.println("\n------------------\n");
		System.out.println("All words:\n" + SH.toString() + "\n");
		System.out.println("Duplicate words\n" + SD.toString() + "\n");
		System.out.println("Unique words\n" + SN.toString() + "\n");
		
		System.out.println("\n------------------\n");
		
		System.out.println("All words:"); SH.forEach((x) -> System.out.print(x + " --- ")); System.out.println("\n");
		System.out.println("Duplicate words:"); SD.forEach((x) -> System.out.print(x + " --- ")); System.out.println("\n");
		System.out.println("Unique words:");SN.forEach((x) -> System.out.print(x + " --- ")); System.out.println("\n");
	}
	

	//----2----------------
	public static int getCount(String[] words, String token) {
		
		int k = 0;
		for (String x : words) {
			if (x.equals(token)) k++;
		}
		return k;
		
	}
	
	
	
	//----3----------------
	public static void printProblemStatement() {
		
		String x = "..........Definition........... " + "\n\n" 
		         + "Duplicate words are the words that occur more than once, " + "\n"
				 + "in a sentence: " + "\n\n"
				 + "Example: " + "\n"
				 + "   Big black bug bit a big black dog on his big black nose " + "\n\n"
				 + "   Big 3" + "\n"
				 + "   Black 3" + "\n\n"
			     + "..........Question........... " + "\n\n" 
		         + "  Find the count of duplicate words in a sentence." + "\n"
		         + "................................ " + "\n";
				
		    
		System.out.println(x + "\n");
		
	}
	
	//---------------------	
	
	
	
}
