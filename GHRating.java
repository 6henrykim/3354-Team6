/*
 * Module for ratings
 * For Globe Hopper Tour Videos
 * takes input rating from user
 * validates between 0 stars and 5 stars
 * computes average and necessary information
 */
public class GHRating {
	
	// private variables for rating
	private int count;
	private double AVG;
	
	// constructor for specific video
	public GHRating() {
		this.count = 0;
		this.AVG = 0;
	}
	
	// central function for validating rating
	public boolean addRating(int newRating) {
		
		// if rating is less than 0 stars or greater than 5 stars
		if (newRating < 0 || newRating > 5) {
			System.out.println("Rating must be between 0 and 5 stars\nCannot be " + newRating); // error message
			return false; // rating addition fails
		}
		
		// if first entry of video
		if (count == 0) {
			this.count++;
			this.AVG = newRating;
		} else {
			// additional count made
			this.count++;
			// new average computed
			this.AVG = (AVG * (count - 1) + newRating) / (double)count;
		}
		
		// success message
		// displays new results
		System.out.println("Rating for this Tour is: " + this.AVG + "\n Last rating given is: " + newRating + "\n");
		
		return true; // success
	}
}
