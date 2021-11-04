package keypad;
/**
 * File: csci1302/keypad/TestKeyPad.java
 * Package: keypad
 * @author Daniel Campa
 * Created on: Oct 25, 2021
 * Last Modified; Nov 4, 2021
 * Description:  Test the custom KeyPadPane class
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PAssign08 extends Application {
    Text display = new Text();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane mainPane = new Pane();
        StackPane holder = new StackPane();

        // create a KeyPadPane
        //KeyPadPane keyPane = new KeyPadPane(); // use for default layout
        //KeyPadPane keyPane = new KeyPadPane(true); // use this for phone layout
        KeyPadPanePlus keyPane = new KeyPadPanePlus(); // using custom version
        keyPane.setPadding(new Insets(100,100,100,100));
        keyPane.setHgap(15);
        keyPane.setVgap(15);
        keyPane.setMaxSize(100,200);
        keyPane.relocate(-40,100);
        Rectangle inner = new Rectangle(25, 90, 190, 100);
        inner.setFill(Color.SILVER);
        inner.setArcWidth(80);
        inner.setArcHeight(70);
        inner.relocate(30,95);
        Rectangle outer = new Rectangle(25, 90, 200, 275);
        outer.setFill(Color.BLACK);
        outer.setArcWidth(80);
        outer.setArcHeight(70);

        Text display = new Text();
        display.relocate(95,140);
        display.setFont(Font.font(30));
        //btnBlank2.setOnAction(e -> CalcEquation());


        // add KeyPane to BorderPane
        holder.setAlignment(Pos.CENTER);
        keyPane.setAlignment(Pos.CENTER);
        mainPane.getChildren().addAll(outer,inner, keyPane,display);

        // create your scene (400 x 400 to clearly show KeyPadPane)
        Scene scene = new Scene(mainPane, 400, 400);
        primaryStage.setTitle("Calc"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
//    private void CalcEquation() {
//        // Get values from text fields
//        double num1 =
//                Double.parseDouble(input1.getText());
//        double num2 = Double.parseDouble(input2.getText());
//
//
//        // Display monthly payment and total payment
//        switch(operator)
//        {
//            case '+':
//                display.setText(String.format(%.2f, num1 + num2);
//                break;
//
//            case '-':
//                display.setText(String.format(%.2f,num1 - num2);
//                break;
//
//            case '*':
//                display.setText(String.format(%.2f,num1 * num2);
//                break;
//
//            case '/':
//                display.setText(String.format(%.2f, num1 / num2);
//                break;
//        }
    //}
}
