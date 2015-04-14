package Puzzle;

import java.util.Random;

/**
 * Class: TrappedChestPuzzle
 * 
 * @author Rodny Joseph
 * @version 1.0 Course : ITEC 3860 Spring 2015 Written: April 1 2015
 * 
 *          This class – This class has the methods to generate rooms and keys
 *          for a puzzle
 * 
 *          Purpose: – This class will be a puzzle that user can choose between
 *          keys and the right key opens correct door
 */
public class TrappedChestPuzzle extends Puzzles {

	Random rand = new Random();
	int count;
	String bothRight = null;
	String bothLeft = null;
	String rightLeft = null;
	String leftRight = null;

	/**
	 * setKey Method
	 * 
	 * @param key
	 */
	// Sets the key
	public void setKey(String key) {
		if (key == "Both Right") {
			bothRight = key;

		} else if (key == "Both Left") {
			bothLeft = key;

		} else if (key == "Left Right") {
			leftRight = key;
		} else if (key == "Right Left") {
			rightLeft = key;
		}
	}

	/**
	 * getKey Method
	 */
	// Get the key
	public String getKey() {
		count = 1 + rand.nextInt(4);
		if (bothRight == null) {
			return bothRight;
		} else {
			return "Try Again:";
		}
	}

}
