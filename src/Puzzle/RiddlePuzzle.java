package Puzzle;

import java.util.Random;

/**
 * Created by Colin on 4/10/2015.
 */
public class RiddlePuzzle extends Puzzle
{
    private String riddleAnswer;
    private String generateRiddle;

    int count = 0;
    String[] riddles;

    Random rand;

    public void setArray()
    {
        rand = new Random();
        riddles = new String[4];
        riddles[0] = "What Can You Catch But Not Throw?";
        riddles[1] = "What starts with the letter 't', is filled with 't' and ends in 't'?";
        riddles[2] = "What has hands but can not clap?";
        riddles[3] = "We see it once in a year, twice in a week, and never in a day. What is it?";

        count = rand.nextInt(riddles.length);
        generateRiddle = riddles[count];

    }

}
