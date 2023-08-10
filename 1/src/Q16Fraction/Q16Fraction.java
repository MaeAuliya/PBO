package Q16Fraction;

public class Q16Fraction {
	
	/*
	 * 	This program used for sum and multiple between two fracrtion
	 * 	Same like Question no 1, but this program will use constructor
	 * 	this program used two integer data type
	 */
	int Numerator, Denominator; // declare variables
	
	public int Get_Numerator() { // this function for storing numerator
		return Numerator;
	}
	public int Get_Denominator() { // this function for storing denominator
		return Denominator;
	}
	public String getSum(Q16Fraction a){ // this function for fraction sum formula
		return (((a.Numerator*Denominator)+(Numerator*a.Denominator)) + " / " + (a.Denominator*Denominator));
	}
	public String getProduct(Q16Fraction a) { // this function for fraction product formula
		return (a.Numerator*Numerator) + " / " + (a.Denominator*Denominator);
	}
		
	public String toString() { // this function for template of input
		return Numerator + " / " + Denominator;
	}
	
	public Q16Fraction(int a, int b) { // this was a place after all data have been stored
		this.Numerator = a;
		this.Denominator = b;
	}
}
