package Predictive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PredictivePrototype {
//1.
	public static String wordToSignature(String a) {
		StringBuffer scan = new StringBuffer ("");
		
		a = a.toLowerCase(); //make all input to lower case 
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'b' || a.charAt(i) == 'c' ) // a b c
				scan.append(2);
			else if(a.charAt(i) == 'd' || a.charAt(i) == 'e' || a.charAt(i) == 'f' ) // d e f
				scan.append(3);
			else if(a.charAt(i) == 'g' || a.charAt(i) == 'h' || a.charAt(i) == 'i' ) //g h i
				scan.append(4);
			else if(a.charAt(i) == 'j' || a.charAt(i) == 'k' || a.charAt(i) == 'l' ) //j k l 
				scan.append(5);
			else if(a.charAt(i) == 'm' || a.charAt(i) == 'n' || a.charAt(i) == 'o' ) //m n o
				scan.append(6);
			else if(a.charAt(i) == 'p' || a.charAt(i) == 'q' || a.charAt(i) == 'r' || a.charAt(i) == 's' ) // p q r s
				scan.append(7);
			else if(a.charAt(i) == 't' || a.charAt(i) == 'u' || a.charAt(i) == 'v' ) // t u v
				scan.append(8);
			else if(a.charAt(i) == 'w' || a.charAt(i) == 'x' || a.charAt(i) == 'y' || a.charAt(i) == 'z' ) // w x y z
				scan.append(9);
			else
				scan.append(" ");
		}
		return scan.toString();
	}
	
	//to check if it alphabetic or not
		private static boolean isValidWord(String word) {
			for (int i=0; i < word.length(); i++) {
				if ((word.charAt(i) >= 'A' &&  word.charAt(i) <= 'Z') || (word.charAt(i) >= 'a' &&  word.charAt(i) <= 'z')){
				}else
					return false;
			}
			return true;
		}

//2.
	public static Set<String> signatureToWords(String signature){
		Set<String> h = new HashSet<String>();

		try { // read the file word.txt
			File dictionary = new File("words.txt");
			Scanner dc = new Scanner(dictionary);
			
			while(dc.hasNextLine()) {
				String data = dc.nextLine();
				data = data.toLowerCase();
				
				if(isValidWord(data) && (wordToSignature(data).equals(signature)))// as long as the input true on isValidWord function and have same signature with input
					h.add(data); // gonna added to set
			}
			dc.close(); //file close
		}
		catch(FileNotFoundException e) { // if file have some error
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		return h; //return the set
	}
}
