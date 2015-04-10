package Puzzle;

/**Class: Puzzle
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 * 
 * This class – This Puzzle class has the methods that the puzzles will inher. This class is the Parent
 * 
 * Purpose: – This class will contain the name methods to set and get names of puzzles.
 */

public class Puzzles 
{
	
	private String puzzleName;
	
	
	/**
	 * setPuzzleName Method
	 * @param puzzleName
	 */
	//Sets the puzzle name
	public void setPuzzleName(String puzzleName)
	{
		this.puzzleName = puzzleName;
	}

	/**
	 * getPuzzleName Method
	 */
	//gets the puzzle name
	public String getPuzzleName() {
		return puzzleName;
	}
	//setter getter boolean isSolved
	// when true, the game continue..
}
