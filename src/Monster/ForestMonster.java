package Monster;
/**Class: ForestMonster
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 6, 2015
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
public class ForestMonster extends Monster
{
	
	private String monsterName;
	
	public ForestMonster(double health1, boolean hasItem1, int cd, String monName)
	{
		super(health1, hasItem1, cd, monName);
	}
	
	
	
	
	
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public double attack(int currentDifficulty)
	{
		return currentDifficulty;
		
	}
}
