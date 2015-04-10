package Puzzle;

/**Class: DecryptionPuzzle
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 * 
 * This class – This class has the methods to call the anagram puzzle
 * 
 * Purpose: – This class decrypt the puzzle and takes an anagram
 */

public class DecryptionPuzzle extends Puzzles {

	String anagram;
	/**
	 * anagram Method
	 * @param anagram
	 */
	//This method returns a anagram
	public String anagram( String anagram){
		this.anagram = anagram;
		return this.anagram;
	}
}
