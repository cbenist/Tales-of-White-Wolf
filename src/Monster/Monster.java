package Monster;
/**Class: Monster
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
public class Monster 
{
	private double health = 0.0;
	private boolean hasItem = false;
	private Item i;
	private int currentDifficulty = 0;
	private String monsterName = "";
	
	public Monster(double health1, boolean hasItem1, int cd, String monName, Item i)
	{
		this.health = health1;
		this.hasItem = hasItem1;
		this.currentDifficulty = cd;
		this.monsterName = monName;
		this.i = i;
		
	}
	
	public Monster(double health1, boolean hasItem1, int cd, String monName)
	{
		this.health = health1;
		this.hasItem = hasItem1;
		this.currentDifficulty = cd;
		this.monsterName = monName;
		
	}

	public double getHealth() 
	{
		return health;
	}

	public boolean isHasItem() 
	{
		return hasItem;
	}
	
	public boolean onMonsterDeath(boolean hasItem)
	{
		if(hasItem)
		{
			roomItemList.add(this.i);
		}
	}

	public int getCurrentDifficulty() 
	{
		return currentDifficulty;
	}

	public String getMonsterName() 
	{
		return monsterName;
	}

	public void setHealth(double health) 
	{
		this.health = health;
	}

	public void setHasItem(boolean hasItem) 
	{
		this.hasItem = hasItem;
	}

	public void setCurrentDifficulty(int currentDifficulty) 
	{
		this.currentDifficulty = currentDifficulty;
	}

	public void setMonsterName(String monsterName) 
	{
		this.monsterName = monsterName;
	}
	
	
}
