package Q14Student;

public class Q14Student {
	/*
	 * in this program we gonna input Student data (Name, ID and Degree)
	 * this program used 3 strings
	 */
		
	String Name, ID, Degree; //declare the string
	
	public String Get_Name() { // this function for storing name
		return Name;
	}
	public String Get_ID() { // this function for storing ID
		return ID;
	}
	public String Get_Degree() { // this function for storing degree
		return Degree;
	}
	public String tostring() { // this funtion for the tamplate of output
		return "[" + Get_Name() + ", ID : " + Get_ID() +", " + Get_Degree() + "]";
	}
	public Q14Student() { // this function was place after all data have been stored
		this.Name = "Sri Purwaningsih";
		this.ID = "1000001";
		this.Degree = "Bachelor Informatics";
	}
}
