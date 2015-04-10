package Item;
/**Class: Weapon
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 1, 2015
 *
 *
 * This class - one of the items featured in the game
 *
 * Purpose: - takes on the "Weapon" entity
 */

/**
 * @author karl
 *
 */
public class Weapon extends Item
{
	private String weaponName;
	private double damageValue;
	
	/**
	 * The Weapon() default constructor
	 * Contains the default values for the weapon name and the damage of the weapon
	 */
	public Weapon()
	{
		this.weaponName = "null";
		damageValue = 0.0;
	}
	
	/**
	 * Method: getWeaponName
	 * @return the weapon's title
	 */
	public String getWeaponName()
	{
		return weaponName;
	
	}
	
	/**
	 * Method: setWeaponName
	 * @param weaponName the intended name for the weapon
	 */
	public void setWeaponName(String weaponName)
	{
		this.weaponName = weaponName;
	}
	
	/**
	 * Method: getDamageValue
	 * @return the degree of damage for its respective weapon
	 */
	public double getDamageValue()
	{
		return damageValue;
	}
	
	/**
	 * Method: setDamageValue
	 * @param damageValue the determined casualty factor 
	 */
	public void setDamageValue(double damageValue)
	{
		this.damageValue = damageValue;
	}
	
}
