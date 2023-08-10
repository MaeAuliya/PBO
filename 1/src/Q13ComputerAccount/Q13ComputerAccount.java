package Q13ComputerAccount;

public class Q13ComputerAccount {
	/*
	in this program is used for changing user password
	this program built from three strings : Realname, Username and Password.
	user can change his/her password and this program gonna show the newest password.
	*/

	String Realname, Username, Password; // declare the string
	
	public String Get_Realname() { //this function for storing realname
		return Realname;
	}
	
	public String Get_Username() { // this function fot storing username
		return Username;
	}
	
	public String Get_Password() { // this function for storing password
		return Password;
	}
	
	public void Change_MyPassword(String a) { // this function for storing the newest password
		this.Password = a;
	}

	public Q13ComputerAccount(){ // this function is a deafult user computer account
		this.Realname = "Maisan";
		this.Username = "Bardockzz";
		this.Password = "Bardock01";
	}
}