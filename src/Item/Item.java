package Item;
/**Class: Item
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 1, 2015
 *
 *
 * This class - intersects the existence of all known items in the game
 *
 * Purpose: - acts as a parent to the three item children
 */

/**
 * @author karl
 *
 */
public class Item 
{
    private String itemName;

    public Item(String itemName)
    {
        this.itemName = itemName;
    }

    public Item()
    {
        this.itemName="";
    }
}
