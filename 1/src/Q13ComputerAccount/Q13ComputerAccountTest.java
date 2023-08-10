package Q13ComputerAccount;

import Q13ComputerAccount.Q13ComputerAccount;

public class Q13ComputerAccountTest {

	public static void main(String[] args) {
		
		/*
		 * this is for testing the program input and output
		 * the deafult data for this program (computer account) : 
		 * Realname = Maisan
		 * Username = Bardockzz
		 * Password = Bardock01
		*/
		
		Q13ComputerAccount account = new Q13ComputerAccount(); // initializing constructor 
		
		System.out.println(account.Get_Realname()); // print realname
		System.out.println(account.Get_Username()); // print Username
		System.out.println(account.Get_Password()); // Print Password
		System.out.println(""); // make some space between deafult user data account and the newest user data account (after changing the password)

		account.Change_MyPassword("Barbarian01"); // input new password
		
		System.out.println(account.Get_Realname()); // print realname
		System.out.println(account.Get_Username()); // print username
		System.out.println(account.Get_Password()); // print password (after change)
		
		/*
		 * so this is the output for the newest user data account (after password changed)
		 * Realname = Maisan
		 * Username = Bardockzz
		 * Password = Barbarian01
		 */
	}

}
