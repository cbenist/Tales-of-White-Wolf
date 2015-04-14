package Puzzle;

/**
 * Class: LockedDoor_CodePuzzle
 * 
 * @author Rodny Joseph
 * @version 1.0 Course : ITEC 3860 Spring 2015 Written: April 1 2015
 * 
 *          This class – This class has the methods to generate a puzzle to
 *          retrieve a code for a locked door.
 * 
 *          Purpose: – user will be able to retrieve code to continue
 */
public class LockedDoor_CodePuzzle extends Puzzles {

	String codeHint;

	/**
	 * setCodeHint Method
	 * 
	 * @param codeHint
	 */
	// sets a code hint
	public void setCodeHint(String codeHint) {
		this.codeHint = codeHint;
	}

	/**
	 * fetCodeHint Method
	 */
	// gets code hint
	public String getCodeHint() {
		return this.codeHint;
	}
}
