package CharacterC;

import java.util.ArrayList;

public class CharacterC {
    private ArrayList<Item.Item> inventory;

    private String characterName;

    private int characterLocation;

    private Item.Item equippedItem;

    private int characterStrength;

    public CharacterC(String name) {
        this.inventory = new ArrayList<Item.Item>();
        this.characterName = name;
        this.characterLocation = 0;
        this.equippedItem = null;
        this.characterStrength = 2;

    }

    public ArrayList<Item.Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item.Item> inventory) {
        this.inventory = inventory;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterLocation() {
        return characterLocation;
    }

    public void setCharacterLocation(int characterLocation) {
        this.characterLocation = characterLocation;
    }

    public Item.Item getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(Item.Item equippedItem) {
        this.equippedItem = equippedItem;
    }

    public int getCharacterStrength() {
        return characterStrength;
    }

    public void setCharacterStrength(int characterStrength) {
        this.characterStrength = characterStrength;
    }
}
