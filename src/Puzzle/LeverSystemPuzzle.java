package Puzzle;

/**Class: LeverSystemPuzzle
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 * 
 * This class – This class has the methods to call the different levers.
 * 
 * Purpose: – This class will get the levers and the right one continues the game
 */
public class LeverSystemPuzzle extends Puzzles {
	
	String leverOne;
	String leverTwo;
	String leverThree;
	
	/**
	 * setLevers Method
	 * @param leverOne, leverTwo, leverThree
	 */
	// This method gets the lever
	public void setLevers(String leverOne,  String leverTwo, String leverThree){
		this.leverOne = leverOne;
		this.leverTwo = leverTwo;
		this.leverThree = leverThree;
	}
	
	/**
	 * getLever Method
	 */
	//This method will get the lever
	public String getLevers(){
		return null;
	}
}
