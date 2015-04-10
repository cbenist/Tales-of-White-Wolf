package Puzzle;

/**
 * Created by Colin on 4/10/2015.
 */
public class Puzzle
{
    private String puzzleName;

    private boolean isSolved;

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public String getPuzzleName() {
        return puzzleName;
    }

    public void setPuzzleName(String puzzleName) {
        this.puzzleName = puzzleName;
    }
}
