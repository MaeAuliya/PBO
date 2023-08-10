package Q16Fraction;

import Q16Fraction.Q16Fraction;

public class Q16FractionTest {
	/*
	 * this is for testing the program input and output
	 * user will input the number of numerator and denominator for each fraction
	 * user input : 
	 * 1/2 (1 and 2)
	 * 3/7 (3 and 7)
	 * output : 
	 * Your Fraction Product is: 3 / 14
	 * Your Fraction Sum is:  13 / 14
	 */
	public static void main(String[] args) {
		
		Q16Fraction f1 = new Q16Fraction (1,2); // initializing the constructor and put the input
		Q16Fraction f2 = new Q16Fraction (3,7); // initializing the constructor and put the input
		
		System.out.println("First Fraction is: " + f1.toString()); // print string type of fraction (template input)
		System.out.println("Second Fraction is: " + f2.toString()); // print string type of fraction (template input)
		System.out.println(" "); // make one space
		
		System.out.println("Your Fraction Product is: " + f2.getProduct(f1)); // print the fraction product
		System.out.println("Your Fraction Sum is:  " + f2.getSum(f1)); // print the fraction product
	}

}
