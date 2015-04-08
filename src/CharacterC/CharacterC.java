package CharacterC;

import java.util.ArrayList;

public class CharacterC {
    private List<Item> inventory;

    private String characterName;

    private int characterLocation;

    private Item equippedItem;

    private int characterStrength;

    public Character(String name) {
        this.inventory = new ArrayList<Item>();
        this.characterName = name;
        this.characterLocation = 0;
        this.equippedItem = null;
        this.characterStrength = 2;

    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
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

    public Item getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem) {
        this.equippedItem = equippedItem;
    }

    public int getCharacterStrength() {
        return characterStrength;
    }

    public void setCharacterStrength(int characterStrength) {
        this.characterStrength = characterStrength;
    }
}
