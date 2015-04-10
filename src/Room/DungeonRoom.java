package Room;

/**Class: DungeonRoom
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � The DungeonRoom class has the method to generate a monster and the various percentages
 * for some rooms
 *
 * Purpose: � This class will generate a monster for the Room that is a Dungeon implementation.
 */

public class DungeonRoom extends Room {


    public double generateRoomMonster(int zone)
    {
        double value = 0;
        if(zone < 19)
        {
            System.out.println("Invalid Number");
        }
        else if(zone == 20)
        {
            value= 50.0;
        }
        else if(zone == 21)
        {
            value= 65.0;
        }
        else if(zone == 22)
        {
            value= 20.0;
        }
        else if(zone == 23)
        {
            value= 45.0;
        }
        else if(zone == 24)
        {
            value= 60.0;
        }
        else if(zone == 25)
        {
            value= 75.0;
        }
        else if(zone == 26)
        {
            value= 35.0;
        }
        else if(zone == 27)
        {
            value= 70.0;
        }
        else if(zone == 29)
        {
            value= 100.0;
        }
        else
        {
            value = 0;
        }
        return value;

    }

}
