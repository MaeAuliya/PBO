package Predictive;

public class Sigs2WordsList {
	static Dictionary stw;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    stw = new DictionaryListImpl();

	    long startTime = System.currentTimeMillis(); //time method
	    
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i] + " : " + stw.signatureToWords(args[i]));
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
}
