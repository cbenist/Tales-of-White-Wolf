package Puzzle;
import java.util.Random;


public class RiddlePuzzle extends Puzzles {
	
	private String riddleAnswer;
	String generateRiddle;
	int count = 0;
	String[] riddles;
	
	Random rand;
	
	public void setArray()
	{
		rand = new Random();
		riddles = new String[4];
		riddles[0]="What Can You Catch But Not Throw?";
		riddles[1]="What starts with the letter “t”, is filled with “t” and ends in “t”?";
		riddles[2]="What has hands but can not clap?";
		riddles[3]="We see it once in a year, twice in a week, and never in a day. What is it?";
		
		count = rand.nextInt(riddles.length);
		generateRiddle = riddles[count];
	}
		
	public void setAnswers()
	{
		
		if(count == 0)
		{
			riddleAnswer = " A Cold";		
		} 
		else if(count == 1)
		{
			riddleAnswer = " Teapot";
		}
		else if(count == 2)
		{
			riddleAnswer = " A Clock";
		}
		else if(count == 3)
		{
			riddleAnswer = " The Letter E ";
		}
	}
	
	public void setName()
	{
		setPuzzleName(" Puzzle Type: Riddle ");
	}
	
	public String getName()
	{
		
		return getPuzzleName();
	}
	
	public void setRiddle()
	{ 

		System.out.println(" " + generateRiddle + " " );

	}
	
	public String getRiddle()
	{
		return riddleAnswer;
	}
}
