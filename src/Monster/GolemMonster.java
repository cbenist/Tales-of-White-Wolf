package Monster;
/**Class: GolemMonster
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 3, 2015
 *
 *
 * This class - 
 *
 * Purpose: - 
 */

/**
 * @author karl
 *
 */
public class GolemMonster extends Monster
{
	private String golemType;
	
	public GolemMonster(double health1, boolean hasItem1, int cd, String monName)
	{
		super(health1, hasItem1, cd, monName);
	}
	
	public GolemMonster(double health1, boolean hasItem1, int cd, String monName, 
			 String golemType)
	{
		super(health1, hasItem1, cd, monName);
		this.golemType = golemType;
	}
		
		
		// TODO Auto-generated constructor stub
	
	
	public String getGolemType()
	{
		return golemType;
	}
	
	public void setGolemType(String golemType)
	{
		this.golemType = golemType;
	}
}
