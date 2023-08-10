package Q15Weight;

import Q15Weight.Q15Weight;

public class Q15WeightTest {

	public static void main(String[] args) {
		
		/*
		 * this is for testing the program input and output
		 * user gonna input once number (weight) and this program gonna convert from pound to kilogram
		 * this program output (if user input "60" for his/her weight)
		 * output : 
		 * Your Weight in kilogram is : 27.2155422
		 */
		
		Q15Weight Input = new Q15Weight(60); // initializing the constractor and input some number to convert
		
		System.out.println("Your Weight in kilogram is : "+ Input.Pound_toKilo()); // print the result after convert form pound to kilogram
	}
}
	
