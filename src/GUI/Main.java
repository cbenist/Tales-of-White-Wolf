package GUI;

/**
 * Created by Colin on 3/29/2015.
 * version 1.0
 * Course ITEC 3860 Spring 2015
 *
 *The Purpose of this class is to be the User interface to the game
 *
 * This class calls the other classes to do things as needed
 */
import CharacterC.CharacterC;
import Item.Item;
import Room.Room;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Main extends Application {

    String inputText;
    CharacterC character;
    @Override
    public void start(final Stage primaryStage) throws Exception {

        //declare the various areas of the gui

        //output area
        final TextArea outputTA = new TextArea();
        outputTA.setWrapText(true);
        outputTA.setEditable(false);
        outputTA.setPrefHeight(320.0);

        //enemy stat area
        final TextArea enemyTA = new TextArea();
        enemyTA.setEditable(false);
        enemyTA.setPromptText("Enemy Stats");


        //character inventory and stats
        final TextArea inventoryTA = new TextArea();
        inventoryTA.setWrapText(true);
        inventoryTA.setEditable(false);
        inventoryTA.setPromptText("Inventory");


        //input field
        final TextField inputTF = new TextField();
        inputTF.setPromptText("Type Here");

        //character name field(for saves)
        final TextField characterFileName = new TextField();
        characterFileName.setPrefColumnCount(25);
        characterFileName.setPromptText("Please type in your character's name.");

        //character password(for saving/loading purposes)
        final TextField characterFilePassword = new TextField();
        characterFilePassword.setPrefColumnCount(25);
        characterFilePassword.setPromptText("Please type in your character's password.");

        //button to make a new character
        final Button createCharacter = new Button("New Game");

        //button to load character
        final Button getCharacter = new Button("Load Game");

        //arrange the 2 GUIs
        //character creation GUI
        VBox characterLeft = new VBox(15);
        characterLeft.getChildren().addAll(characterFileName, createCharacter);
        characterLeft.setAlignment(Pos.CENTER_RIGHT);

        VBox characterRight = new VBox(15);
        characterRight.getChildren().addAll(characterFilePassword, getCharacter);
        characterRight.setAlignment(Pos.CENTER_LEFT);

        final HBox creationMenu = new HBox(15);
        creationMenu.getChildren().addAll(characterLeft, characterRight);
        creationMenu.setAlignment(Pos.BOTTOM_CENTER);
        creationMenu.setVisible(true);

        //game interaction GUI
        VBox inputOutputVB = new VBox(15);
        inputOutputVB.getChildren().addAll(inputTF, outputTA);

        VBox enemyInventoryVB = new VBox(15);
        enemyInventoryVB.getChildren().addAll(enemyTA, inventoryTA);

        final HBox gameScreen = new HBox(15);
        gameScreen.getChildren().addAll(inputOutputVB, enemyInventoryVB);
        gameScreen.setVisible(false);

        //stackpane to switch from character creation to game interaction GUIs
        StackPane primaryStackPane = new StackPane();
        primaryStackPane.getChildren().addAll(creationMenu, gameScreen);

        //general layout
        BorderPane primaryBorderPane = new BorderPane();
        primaryBorderPane.setCenter(primaryStackPane);
        primaryBorderPane.setPadding(new Insets(20,20,20,20));

        //set the scene
        Scene primaryScene = new Scene(primaryBorderPane);
        primaryScene.setFill(Paint.valueOf("grey"));

        //set GUI info and start the GUI
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Tales of White Wolf");
        primaryStage.show();

        //start eventhandlers
        inputTF.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //allow for the player to press the enter key to send in their input
                if(keyEvent.getCode().equals(KeyCode.ENTER))
                {
                    //check to make sure the string is not null
                    if(inputTF.getLength() != 0)
                    {
                        //get the text from the input and add it to the output(as a record of what has been typed)
                        outputTA.appendText(inputTF.getText() + "\n");
                        inputText = inputTF.getText();
                        inputTF.clear();
                        //take the input and compare it to a list of commands
                        if(inputText.split(" ")[0].equalsIgnoreCase("commands"))
                        {
                            System.out.println("commands typed");
                            outputTA.appendText("Commands: help   move   equip   search   take   drop   attack\n");
                            outputTA.appendText("save   exit(leaves game)   load   directions   menu\n");
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("help"))
                        {
                            //get hints from puzzles and rooms
                            //outputTA.appendText(roomList[character.currentLocation].getHelp());
                            System.out.println("help typed");
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("move"))
                        {
                            System.out.println("move typed");
                            //call movement methods
                            if(inputText.split(" ")[1].equalsIgnoreCase("North") || inputText.split(" ")[1].equalsIgnoreCase("N"))
                            {
                                outputTA.appendText("You head North...\n");
                                //change enemy list to reflect current room.

                            }
                            else
                            {
                                outputTA.appendText("There is no path leading that direction.\n");
                            }
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("attack"))
                        {
                            System.out.println("attack typed");
                            //get character attack and health and monster attack and health
                            //change the health values based on attack values
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("take"))
                        {
                            System.out.println("take typed");
                            //check if item exists in the room
                            if(inputText.split(" ")[1].equalsIgnoreCase(null))
                            {

                                System.out.println("Successful take to inventory.");
                                //character.inventory.add(null);
                            }
                            else
                            {
                                System.out.println("item not added to inventory.");
                                outputTA.appendText("That item is not in this room.\n");
                            }
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("directions"))
                        {
                            System.out.println("directions typed");
                            //get the directions of the current room
                            //outputTA.appendText(roomList[character.currentLocation].getMoveDirection());
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("save"))
                        {
                            System.out.println("saved typed");
                            //initiate save
                            outputTA.appendText("This feature is currently a WIP and is unavailable at this time.");
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("exit"))
                        {
                            System.out.println("exit typed");
                            if(inputText.split(" ").length<2)
                            {
                                outputTA.appendText("Are you sure you want to exit? Any unsaved progress will be lost.\n");
                                outputTA.appendText("To exit type \"exit yes\" to save and exit type \"exit save\"\n");
                            }
                            else if(inputText.split(" ")[1].equalsIgnoreCase("save"))
                            {
                                System.out.println("save and exit");
                                //initiate save

                                //exit game
                                primaryStage.close();
                            }
                            else if(inputText.split(" ")[1].equalsIgnoreCase("yes"))
                            {
                                System.out.println("exit confirmed");
                                //exit game
                                primaryStage.close();
                            }
                            else
                            {
                                System.out.println("exit gibberish");
                                outputTA.appendText("That wasn't an option for exit\n");
                            }
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("search"))
                        {
                            System.out.println("search typed");
                            outputTA.appendText("While we're glad that you're clever enough to search for the unknown,\n");
                            outputTA.appendText("this feature is not yet implemented.\n");
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("menu"))
                        {
                            System.out.println("menu typed");
                            if(inputText.split(" ").length<2)
                            {
                                outputTA.appendText("Warning any unsaved progress will be lost.\n");
                                outputTA.appendText("To return to menu type \"menu yes\" to continue with your current" +
                                        " game type a valid command\n");
                            }
                            else if(inputText.split(" ")[1].equalsIgnoreCase("yes"))
                            {
                                System.out.println("menu confirmed");

                                //switch to menu
                                gameScreen.setVisible(false);
                                creationMenu.setVisible(true);

                                //clear outputTA to prevent inter-game dialogue
                                outputTA.clear();

                            }
                            else
                            {
                                outputTA.appendText("That is not a valid menu command.\n");
                            }
                        }
                        else
                        {
                            System.out.println("unknown typed");
                            //catch all for misspellings and invalid commands
                            outputTA.appendText("That is not a valid command. Type \"commands\" to find a list of commands\n");
                        }
                    }

                }
            }
        });

        createCharacter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                //create character save data
                character = new CharacterC(characterFileName.getText());

                ArrayList<Room> roomList = new ArrayList<Room>();

                //give story info
                outputTA.appendText("Welcome, " + character.getCharacterName() + " to the land of \n");
                outputTA.appendText("This land has long awaited the arrival of a true hero.\n");
                outputTA.appendText("The land has been pillaged by a dragon for the past three harvests.\n");
                outputTA.appendText("yatta yatta yatta... plot thickens... So will you save us hero?\n");
                outputTA.appendText("To begin your journey, speak to the bartender. His name is \"Commands\".\n");
                outputTA.appendText("---------------------------------------------------------------\n");

                //switch to interaction GUI
                creationMenu.setVisible(false);
                gameScreen.setVisible(true);
            }
        });

        getCharacter.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                character = new CharacterC(characterFileName.getText());
                //retrieve data from file

                //switch to game screen
                creationMenu.setVisible(false);
                gameScreen.setVisible(true);

                outputTA.appendText("This feature is currently a WIP and is unavailable at this time.\n");
                outputTA.appendText("Type \"menu\" to return to character creation.\n");
            }
        });
    }




    public static void main(String[] args) {
        //start GUI
        launch(args);
    }
}
