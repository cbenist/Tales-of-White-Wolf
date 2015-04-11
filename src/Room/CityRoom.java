package Room;


public class CityRoom extends Room
{

    public double generateRoomMonster(int zone)
    {
        if(zone == 4 || zone == 5)
        {
            return 10.0;
        }
        else
        {
            return 0;
        }
    }
}
