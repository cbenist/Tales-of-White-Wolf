package GUI;

/**
 * Created by Colin on 3/29/2015.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

        final TextArea outputTA = new TextArea();
        outputTA.setWrapText(true);
        outputTA.setEditable(false);
        outputTA.setPrefHeight(320.0);

        final TextArea enemyTA = new TextArea();
        enemyTA.setEditable(false);
        enemyTA.setPromptText("Enemy Stats");

        final TextArea inventoryTA = new TextArea();
        inventoryTA.setWrapText(true);
        inventoryTA.setEditable(false);
        inventoryTA.setPromptText("Inventory");

        final TextField inputTF = new TextField();
        inputTF.setPromptText("Type Here");


        final TextField characterFileName = new TextField();
        characterFileName.setPrefColumnCount(25);
        characterFileName.setPromptText("Please type in your character's name.");


        final TextField characterFilePassword = new TextField();
        characterFilePassword.setPrefColumnCount(25);
        characterFilePassword.setPromptText("Please type in your character's password.");

        final Button createCharacter = new Button("New Game");

        final Button getCharacter = new Button("Load Game");

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


        VBox inputOutputVB = new VBox(15);
        inputOutputVB.getChildren().addAll(inputTF, outputTA);

        VBox enemyInventoryVB = new VBox(15);
        enemyInventoryVB.getChildren().addAll(enemyTA, inventoryTA);

        HBox gameScreen = new HBox(15);
        gameScreen.getChildren().addAll(inputOutputVB, enemyInventoryVB);
        gameScreen.setVisible(true);


        StackPane primaryStackPane = new StackPane();
        primaryStackPane.getChildren().addAll(creationMenu, gameScreen);



        BorderPane primaryBorderPane = new BorderPane();
        primaryBorderPane.setCenter(primaryStackPane);
        primaryBorderPane.setPadding(new Insets(20,20,20,20));

        Scene primaryScene = new Scene(primaryBorderPane);
        primaryScene.setFill(Paint.valueOf("grey"));


        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Tales of White Wolf");
        primaryStage.show();

        inputTF.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode().equals(KeyCode.ENTER))
                {
                    if(inputTF.getLength() != 0)
                    {
                        outputTA.appendText(inputTF.getText() + "\n");
                        inputText = inputTF.getText();
                        inputTF.clear();

                        if(inputText.split(" ")[0].equalsIgnoreCase("help"))
                        {
                            if(inputText.split(" ")[1].equalsIgnoreCase("commands"))
                            {
                                outputTA.appendText("Commands: help   move   equip   search   take   drop   attack");
                                outputTA.appendText("");
                            }
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("move"))
                        {
                            if(inputText.split(" ")[1].equalsIgnoreCase("NW"))
                            {

                            }
                        }
                        else
                        {
                            outputTA.appendText("That is not a valid command. \"help commands\"");
                        }
                    }

                }
            }
        });
    }




    public static void main(String[] args) {
        launch(args);
    }
}
