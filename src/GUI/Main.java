package GUI;

/**
 * Created by Colin on 3/29/2015.
 */
import CharacterC.CharacterC;
import javafx.application.Application;
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


public class Main extends Application {

    String inputText;
    @Override
    public void start(Stage primaryStage) throws Exception {

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

        HBox creationMenu = new HBox(15);
        creationMenu.getChildren().addAll(characterLeft, characterRight);
        creationMenu.setAlignment(Pos.BOTTOM_CENTER);
        creationMenu.setVisible(false);

        //game interaction GUI
        VBox inputOutputVB = new VBox(15);
        inputOutputVB.getChildren().addAll(inputTF, outputTA);

        VBox enemyInventoryVB = new VBox(15);
        enemyInventoryVB.getChildren().addAll(enemyTA, inventoryTA);

        HBox gameScreen = new HBox(15);
        gameScreen.getChildren().addAll(inputOutputVB, enemyInventoryVB);
        gameScreen.setVisible(true);

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
                            outputTA.appendText("Commands: help   move   equip   search   take   drop   attack\n");
                            outputTA.appendText("save   exit(to menu while in game//leave game while in menu)   load   ");
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("help"))
                        {

                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("move"))
                        {
                            if(inputText.split(" ")[1].equalsIgnoreCase("North") || inputText.split(" ")[1].equalsIgnoreCase("N"))
                            {
                                outputTA.appendText("You head North...\n");

                            }
                            else
                            {
                                outputTA.appendText("There is no path leading that direction.\n");
                            }
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("attack"))
                        {

                        }
                        else
                        {
                            outputTA.appendText("That is not a valid command. Type \"commands\" to find a list of commands\n");
                        }
                    }

                }
            }
        });
    }




    public static void main(String[] args) {
        CharacterC character = new CharacterC("default Name");
        launch(args);
    }
}
