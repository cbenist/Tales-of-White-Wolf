package Puzzle;

import java.util.Random;

/**
 * Created by Colin on 4/10/2015.
 */
public class TrappedChestPuzzle extends Puzzle
{
    Random rand = new Random();
    private int count;
    private String bothRight = null;
    private String bothLeft = null;
    private String rightLeft = null;
    private String leftRight = null;

    public void setKey(String key)
    {
        if(key.equalsIgnoreCase("Both Right"))
        {
            bothRight = key;
        }
        else if(key.equalsIgnoreCase("Both left"))
        {
            bothLeft = key;
        }
        else if(key.equalsIgnoreCase("Left Right"))
        {
            leftRight = key;
        }
        else if(key.equalsIgnoreCase("Right LEft"))
        {
            rightLeft = key;
        }
    }

    public String getKey()
    {
        count = 1 + rand.nextInt(4);
        if(bothRight == null)
        {
            return bothRight;
        }
        else
        {
            return "Try Again:";
        }
    }
}
