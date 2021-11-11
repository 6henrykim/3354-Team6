import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * Unit Test for Rating Module
 * On Globe Hopper Tour Video Interface
 * since rating is a range
 * and ratings for this application must be between
 * 0 stars and 5 stars
 * there are 3 possible input values for ratings:
 * values less than 0
 * values between 0 and 5
 * values greater than 5
 * only values between 0 and 5 are valid
 * 
 */
class GlobeHopperRatingTest {
	
	// creates new test video to be rated
	GHRating t1 = new GHRating();

	@Test
	void test4() {
		// first test randomly adds 5 ratings between 0 and 5
		for (int i = 0; i < 5; i++) {
			int r = (int)(Math.random() * 5);
			// since all values between 0 and 5 are accepted ... 
			assertEquals("Here is the test for rating authentication", true, t1.addRating(r));
			// results in success
			// and displays the correct information
		}
	}
	
	@Test
	void test5() {
		// second test adds 5 ratings between -3 and 2
		for (int i = 0; i < 5; i++) {
			int r = (int)((Math.random() * 5) - 3);
			// only values between 0 and 2 will be accepted
			// detection of values less than 0 will terminate loop
			assertEquals("Here is the test for rating authentication", true, t1.addRating(r));
			// results in failure
		}
	}
	
	@Test
	void test6() {
		// third test adds 5 ratings between 3 and 8
		for (int i = 0; i < 5; i++) {
			// only values between 3 and 5 will be accepted
			int r = (int)((Math.random() * 5) + 3);
			// detection of values greater than 5 will terminate loop
			assertEquals("Here is the test for rating authentication", true, t1.addRating(r));
			// results in failure
		}
	}

}
