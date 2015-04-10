package Room;
import Room;

/**Class: CityRoom
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: Oct 11, 2012  
 * 
 * This class – The AddWeaponsRunnable class adds a randomly generated number
 * of weapons (from 0-4 inclusive) to a player
 * 
 * Purpose: – The class will run for as many iterations as the user provides for the parameter.
 * While it is running, it will call the addWeapons() method from Player that will add to the 
 * number of weapons that a player has, and then print a line stating the number of weapons 
 * added as well as the total number of weapons that a player has.
 * The method will only add something when the
 * ArrayList's size is less or equal to 5.
 * Then the program will sleep for the DELAY specified.
 */
public class CityRoom extends Room 
{
	
	public int generateRoomMosnter(int zone)
	{
		if(zone == 4 || zone == 5)
		{
		return 10;
		}
		else
			return 0;
	}
	
}