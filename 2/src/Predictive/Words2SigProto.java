package Predictive;

public class Words2SigProto {
//3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredictivePrototype word = new PredictivePrototype();
		
		System.out.print("input : ");
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i] + ", "); // gonna show input per word
		}
		
		System.out.println();
		System.out.print("output : ");
		for(int i=0; i<args.length; i++) {
			System.out.print(word.wordToSignature(args[i]) + " "); // gonna proceed input per word and show it signature by signature
		}
	}
}
