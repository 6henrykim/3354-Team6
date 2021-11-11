import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * Unit Test for Login Module
 * On Globe Hopper Application
 * since username and password are both sets
 * two possibilities: correct set, or not correct set
 * together there are four possibilities
 * correct username and password
 * correct username with incorrect password
 * incorrect username correct password
 * incorrect username and password
 * 
 * both must be correct for success
 */
class GlobeHopperLoginTest {
	
	String user = "USERNAME";
	String pass = "pass123";
	
	// new accoutn created with username and password above
	GHLogin gh1 = new GHLogin(user, pass);

	@Test
	void test() {
		// first test checks correct username and password
		assertEquals("Here is the test for login authentication", true, gh1.startGlobeHopper("USERNAME", "pass123"));
		// results in success
	}
	
	@Test
	void test2() {
		// second test checks incorrect username
		assertEquals("Here is the test for login authentication", true, gh1.startGlobeHopper("FALSEusername", "pass123"));
		// results in failure
	}
	
	@Test
	void test3() {
		// third test checks incorrect password
		assertEquals("Here is the test for login authentication", true, gh1.startGlobeHopper("USERNAME", "password1234"));
		// results in failure
	}
	
	@Test
	void test4() {
		// fourth test checks incorrect username and password
		assertEquals("Here is the test for login authentication", true, gh1.startGlobeHopper("NOTUSERNAME", "pass456789"));
		// results in failure
	}

}
