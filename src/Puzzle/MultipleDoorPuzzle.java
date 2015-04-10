package Puzzle;
import java.util.Random;
import java.util.Scanner;

/**Class: MultipleDoorPuzzle
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 * 
 * This class – This class has the methods to generate a puzzle with multiple doors.
 * 
 * Purpose: – user has to find correct door
 */

public class MultipleDoorPuzzle 
{
	Random rand;
	Scanner scan;
	
	/**
	 * emptyRoom Method
	 */
	// Finds the correct room
	public void emptyRoom()
	{
		
		rand = new Random();
		scan = new Scanner(System.in);
		int count = 1 + rand.nextInt(6);
		System.out.println("There are 6 doors. 5 of the doors are empty/fake. One is real "
				+ "and will lead to an exit. Choose a room from 1 through 6.");
		int input = scan.nextInt();
		while(count != input){

			System.out.println("Fake Door. Try Again");
			input = scan.nextInt();

		}
		System.out.println("Correct Door. You may now Exit.");
	}
}
