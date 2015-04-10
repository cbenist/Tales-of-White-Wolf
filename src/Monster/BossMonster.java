package Monster;
/**Class: BossMonster
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
public class BossMonster extends Monster
{
	

	private boolean bossMonster;
	
	public BossMonster(double health1, boolean hasItem1, int cd, String monName, boolean bossMonster) 
	{
		super(health1, hasItem1, cd, monName);
		this.bossMonster = bossMonster;
		
		// TODO Auto-generated constructor stub
	}
	
	public boolean isBossMonster()
	{
		return true;
	}
	
	public boolean setBossMonster()
	{
		return true;
	}
}
