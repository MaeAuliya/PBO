package Predictive;

public class Sigs2WordsProto {
//3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredictivePrototype word = new PredictivePrototype();
		
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i] + " "); // gonna show input per word
		}
		
		System.out.println();
		
//		long startTime = System.currentTimeMillis(); // this is for Q 2.3 for compare time execution
		
		for(int i=0; i<args.length; i++) {
			System.out.println();
			System.out.print(args[i] + " : " + word.signatureToWords(args[i]) + " "); // gonna proceed input per signature and show the possible words per siganture
		}
		
//		long endTime = System.currentTimeMillis(); // this is for Q 2.3 for compare time execution
//		System.out.println(); // this is for Q 2.3 for compare time execution
//		System.out.println("That took " + (endTime - startTime) + " milliseconds"); // this is for Q 2.3 for compare time execution
	}
}
