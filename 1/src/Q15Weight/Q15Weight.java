package Q15Weight;

public class Q15Weight {
	/*
	 * this program used for convert pound to kilogram
	 * this program used two double data type ( pound and kilogram )
	 * this contructor gonna elaborate the function that be used in this program
	 */
	
	double pound,kilogram; // declare the variable (double data type)
	
	public double Get_Pound() { // this function for storing pound variable
		return pound;
	}
	
	public double Get_Kilogram() { // this function for storing kilogram variable
		return kilogram;
	}
	
	public double Pound_toKilo() { // this function for convert pound to kilogram
		return pound*0.45359237;
	}
	
	public Q15Weight(double p) { // this function was a place after all data have been stored
		this.pound = p;
	}

}
