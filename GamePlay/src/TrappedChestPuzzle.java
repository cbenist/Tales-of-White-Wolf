import java.util.Random;

public class TrappedChestPuzzle extends Puzzles {

	Random rand = new Random();
	int count;
	String bothRight = null;
	String bothLeft = null;
	String rightLeft = null;
	String leftRight = null;
	
	public void setKey(String key){
		if(key == "Both Right"){
			bothRight = key;
			
		}
		else if (key == "Both Left")
		{
			bothLeft = key;
			
		}
		else if (key == "Left Right")
		{
			leftRight = key;
		}
		else if (key == "Right Left")
		{
			rightLeft = key;
		}
	}
	
	public String getKey(){
		count = 1 + rand.nextInt(4);
		if (bothRight == null){
		return bothRight;}
		else
		{	
			return "Try Again:";
		}
	}
	
/*	public String turnBothRight(String bothRight)
	{
		count = 1 + rand.nextInt(4);
		if (count == 1){
		return bothRight;}
		else
		{	
			return "Try Again:";
		}
	}
	public String turnBothLeft(String bothLeft)
	{
		count = 1 + rand.nextInt(4);
		if (count == 2 ){
		return bothLeft;}
		else
		{	
			return "Try Again:";
		}
	}
	public String leftRight(String leftRight)
	{
		count = 1 + rand.nextInt(4);
		if (count == 3 ){
		return leftRight;}
		else
		{	
			return "Try Again:";
		}
	}
	public String rightLeft(String rightLeft)
	{
		count = 1 + rand.nextInt(4);
		if (count == 4 ){
		return rightLeft;}
		else
		{	
			return "Try Again:";
		}
		
	}
	*/
	
}
