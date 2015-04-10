package Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Puzzle.Puzzles;

public class Room {
	
	// "No Monsters" or "No Puzzle" or "No Items" variables 
	String noMonster = "No Monsters";
	String noPuzzle = "No Puzzles";
	String noItem = "No Items";

	
	//ArrayList of Monster Class
	List<Monster> monsterList = new ArrayList<Monster>();

	//ArrayList of Item Class
	List<Item> itemList = new ArrayList<Item>();
	
	//ArrayList of Puzzle Class
	List<Puzzles> puzzleList = new ArrayList<Puzzles>();

	
	//Add a Monster
	public void addMonster (Monster m) 
	{
		monsterList.add(m);
	}	
	
	//Add an Item
	public void addItem (Item i) 
	{
		itemList.add(i);
	}
	
	//Add an Puzzle
	public void addPuzzle (Puzzles p) 
	{
		puzzleList.add(p);
	}
	
	String moveDirection;
	double monsterSpawnChance;
	double puzzleSpawnChance;
	double itemSpawnChance;
	Random ran;

	
	public void setMoveDirection (String direction)
	{
		moveDirection = direction;
	}
	
	public String getDirection()
	{
		
		return moveDirection;
	}
	
	public String searchRoom(String puzzleName, String monsterName)
	{
		
		return null;
	}
	
	public void generateRoomMonster(double monsterSpawnChance)
	{
		this.monsterSpawnChance = monsterSpawnChance;
	}
	
	public void generateRoomPuzzle(double puzzleSpawnChance)
	{
		this.puzzleSpawnChance = puzzleSpawnChance;
	}
	
	public void generateRoomItems(double itemSpawnChance)
	{
		this.itemSpawnChance = itemSpawnChance;
	}
	
}
