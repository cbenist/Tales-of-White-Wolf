
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