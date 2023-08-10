package Q11Fraction;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		
		/*
		 * this program used for suming and producting between two fraction
		 * this program will use four integer data type for import
		 * this program will use outter input (custom input)
		 */
		Scanner input = new Scanner(System.in); //initializing for input
		int e1,d1,e2,d2; // declare all variables
		
		e1=input.nextInt(); // initializing input
		d1=input.nextInt(); // initializing input
		e2=input.nextInt(); // initializing input
		d2=input.nextInt(); // initializing input
		
		
		int sum_top,multiple_top,bot; //formulas for suming and producting the fraction
		sum_top=(e1*d2)+(e2*d1); //formulas for Numerator (sum)
		bot=d1*d2; // formula for denominator, because both of sum and product the value bot are same
		multiple_top=e1*e2; //formula for Numertaor (product)
		
		System.out.println("result of adding fraction is "+sum_top+"/"+bot); //print the result of sum
		System.out.println("multiplication of fractions is "+multiple_top+"/"+bot); //print the result of product
		
		
		input.close(); // close the input
	}

}
