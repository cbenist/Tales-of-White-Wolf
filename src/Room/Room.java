package Room;
/**Class: Room
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � The Room class contains methods that sets directions, add to Arraylists and generate
 * and object for the other classes
 *
 * Purpose: � This class will have the items, monsters, puzzles, and other object that the
 * rooms will contain.
 */

import Monster.Monster;
import Puzzle.Puzzle;
import java.util.*;


public class Room
{
    // "No Monsters" or "No Puzzle" or "No Items" variables
    private String noMonster = "No Monsters";
    private String noPuzzle = "No Puzzles";
    private String noItem = "No Items";


    private String moveDirection;
    private double monsterSpawnChance;
    private double puzzleSpawnChance;
    private double itemSpawnChance;
    Random ran;

    List<Monster> monsterList = new ArrayList<Monster>();

    List<Item.Item> itemList = new ArrayList<Item.Item>();

    List<Puzzle> puzzleList = new ArrayList<Puzzle>();

    /**
     * addMonster Method
     * @param m
     */
    //Sets the puzzle name
    //Add a Monster
    public void addMonster (Monster monster)
    {
        monsterList.add(monster);
    }

    /**
     * addItem Method
     * @param i
     */
    //Sets the puzzle name
    //Add an Item
    public void addItem (Item.Item item)
    {
        itemList.add(item);
    }

    /**
     * addPuzzle Method
     * @param p
     */
    //Sets the puzzle name
    //Add an Puzzle
    public void addPuzzle(Puzzle puzzle)
    {
        puzzleList.add(puzzle);
    }

    /**
     * setMoveDirection Method
     * @param direction
     */
    // sets the derection
    public String getMoveDirection() {
        return moveDirection;
    }

    /**
     * getDirection Method
     *
     */
    //gets  direction
    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }


    public double getMonsterSpawnChance() {
        return monsterSpawnChance;
    }

    public void setMonsterSpawnChance(double monsterSpawnChance) {
        this.monsterSpawnChance = monsterSpawnChance;
    }

    public double getPuzzleSpawnChance() {
        return puzzleSpawnChance;
    }

    public void setPuzzleSpawnChance(double puzzleSpawnChance) {
        this.puzzleSpawnChance = puzzleSpawnChance;
    }

    public double getItemSpawnChance() {
        return itemSpawnChance;
    }

    public void setItemSpawnChance(double itemSpawnChance) {
        this.itemSpawnChance = itemSpawnChance;
    }

    /**
     * generateRoomMonster Method
     * @param monsterSpawnChance
     */
    //generate monster spawn chance
    public void generateRoomMonster(double monsterSpawnChance)
    {
        this.monsterSpawnChance = monsterSpawnChance;
    }

    /**
     * generateRoomPuzzle Method
     * @param puzzleSpawnChance
     */
    //generate Puzzle spawn chance
    public void generateRoomPuzzle(double puzzleSpawnChance)
    {
        this.puzzleSpawnChance = puzzleSpawnChance;
    }

    /**
     * generateRoomItem Method
     * @param itemSpawnChance
     */
    //generate Item spawn chance
    public void generateRoomItem(double itemSpawnChance)
    {
        this.itemSpawnChance = itemSpawnChance;
    }
}