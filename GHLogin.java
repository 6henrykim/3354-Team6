/*
 * Module for Login Interface
 * For Globe Hopper Application
 * Module sets and authenticates user account
 * needs valid username and password
 */
public class GHLogin {
	
	// private variables for username and password
	private String username;
	private String password;
	
	// constructor for creating account
	public GHLogin(String u, String p) {
		username = u;
		password = p;
	}
	
	// central function called to authenticate account
	public boolean startGlobeHopper(String user, String pass) {
		
		// displays given username and password attempt
		System.out.print("Username: " + user + " " + "Password: ");
		
		for (int i = 0; i < pass.length(); i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		// if username and password are correct -> login complete
		if (user == this.username && pass == this.password) {
			System.out.println("Login Authenticated\nWelcome to GLOBE HOPPER!\n"); // success
			return true; // completes login
		} else {
			// if username incorrect ...
			if (user != this.username) {
				System.out.println("Login failed - Incorrect username"); // error message given
			}
			
			// if password incorrect
			if (pass != this.password) {
				System.out.println("Login failed - Incorrect password"); // error message given
			}
			
			System.out.println();
			return false; // login fails
		}
	}
}
