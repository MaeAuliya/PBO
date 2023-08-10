package Predictive;
import java.io.*;
import java.util.*;

public class DictionaryListImpl implements Dictionary{
	
	static ArrayList<WordSig> list = new ArrayList<WordSig>();
	
	private static boolean isValidWord(String word) { //chech the input valid or not
		for (int i=0; i < word.length(); i++) {
			if ((word.charAt(i) >= 'A' &&  word.charAt(i) <= 'Z') || (word.charAt(i) >= 'a' &&  word.charAt(i) <= 'z')){
			}else
				return false;
		}
		return true;
	}
	
	public DictionaryListImpl() {
		
		// read file words.txt
		
		try {
			File words = new File("words.txt");
			Scanner file = new Scanner(words);
			
			// if the file has next line
			while (file.hasNextLine()) {
				String data = file.nextLine();
				
				if(isValidWord(data)) {

					data = data.toLowerCase();
					WordSig wors = new WordSig(data, wordToSignature(data));
					list.add(wors);

				}
			}	
			Collections.sort(list);
			// close the opened file
			file.close();
	    } catch (FileNotFoundException e) { // if the file not found
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
		
		
	}
	
	public String wordToSignature(String a) {
		StringBuffer scan = new StringBuffer ("");
		
		a = a.toLowerCase();
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'b' || a.charAt(i) == 'c' )
				scan.append(2);
			else if(a.charAt(i) == 'd' || a.charAt(i) == 'e' || a.charAt(i) == 'f' )
				scan.append(3);
			else if(a.charAt(i) == 'g' || a.charAt(i) == 'h' || a.charAt(i) == 'i' )
				scan.append(4);
			else if(a.charAt(i) == 'j' || a.charAt(i) == 'k' || a.charAt(i) == 'l' )
				scan.append(5);
			else if(a.charAt(i) == 'm' || a.charAt(i) == 'n' || a.charAt(i) == 'o' )
				scan.append(6);
			else if(a.charAt(i) == 'p' || a.charAt(i) == 'q' || a.charAt(i) == 'r' || a.charAt(i) == 's' )
				scan.append(7);
			else if(a.charAt(i) == 't' || a.charAt(i) == 'u' || a.charAt(i) == 'v' )
				scan.append(8);
			else if(a.charAt(i) == 'w' || a.charAt(i) == 'x' || a.charAt(i) == 'y' || a.charAt(i) == 'z' )
				scan.append(9);
			else
				scan.append(" ");
		}
		return scan.toString();
	}
	
	public Set<String> signatureToWords(String signature){
		Set<String> stringSet = new HashSet<String>();

		
		int n = list.size() ;
		
		for(int i=0; i<n; i++) {
			if(signature.compareTo(list.get(i).Sign()) == 0) {
				stringSet.add(list.get(i).Word());
			}
		}       
		return stringSet;
	}

}